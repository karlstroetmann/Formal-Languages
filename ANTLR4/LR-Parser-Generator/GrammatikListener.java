// Generated from Grammatik.g by ANTLR 4.1

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
	 * Enter a parse tree produced by {@link GrammatikParser#grammatik}.
	 * @param ctx the parse tree
	 */
	void enterGrammatik(@NotNull GrammatikParser.GrammatikContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#grammatik}.
	 * @param ctx the parse tree
	 */
	void exitGrammatik(@NotNull GrammatikParser.GrammatikContext ctx);

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
	 * Enter a parse tree produced by {@link GrammatikParser#myRule}.
	 * @param ctx the parse tree
	 */
	void enterMyRule(@NotNull GrammatikParser.MyRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#myRule}.
	 * @param ctx the parse tree
	 */
	void exitMyRule(@NotNull GrammatikParser.MyRuleContext ctx);
}