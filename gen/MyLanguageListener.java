// Generated from C:/Users/Duma/IdeaProjects/LFA/src/main/java/MyLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void enterUsingStatement(MyLanguageParser.UsingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#usingStatement}.
	 * @param ctx the parse tree
	 */
	void exitUsingStatement(MyLanguageParser.UsingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(MyLanguageParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(MyLanguageParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(MyLanguageParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(MyLanguageParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(MyLanguageParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(MyLanguageParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(MyLanguageParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(MyLanguageParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#timeRange}.
	 * @param ctx the parse tree
	 */
	void enterTimeRange(MyLanguageParser.TimeRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#timeRange}.
	 * @param ctx the parse tree
	 */
	void exitTimeRange(MyLanguageParser.TimeRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(MyLanguageParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(MyLanguageParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#timePart}.
	 * @param ctx the parse tree
	 */
	void enterTimePart(MyLanguageParser.TimePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#timePart}.
	 * @param ctx the parse tree
	 */
	void exitTimePart(MyLanguageParser.TimePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#weights}.
	 * @param ctx the parse tree
	 */
	void enterWeights(MyLanguageParser.WeightsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#weights}.
	 * @param ctx the parse tree
	 */
	void exitWeights(MyLanguageParser.WeightsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#diet}.
	 * @param ctx the parse tree
	 */
	void enterDiet(MyLanguageParser.DietContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#diet}.
	 * @param ctx the parse tree
	 */
	void exitDiet(MyLanguageParser.DietContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#allergy}.
	 * @param ctx the parse tree
	 */
	void enterAllergy(MyLanguageParser.AllergyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#allergy}.
	 * @param ctx the parse tree
	 */
	void exitAllergy(MyLanguageParser.AllergyContext ctx);
}