// Generated from Simple.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull SimpleParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull SimpleParser.MemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull SimpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull SimpleParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(@NotNull SimpleParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(@NotNull SimpleParser.ClassDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SimpleParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull SimpleParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull SimpleParser.StatContext ctx);
}