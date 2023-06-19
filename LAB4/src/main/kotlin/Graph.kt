class Graph (private val node: Node) {
    private val output = StringBuilder()
    private var ofset = 0
    fun makeGraph(): String {
        output.clear()
        makeGraph(node)
        return  output.toString()
    }

    private fun makeGraph(node: Node) {
        repeat(ofset) {output.append("-> ")}
        output.appendLine(node.name)
        ofset++
        node.children.forEach { makeGraph(it) }
        ofset--
    }
}