// Generated from D:/Github/mu/src/grammar/dohko_v1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dohko_v1Parser}.
 */
public interface dohko_v1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(dohko_v1Parser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(dohko_v1Parser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#layout}.
	 * @param ctx the parse tree
	 */
	void enterLayout(dohko_v1Parser.LayoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#layout}.
	 * @param ctx the parse tree
	 */
	void exitLayout(dohko_v1Parser.LayoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#box}.
	 * @param ctx the parse tree
	 */
	void enterBox(dohko_v1Parser.BoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#box}.
	 * @param ctx the parse tree
	 */
	void exitBox(dohko_v1Parser.BoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(dohko_v1Parser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(dohko_v1Parser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(dohko_v1Parser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(dohko_v1Parser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#contentList}.
	 * @param ctx the parse tree
	 */
	void enterContentList(dohko_v1Parser.ContentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#contentList}.
	 * @param ctx the parse tree
	 */
	void exitContentList(dohko_v1Parser.ContentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#contentItem}.
	 * @param ctx the parse tree
	 */
	void enterContentItem(dohko_v1Parser.ContentItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#contentItem}.
	 * @param ctx the parse tree
	 */
	void exitContentItem(dohko_v1Parser.ContentItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#composable}.
	 * @param ctx the parse tree
	 */
	void enterComposable(dohko_v1Parser.ComposableContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#composable}.
	 * @param ctx the parse tree
	 */
	void exitComposable(dohko_v1Parser.ComposableContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#materialComponent}.
	 * @param ctx the parse tree
	 */
	void enterMaterialComponent(dohko_v1Parser.MaterialComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#materialComponent}.
	 * @param ctx the parse tree
	 */
	void exitMaterialComponent(dohko_v1Parser.MaterialComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(dohko_v1Parser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(dohko_v1Parser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(dohko_v1Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(dohko_v1Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(dohko_v1Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(dohko_v1Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#templateExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateExpression(dohko_v1Parser.TemplateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#templateExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateExpression(dohko_v1Parser.TemplateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(dohko_v1Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(dohko_v1Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link dohko_v1Parser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(dohko_v1Parser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dohko_v1Parser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(dohko_v1Parser.ArrayElementsContext ctx);
}