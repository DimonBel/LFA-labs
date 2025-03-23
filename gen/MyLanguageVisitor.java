// Generated from C:/Users/Duma/IdeaProjects/LFA/src/main/java/MyLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#usingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingStatement(MyLanguageParser.UsingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(MyLanguageParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(MyLanguageParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(MyLanguageParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(MyLanguageParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#timeRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeRange(MyLanguageParser.TimeRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(MyLanguageParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#timePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePart(MyLanguageParser.TimePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#weights}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeights(MyLanguageParser.WeightsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#diet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiet(MyLanguageParser.DietContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#allergy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllergy(MyLanguageParser.AllergyContext ctx);
}