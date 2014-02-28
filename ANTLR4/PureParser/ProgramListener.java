// Generated from Program.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(@NotNull ProgramParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(@NotNull ProgramParser.ProductContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void enterStmnt(@NotNull ProgramParser.StmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void exitStmnt(@NotNull ProgramParser.StmntContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ProgramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ProgramParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ProgramParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ProgramParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProgramParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull ProgramParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull ProgramParser.FactorContext ctx);
}