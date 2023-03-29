// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ICSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ICSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(ICSSParser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleDeclaration(ICSSParser.RuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropName(ICSSParser.PropNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(ICSSParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ICSSParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(ICSSParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ICSSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#boolVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(ICSSParser.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#colorVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorVar(ICSSParser.ColorVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#percentageVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentageVar(ICSSParser.PercentageVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#pixelVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPixelVar(ICSSParser.PixelVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#scalarVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarVar(ICSSParser.ScalarVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#varReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReference(ICSSParser.VarReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#litExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLitExpression(ICSSParser.LitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#classPicker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPicker(ICSSParser.ClassPickerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#tagPicker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagPicker(ICSSParser.TagPickerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#idPicker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPicker(ICSSParser.IdPickerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ICSSParser#ruleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBody(ICSSParser.RuleBodyContext ctx);
}