// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#gHeader}.
	 * @param ctx the parse tree
	 */
	void enterGHeader(gParser.GHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#gHeader}.
	 * @param ctx the parse tree
	 */
	void exitGHeader(gParser.GHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(gParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(gParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(gParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(gParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(gParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(gParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(gParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(gParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#termD}.
	 * @param ctx the parse tree
	 */
	void enterTermD(gParser.TermDContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#termD}.
	 * @param ctx the parse tree
	 */
	void exitTermD(gParser.TermDContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#netermD}.
	 * @param ctx the parse tree
	 */
	void enterNetermD(gParser.NetermDContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#netermD}.
	 * @param ctx the parse tree
	 */
	void exitNetermD(gParser.NetermDContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#netReturns}.
	 * @param ctx the parse tree
	 */
	void enterNetReturns(gParser.NetReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#netReturns}.
	 * @param ctx the parse tree
	 */
	void exitNetReturns(gParser.NetReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#netParams}.
	 * @param ctx the parse tree
	 */
	void enterNetParams(gParser.NetParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#netParams}.
	 * @param ctx the parse tree
	 */
	void exitNetParams(gParser.NetParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#netRule}.
	 * @param ctx the parse tree
	 */
	void enterNetRule(gParser.NetRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#netRule}.
	 * @param ctx the parse tree
	 */
	void exitNetRule(gParser.NetRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(gParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(gParser.ItemContext ctx);
}