// Generated from Grammatik.g4 by ANTLR 4.1

    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammatikParser}.
 */
public interface GrammatikListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull GrammatikParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull GrammatikParser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammatikParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(@NotNull GrammatikParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(@NotNull GrammatikParser.GrammarRuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammatikParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(@NotNull GrammatikParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(@NotNull GrammatikParser.ItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammatikParser#cfg}.
	 * @param ctx the parse tree
	 */
	void enterCfg(@NotNull GrammatikParser.CfgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#cfg}.
	 * @param ctx the parse tree
	 */
	void exitCfg(@NotNull GrammatikParser.CfgContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammatikParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull GrammatikParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull GrammatikParser.CommentContext ctx);
}