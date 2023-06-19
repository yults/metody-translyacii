import java.io.File
import java.nio.file.Paths
import gen.gLexer
import gen.gParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>) {
    val lex = gLexer(
        CharStreams.fromPath(
            Paths.get("src/main/resources").resolve(args[0])))
    val parser = gParser(CommonTokenStream(lex))
    val translator = Translator()
    translator.visit(parser.file())
    File(Paths.get("src/main/resources").resolve("out").resolve(args[0]).toString()).bufferedWriter().use {
        it.write(translator.result)
    }
    println(translator.result)
}