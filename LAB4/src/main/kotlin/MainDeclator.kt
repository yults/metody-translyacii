
fun main() {
    val lexer = DeclarLexicalAnalyser()
    //val input = readlnOrNull()!!
    val input = "int a;"
    val parser = DeclarParser(lexer.getTokens(input))
    val graph = Graph(parser.parse_s())
    println("GRAPH: ")
    println(graph.makeGraph())
}
