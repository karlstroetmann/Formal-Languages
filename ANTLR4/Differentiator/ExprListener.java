// Generated from Expr.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(@NotNull ExprParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(@NotNull ExprParser.ProductContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ExprParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull ExprParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull ExprParser.FactorContext ctx);
}