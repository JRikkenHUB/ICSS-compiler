// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICSSParser}.
 */
public interface ICSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(ICSSParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(ICSSParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRuleDeclaration(ICSSParser.RuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#ruleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRuleDeclaration(ICSSParser.RuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#propName}.
	 * @param ctx the parse tree
	 */
	void enterPropName(ICSSParser.PropNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#propName}.
	 * @param ctx the parse tree
	 */
	void exitPropName(ICSSParser.PropNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(ICSSParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(ICSSParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ICSSParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ICSSParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(ICSSParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(ICSSParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ICSSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ICSSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(ICSSParser.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#boolVar}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(ICSSParser.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#colorVar}.
	 * @param ctx the parse tree
	 */
	void enterColorVar(ICSSParser.ColorVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#colorVar}.
	 * @param ctx the parse tree
	 */
	void exitColorVar(ICSSParser.ColorVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#percentageVar}.
	 * @param ctx the parse tree
	 */
	void enterPercentageVar(ICSSParser.PercentageVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#percentageVar}.
	 * @param ctx the parse tree
	 */
	void exitPercentageVar(ICSSParser.PercentageVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#pixelVar}.
	 * @param ctx the parse tree
	 */
	void enterPixelVar(ICSSParser.PixelVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#pixelVar}.
	 * @param ctx the parse tree
	 */
	void exitPixelVar(ICSSParser.PixelVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#scalarVar}.
	 * @param ctx the parse tree
	 */
	void enterScalarVar(ICSSParser.ScalarVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#scalarVar}.
	 * @param ctx the parse tree
	 */
	void exitScalarVar(ICSSParser.ScalarVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#varReference}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(ICSSParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#varReference}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(ICSSParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#litExpression}.
	 * @param ctx the parse tree
	 */
	void enterLitExpression(ICSSParser.LitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#litExpression}.
	 * @param ctx the parse tree
	 */
	void exitLitExpression(ICSSParser.LitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#classPicker}.
	 * @param ctx the parse tree
	 */
	void enterClassPicker(ICSSParser.ClassPickerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#classPicker}.
	 * @param ctx the parse tree
	 */
	void exitClassPicker(ICSSParser.ClassPickerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#tagPicker}.
	 * @param ctx the parse tree
	 */
	void enterTagPicker(ICSSParser.TagPickerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#tagPicker}.
	 * @param ctx the parse tree
	 */
	void exitTagPicker(ICSSParser.TagPickerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#idPicker}.
	 * @param ctx the parse tree
	 */
	void enterIdPicker(ICSSParser.IdPickerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#idPicker}.
	 * @param ctx the parse tree
	 */
	void exitIdPicker(ICSSParser.IdPickerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#picker}.
	 * @param ctx the parse tree
	 */
	void enterPicker(ICSSParser.PickerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#picker}.
	 * @param ctx the parse tree
	 */
	void exitPicker(ICSSParser.PickerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void enterRuleBody(ICSSParser.RuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void exitRuleBody(ICSSParser.RuleBodyContext ctx);
}