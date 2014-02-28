// Generated from Expr.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull ExprParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#FactSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactSimple(@NotNull ExprParser.FactSimpleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#ExprProd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprProd(@NotNull ExprParser.ExprProdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(@NotNull ExprParser.PowerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Prod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(@NotNull ExprParser.ProdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(@NotNull ExprParser.SumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(@NotNull ExprParser.PrintExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Difference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference(@NotNull ExprParser.DifferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#ProdFact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdFact(@NotNull ExprParser.ProdFactContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ExprParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#FPNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFPNumber(@NotNull ExprParser.FPNumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Quot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuot(@NotNull ExprParser.QuotContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ExprParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Parenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(@NotNull ExprParser.ParenthesisContext ctx);
}