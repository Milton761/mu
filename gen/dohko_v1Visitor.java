// Generated from D:/Github/mu/src/grammar/dohko_v1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dohko_v1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dohko_v1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(dohko_v1Parser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#layout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayout(dohko_v1Parser.LayoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#box}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBox(dohko_v1Parser.BoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(dohko_v1Parser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(dohko_v1Parser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#contentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentList(dohko_v1Parser.ContentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#contentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentItem(dohko_v1Parser.ContentItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#composable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposable(dohko_v1Parser.ComposableContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#materialComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialComponent(dohko_v1Parser.MaterialComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#componentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentName(dohko_v1Parser.ComponentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(dohko_v1Parser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(dohko_v1Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#templateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateExpression(dohko_v1Parser.TemplateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(dohko_v1Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link dohko_v1Parser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(dohko_v1Parser.ArrayElementsContext ctx);
}