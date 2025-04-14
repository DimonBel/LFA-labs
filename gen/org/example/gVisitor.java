// Generated from /home/dumas/LFA-labs/src/main/java/org/example/g.g4 by ANTLR 4.13.2
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#usingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingStatement(gParser.UsingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(gParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(gParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(gParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(gParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(gParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(gParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(gParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(gParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(gParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#timeRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeRange(gParser.TimeRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(gParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#timePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePart(gParser.TimePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#weights}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeights(gParser.WeightsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#diet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiet(gParser.DietContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#allergy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllergy(gParser.AllergyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#generateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerateStatement(gParser.GenerateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(gParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(gParser.OutputStatementContext ctx);
}