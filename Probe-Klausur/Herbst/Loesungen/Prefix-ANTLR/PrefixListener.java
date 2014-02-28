// Generated from Prefix.g by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrefixParser}.
 */
public interface PrefixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrefixParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PrefixParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PrefixParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link PrefixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PrefixParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PrefixParser.ExprContext ctx);
}