// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(gParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(gParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(gParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(gParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(gParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#varr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarr(gParser.VarrContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#var1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar1(gParser.Var1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#var2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar2(gParser.Var2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#is1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs1(gParser.Is1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(gParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(gParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#if1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf1(gParser.If1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#else1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse1(gParser.Else1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCin(gParser.CinContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#ravar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRavar(gParser.RavarContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(gParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#return1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn1(gParser.Return1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(gParser.CmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(gParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(gParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cmprble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmprble(gParser.CmprbleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(gParser.StepContext ctx);
}