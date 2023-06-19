import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    choseGram("src/declar.g4")
    choseGram("src/calculator.g4")
}

fun choseGram(name: String) {
    val parser = gParser(CommonTokenStream(gLexer(CharStreams.fromFileName(name))))
    val tree = parser.start()
    val treeg = tree.g1
    val generator = Generator(treeg)
    generator.generate()
    println("File: $name")
    println("FIRST: " + treeg.first)
    println("FOLLOW: " + treeg.follow)
    println()
}
