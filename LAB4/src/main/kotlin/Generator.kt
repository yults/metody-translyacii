import java.io.BufferedWriter
import java.io.File

class Generator (
    val grammar: Grammar,
    private val out: String = "C:\\Users\\natas\\Desktop\\3course\\lab4yultss\\src\\main\\kotlin\\out"
)
{
    private val name = grammar.name
    private val tokenCN = "${name}Token".replaceFirstChar { it.uppercase() }
    private val tokenEnumCN = "${name}TokenEnum".replaceFirstChar { it.uppercase() }
    private val lexicalAnalyserCN = "${name}LexicalAnalyser".replaceFirstChar { it.uppercase() }
    private val parserCN = "${name}Parser".replaceFirstChar { it.uppercase() }

    fun generate() {
        ifLL()
        grammar.genFirstStart()
        grammar.genFollow()
        generateToken()
        generateTokenEnum()
        generateLexicalAnalyser()
        generateParser()
        generateOps()
    }

    private fun ifLL() {
        for (neterm in grammar.neterms) {
            for (rule in neterm.rules) {
                for (rule2 in neterm.rules) {
                    if (rule == rule2) continue
                    val first = grammar.getFirst(rule.items).toSet()
                    val first2 = grammar.getFirst(rule2.items).toSet()
                    if (first.intersect(first2).isNotEmpty()) {
                        throw Exception("Grammar is not LL(1)")
                    }
                    if("EPS" in first && grammar.follow[neterm.name] != null && first2.intersect(grammar.getFollow(neterm.name)).isNotEmpty()) {
                        throw Exception("Grammar is not LL(1)")
                    }
                }
            }
        }
    }

    private fun generateToken() {
        val file = File("$out\\$tokenCN.kt")
        file.createNewFile()
        file.writeText(
            """
            class $tokenCN(
                val type: $tokenEnumCN? = null,
                val data: String? = null
            )
            """.trimIndent()
        )
    }

    private fun generateTokenEnum() {
        val file = File("$out\\${tokenEnumCN}.kt")
        file.createNewFile()
        file.writeText(
            """
            enum class $tokenEnumCN {
                ${grammar.terms.joinToString(", ") { it.name!! }}, EOF
            }
            """.trimIndent()
        )
    }

    private fun generateLexicalAnalyser() {
        val file = File("$out\\$lexicalAnalyserCN.kt")
        file.createNewFile()
        file.bufferedWriter().use { out ->
            out.write(
                """
                class $lexicalAnalyserCN {
                    private var len = 0
                    private var curPos: Int = 0
                    private var data: String? = null
                    private var str:String = ""

                    fun getTokens(s: String): List<$tokenCN> {
                        len = s.length
                        str = s

                        val tokens = mutableListOf<$tokenCN>()
                        var token: $tokenCN?
                        do {
                            token = getNextToken()
                            if (token != null) tokens.add(token)
                        } while (token != null)
                        return tokens + $tokenCN($tokenEnumCN.EOF)
                    }
                    
                    private fun find(value: String): Boolean {
                        val regex = value.toRegex()
                        val match = regex.find(str, curPos)
                        data = match?.value
                        return match != null && match.range.first == curPos
                    }

                    private fun getNextToken(): $tokenCN? {
                        while (curPos < len && str[curPos].isWhitespace()) {
                            curPos++
                        }

                        if (curPos == len) {
                            return null
                        }

                        return when {

                """.trimIndent()
            )
            grammar.terms.forEach {
                out.write("\t\t\tfind(\"${it.reg}\") -> $tokenCN($tokenEnumCN.${it.name}, data).also{ curPos += data!!.length }\n")
            }
            out.write(
                """
                        else -> throw Exception("Unexpected symbol at curPos ${'$'}curPos")
                    }
                }
            }
                """.trimIndent()
            )
        }
    }

    private fun generateParser() {
        val file = File("$out\\${parserCN}.kt")
        file.createNewFile()
        file.bufferedWriter().use { out ->
            if (grammar.header != null) {
                out.write("${grammar.header}\n"
                    .replace("\\{", "{")
                    .replace("\\}", "}")
                )
            }
            out.write("class $parserCN(private val tokens: List<${tokenCN}>) {\n")
            if (grammar.members != null) {
                out.write("${grammar.members}\n"
                    .replace("\\{", "{")
                    .replace("\\}", "}")
                )
            }
            out.write(
                """
                private var curPos = 0

                private fun skipToken() = curPos++
                private fun currentToken() = tokens[curPos]
                
                private fun expectedToken(expectedToken: $tokenEnumCN) {
                    if (currentToken().type != expectedToken) {
                        throw Exception("expected: ${'$'}${'{'}expectedToken${'}'} actual: ${'$'}${'{'}currentToken().type${'}'}")
                    }
                }

                """.trimIndent().prependIndent("\t")
            )
            out.write("\n")
            grammar.neterms.forEach {
                writeNeterm(out, it)
            }
            grammar.terms.forEach {
                writeTerm(out, it)
            }
            out.write("}")
        }
    }

    private fun writeTerm(out: BufferedWriter, term: Term) {
        out.write("\n")
        out.write(
            """
        fun parseTerm_${term.name}(text: string): Node {
            expectedToken(${tokenEnumCN}.${term.name})
            text.value = currentToken().data!!
            skipToken()
            return Node("T_${term.name}", listOf(Node(text.value)))
        }
        """.trimIndent().prependIndent("\t")
        )
        out.write("\n")
    }

    private fun writeNeterm(out: BufferedWriter, nt: Neterm) {

        require(nt.rules.isNotEmpty())
        val args = nt.params + nt.returns
        out.write(
            "\tfun parse_${nt.name}" +
                    "(${args.joinToString(", ") { (type, name) -> "$name: $type" }}): Node{\n"
        )
        if (nt.init != null) {
            out.write(nt.init!!)
            out.write("\n")
        }
        out.write("\t\treturn when (currentToken().type) {\n")
        var hasEps = false
        var epsItem: Item? = null
        nt.rules.forEach {
            val (item: Item?, key: Boolean) = writeRule(out, nt, it)
            if (key && !hasEps) {
                hasEps = true
                epsItem = item
            }
        }
        if (hasEps) {
            val follow = grammar.follow[nt.name!!]
            follow!!.forEach {
                out.write("\t\t\t${tokenEnumCN}.${it} -> {")
                if (epsItem != null) writeCode(out, epsItem!!,"\t\t\t\t")
                out.write(
                    """
                        Node("EPS")
                    }
                """.trimIndent().prependIndent("\t\t\t")
                )
                out.write("\n")
            }
        }
        out.write("\n")
        out.write(
            """
                    else -> throw Exception("Unexpected token in a state")
                }
            }
        """.trimIndent().prependIndent("\t")
        )
        out.write("\n\n")
    }

    private fun writeRule(out: BufferedWriter, nt: Neterm, rule: Rule): Pair<Item?, Boolean> {
        require(rule.items.isNotEmpty())

        val found: Term? = grammar.terms.find { it.name == rule.items[0].name }
        if (found != null) {
            out.write("\t\t\t${tokenEnumCN}.${found.name} -> {")
            rule.items.forEach {
                writeItem(out, it)
            }
            out.write(
                """
                    
                    Node("T_${nt.name}", listOf(
                        ${rule.items.joinToString(", ") { it.name ?: "" }}
                    ))
                }
                """.trimIndent().prependIndent("\t\t\t")
            )
            out.write("\n")
            return Pair(null, false)
        } else {
            if (rule.items[0].name == "EPS") {
                return Pair(rule.items[0], true)
            }
            val curNt: Neterm =
                grammar.neterms.find { it.name == rule.items[0].name } ?: throw Exception("Incorrect name in a rule\n")

            require(curNt.rules.isNotEmpty())

            val first: MutableSet<String> = grammar.first[rule.items[0].name]!!

            first.forEach {
                if (it != "EPS") {
                    out.write("\t\t\t${tokenEnumCN}.${it} -> {\n")
                    rule.items.forEach { item ->
                        writeItem(out, item)
                    }

                    out.write(
                        """
                        
                        Node("T_${nt.name}", listOf(
                            ${rule.items.joinToString(", ") { item -> item.name ?: "" }}
                        ))
                    }
                    """.trimIndent().prependIndent("\t\t\t")
                    )
                    out.write("\n")
                }
            }

            return Pair(null, first.contains("EPS"))
        }
    }

    private fun writeItem(out: BufferedWriter, item: Item) {
        val found: Term? = grammar.terms.find { it.name == item.name }
        if (found != null) {
            val curTerm: Term = found
            out.write(
                """

                val ${curTerm.name}_text: string = string()
                
                val ${curTerm.name}: Node = parseTerm_${curTerm.name}(${curTerm.name}_text)
            """.trimIndent().prependIndent("\t\t\t\t")
            )
            out.write("\n")
            writeCode(out, item, "\t\t\t\t")

        } else {
            val curNt: Neterm =
                grammar.neterms.find { it.name == item.name } ?: throw Exception("Incorrect name in a rule\n")
            curNt.returns.forEach { (type, name) ->
                out.write("\t\t\t\tval ${curNt.name}_${name}: $type = $type()\n")
            }
            out.write("\n\t\t\t\tval ${curNt.name}: Node = parse_${curNt.name}(")
            if (item.params != null) {
                out.write(item.params!!.replace('.', '_').replace("$", ".value"))
                if (curNt.returns.isNotEmpty()) {
                    out.write(", ")
                }
            }
//            out.write("\n")
            out.write(curNt.returns.joinToString(", ") { (_, name) -> "${curNt.name}_${name}" })
            out.write(")")
            out.write("\n")
            writeCode(out, item, "\t\t\t\t")
        }
    }

    private fun writeCode(out: BufferedWriter, item: Item, prefix: String) {
        if (item.code == null) return
        out.write("\n$prefix${item.code!!
            .replace("\\{", "{")
            .replace("\\}", "}")
//            .replace("\\\\", "\\")
            .replace(".text", "_text")
            .replace("$", ".value").trimIndent()}\n")
    }

    private fun generateOps() {
        val file = File("$out\\Ops.kt")
        file.createNewFile()
        file.bufferedWriter().use { out ->
            out.write("class Node(val name: String, val children: List<Node> = emptyList())\n\n")
            out.write("class string(var value: String = \"\")\n\n")
            out.write(
                """
                class int(var value: Int = 0) {
                    operator fun plus(arg: int): int {
                        return int(this.value + arg.value)
                    }
    
                    operator fun minus(arg: int): int {
                        return int(this.value - arg.value)
                    }
    
                    operator fun times(arg: int): int {
                        return int(this.value * arg.value)
                    }
    
                    operator fun div(arg: int): int {
                        return int(this.value / arg.value)
                    }
    
                    operator fun unaryMinus(): int {
                        return int(-this.value)
                    }
                }
            """.trimIndent()
            )
        }
    }
}
