// Generated from /home/dumas/LFA-labs/src/main/java/org/example/g.g4 by ANTLR 4.13.2
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void enterUsingStatement(gParser.UsingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void exitUsingStatement(gParser.UsingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(gParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(gParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(gParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(gParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(gParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(gParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(gParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(gParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(gParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(gParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(gParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(gParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(gParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(gParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(gParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(gParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(gParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(gParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#timeRange}.
	 * @param ctx the parse tree
	 */
	void enterTimeRange(gParser.TimeRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#timeRange}.
	 * @param ctx the parse tree
	 */
	void exitTimeRange(gParser.TimeRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(gParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(gParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#timePart}.
	 * @param ctx the parse tree
	 */
	void enterTimePart(gParser.TimePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#timePart}.
	 * @param ctx the parse tree
	 */
	void exitTimePart(gParser.TimePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#weights}.
	 * @param ctx the parse tree
	 */
	void enterWeights(gParser.WeightsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#weights}.
	 * @param ctx the parse tree
	 */
	void exitWeights(gParser.WeightsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#diet}.
	 * @param ctx the parse tree
	 */
	void enterDiet(gParser.DietContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#diet}.
	 * @param ctx the parse tree
	 */
	void exitDiet(gParser.DietContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#allergy}.
	 * @param ctx the parse tree
	 */
	void enterAllergy(gParser.AllergyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#allergy}.
	 * @param ctx the parse tree
	 */
	void exitAllergy(gParser.AllergyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#generateStatement}.
	 * @param ctx the parse tree
	 */
	void enterGenerateStatement(gParser.GenerateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#generateStatement}.
	 * @param ctx the parse tree
	 */
	void exitGenerateStatement(gParser.GenerateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(gParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(gParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(gParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(gParser.OutputStatementContext ctx);
}