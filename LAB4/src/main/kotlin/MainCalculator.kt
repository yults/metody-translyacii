
fun main() {
    val lexer = CalculatorLexicalAnalyser()
    //val input = readlnOrNull()!! read from console
    val input = "1-2-3"
    println("ANS:")
    val parser = CalculatorParser(lexer.getTokens(input))
    val graph = Graph(parser.parse_start())
    println("GRAPH: ")
    println(graph.makeGraph())
}