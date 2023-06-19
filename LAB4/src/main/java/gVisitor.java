// Generated from java-escape by ANTLR 4.11.1
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
	 * Visit a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(gParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#gHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGHeader(gParser.GHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(gParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(gParser.MembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(gParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(gParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#termD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermD(gParser.TermDContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#netermD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetermD(gParser.NetermDContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#netReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetReturns(gParser.NetReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#netParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetParams(gParser.NetParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#netRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetRule(gParser.NetRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(gParser.ItemContext ctx);
}