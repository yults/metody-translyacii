// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(gParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(gParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(gParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(gParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(gParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(gParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(gParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(gParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(gParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(gParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#varr}.
	 * @param ctx the parse tree
	 */
	void enterVarr(gParser.VarrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#varr}.
	 * @param ctx the parse tree
	 */
	void exitVarr(gParser.VarrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#var1}.
	 * @param ctx the parse tree
	 */
	void enterVar1(gParser.Var1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#var1}.
	 * @param ctx the parse tree
	 */
	void exitVar1(gParser.Var1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#var2}.
	 * @param ctx the parse tree
	 */
	void enterVar2(gParser.Var2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#var2}.
	 * @param ctx the parse tree
	 */
	void exitVar2(gParser.Var2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#is1}.
	 * @param ctx the parse tree
	 */
	void enterIs1(gParser.Is1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#is1}.
	 * @param ctx the parse tree
	 */
	void exitIs1(gParser.Is1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(gParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(gParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#if1}.
	 * @param ctx the parse tree
	 */
	void enterIf1(gParser.If1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#if1}.
	 * @param ctx the parse tree
	 */
	void exitIf1(gParser.If1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#else1}.
	 * @param ctx the parse tree
	 */
	void enterElse1(gParser.Else1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#else1}.
	 * @param ctx the parse tree
	 */
	void exitElse1(gParser.Else1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cin}.
	 * @param ctx the parse tree
	 */
	void enterCin(gParser.CinContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cin}.
	 * @param ctx the parse tree
	 */
	void exitCin(gParser.CinContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ravar}.
	 * @param ctx the parse tree
	 */
	void enterRavar(gParser.RavarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ravar}.
	 * @param ctx the parse tree
	 */
	void exitRavar(gParser.RavarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(gParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(gParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#return1}.
	 * @param ctx the parse tree
	 */
	void enterReturn1(gParser.Return1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#return1}.
	 * @param ctx the parse tree
	 */
	void exitReturn1(gParser.Return1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(gParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(gParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(gParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(gParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(gParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(gParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cmprble}.
	 * @param ctx the parse tree
	 */
	void enterCmprble(gParser.CmprbleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cmprble}.
	 * @param ctx the parse tree
	 */
	void exitCmprble(gParser.CmprbleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(gParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(gParser.StepContext ctx);
}