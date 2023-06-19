import java.lang.StringBuilder
import gen.gBaseVisitor
import gen.gParser
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.TerminalNode
import java.nio.file.WatchService

class Translator: gBaseVisitor<Unit>() {
    private val ans = StringBuilder()
    private var tabDepth = 0
    private val tabs: String
        get() {
            return TAB.repeat(tabDepth)
        }
    val result: String
        get() {
            return ans.toString()
        }

    companion object {
        private const val NL = "\n"
        private const val WS = " "
        private const val TAB = "    "
    }

    override fun visitTerminal(tnode: TerminalNode?) {
        tnode ?: return
        if (tnode.symbol.type != Token.EOF) {
            ans.append(tnode.text)
        }
    }

    override fun visitFile(ctx: gParser.FileContext?) {
        //file: include* namespace main EOF;
        val includes = ctx?.include()
        if (includes != null && includes.size != 0) {
            for (include in includes) {
                visit(include)
            }
            ans.append(NL)
        }
        visit(ctx?.namespace())
        visit(ctx?.main())
    }

    override fun visitInclude(ctx: gParser.IncludeContext?) {
        //include: INCLUDE LA VARAIBLE RA;
        ctx ?: return
        ans.append("#include").append(WS).append("<")
        ans.append(ctx.VARAIBLE().text)
        ans.append(">").append(NL)
    }

    override fun visitNamespace(ctx: gParser.NamespaceContext?) {
        //namespace: NAMESPACE STD;
        ctx ?: return
        ans.append("using").append(WS).append("namespace")
        ans.append(WS).append(ctx.VARAIBLE().text).append(";").append(NL).append(NL)
    }

    override fun visitMain(ctx: gParser.MainContext?) {
        //main:INT MAIN LR RR LF body* RF;
        ctx ?: return
        ans.append("int").append(WS).append("main")
        ans.append("(").append(")").append(WS)
        ans.append("{").append(NL)
        tabDepth++
        for (entity in ctx.body()) {
            ans.append(tabs)
            visit(entity)
        }
        tabDepth--
        ans.append("}")
    }

    override fun visitBody(ctx: gParser.BodyContext?) {
        //body: cin | varr | if1 | return | for;
        ctx ?: return
        val children = ctx.children
        if (children != null && children.size != 0) {
            for (ch in children) {
                visit(ch)
            }
        }
    }

    override fun visitReturn1(ctx: gParser.Return1Context?) {
        ans.append("return").append(WS)
        visit(ctx?.value())
        ans.append(";").append(NL)
    }

    override fun visitCin(ctx: gParser.CinContext?) {
        //cin: CIN ravar* SEMICOLON;
        ctx ?: return
        ans.append("cin")
        val ravar = ctx.ravar()
        if (ravar != null && ravar.size != 0) {
            for (ra in ravar) {
                visit(ra)
            }
        }
        ans.append(";").append(NL)
    }

    override fun visitRavar(ctx: gParser.RavarContext?) {
        //ravar: RA RA VARAIBLE;
        ctx ?: return
        ans.append(WS).append(">>").append(WS).append(ctx.VARAIBLE().text)
    }

    override fun visitIf1(ctx: gParser.If1Context?) {
        ans.append("if").append(WS)
        visit(ctx?.bool())
        ans.append(WS).append("{").append(NL)
        tabDepth++
        for (entity in ctx?.body()!!) {
            ans.append(tabs)
            visit(entity)
        }
        tabDepth--
        ans.append(tabs)
        ans.append("}")
        val els = ctx.else1()
        if (els !== null)
            visit(els)
        else ans.append(NL)
    }

    override fun visitBool(ctx: gParser.BoolContext?) {
        ctx ?: return
        val children = ctx.children
        if (children[0].text == "(") {
            ans.append("(")
            visit(children[1])
            ans.append(")")
            return
        }
        children.forEach { visit(it) }
    }

    override fun visitCondition(ctx: gParser.ConditionContext?) {
        ctx ?: return
        val children = ctx.children
        visit(children[0])
        ans.append(WS)
        visit(children[1])
        ans.append(WS)
        visit(children[2])
    }

    override fun visitCmprble(ctx: gParser.CmprbleContext?) {
        ctx ?: return
        ans.append(ctx.text)
    }
    override fun visitElse1(ctx: gParser.Else1Context?) {
        ans.append(WS).append("else").append(WS).append("{").append(NL)
        tabDepth++
        for (entity in ctx?.body()!!) {
            ans.append(tabs)
            visit(entity)
        }
        tabDepth--
        ans.append(tabs)
        ans.append("}").append(NL)
    }

    override fun visitVarr(ctx: gParser.VarrContext?) {
        ctx ?: return
        visit(ctx.type())
        val children = ctx.children
        if (children.size > 2) {
            visit(children[1])
            val size = children.size - 2
            for (i in 1 until size) {
                if (children[i + 1].text[0] == ',') {
                    ans.append(",").append(WS)
                }
                else
                visit(children[i + 1])
            }
        }
        ans.append(";").append(NL)
    }

    override fun visitVar1(ctx: gParser.Var1Context?) {
        ctx ?: return
        ans.append(ctx.VARAIBLE().text)
        val children = ctx.children
        if (children.size > 1 && children[1].text[0] == '=') {
            visit(ctx.is1())
        }
    }
    override fun visitVar2(ctx: gParser.Var2Context?) {
        ctx ?: return
        ans.append(ctx.VARAIBLE().text)
        val children = ctx.children
        if (children.size > 1 && children[1].text[0] == '=') {
            visit(ctx.is1())
        }
        ans.append(';').append(NL)
    }

    override fun visitIs1(ctx: gParser.Is1Context?) {
        ctx ?: return
        ans.append(WS).append("=").append(WS)
        visit(ctx.value())
    }

    override fun visitValue(ctx: gParser.ValueContext?) {
        ctx ?: return
        val children = ctx.children
        visit(children[0])
    }

    override fun visitType(ctx: gParser.TypeContext?) {
        ctx ?: return
        ans.append(ctx.text).append(WS)
    }

    override fun visitFor(ctx: gParser.ForContext?) {
        ans.append("for").append(WS).append("(")
        visit(ctx?.type())
        visit(ctx?.var1())
        ans.append(";").append(WS)
        visit(ctx?.condition())
        ans.append(";").append(WS).append(ctx?.VARAIBLE()!!.text)
        visit(ctx?.step())
        ans.append(")").append(WS).append("{").append(NL)
        tabDepth++;
        for (entity in ctx?.body()!!) {
            ans.append(tabs)
            visit(entity)
        }
        tabDepth--;
        ans.append(tabs).append("}").append(NL)
    }

    override fun visitStep(ctx: gParser.StepContext?) {
        ctx ?: return
        ans.append(ctx.text)
    }

    override fun visitExpr(ctx: gParser.ExprContext?) {
        ctx ?: return
        val children = ctx.children
        visit(children[0])
        ans.append(WS)
        visit(children[1])
        ans.append(WS)
        visit(children[2])
    }
}

/*println(children[0].text[0])
        if (children[0].text[0] == 'c' && children[0].text[1] == 'i') {
            visit(ctx.cin())
            return
        }
        else if (children[0].text[0] == 'i' && children[0].text[1] == 'f') {
            visit(ctx.if1())
            return
        }
        //else_if: ELSE IF LR bool RR LF body* RF;
        //ComTblock: '/*' .*? '*/' -> skip;
        //ComLine: '//' ~ [\r\n]* -> skip;

        else if (children[0].text[0] == 'r' && children[0].text[1] == 'e') {
            visit(ctx.return1())
        }*/