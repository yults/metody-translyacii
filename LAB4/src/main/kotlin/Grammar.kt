import kotlin.collections.MutableList as MutableList1

class Grammar (
    var name: String? = null,
    var header: String? = null,
    var members: String? = null,
    var terms: MutableList1<Term> = mutableListOf(),
    var neterms: MutableList1<Neterm> = mutableListOf(),
) {

    fun addTerm(term: Term) = terms.add(term)
    fun addNeterm(nonterm: Neterm) = neterms.add(nonterm)
    var first = mutableMapOf<String, MutableSet<String>>()
    var follow: MutableMap<String, MutableSet<String>> = mutableMapOf()
    //FIRST(a)= {c|a=>* cb} множ символов с которых может начинаться то что выведем из a
    //а - строка из терминалов и нетерминалов
    fun genFirstStart() {
        first = mutableMapOf()
        neterms.forEach { neterm ->
            first[neterm.name!!] = mutableSetOf()
        }
        var change: Boolean
        do {
            change = false
            neterms.forEach { neterm ->
                val sz = first[neterm.name]!!.size
                neterm.rules.forEach {
                    first[neterm.name]!! += getFirst(it.items)
                    change = change || (sz != first[neterm.name]!!.size)
                }
            }
        } while (change)
    }

    internal fun getFirst(items: MutableList1<Item>): List<String> {
        if (items.isEmpty() || items[0].name == "EPS") {
            return listOf("EPS")
        }
        if (terms.find { it.name == items[0].name } != null) {
            return listOf(items[0].name!!)
        }
        return (first[items[0].name!!]!! - "EPS").toList() +
                if ("EPS" in first[items[0].name!!]!!) {
                    getFirst(items.drop(1).toMutableList()
                    )
                } else listOf()
    }

    //FOLLOW(A)= {c | S =>* aA < b} множ первых символов которые могут встретиться после нетерминала A
    fun genFollow() {
        neterms.forEach {
            follow[it.name!!] = mutableSetOf()
        }
        follow[neterms[0].name!!]!! += "EOF"
        var change: Boolean
        do {
            change = false
            neterms.forEach { neterm ->
                neterm.rules.forEach { rule ->
                    rule.items.forEachIndexed { idx, item ->
                        if (neterms.find { it.name == item.name } != null) {
                            val sz = follow[item.name]!!.size
                            val t = getFirst(rule.items.drop(idx + 1).toMutableList())
                            follow[item.name]!! += (t - "EPS").toList()
                            if ("EPS" in t) {
                                follow[item.name]!! += follow[neterm.name]!!
                            }
                            change = change || (sz != follow[item.name]!!.size)
                        }
                    }
                }
            }
        } while (change)
    }

    public fun getFollow(name: String?): MutableSet<String> {
        return follow[name]!!
    }

}