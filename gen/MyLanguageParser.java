// Generated from C:/Users/Duma/IdeaProjects/LFA/src/main/java/MyLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, INT=24, STRING=25, 
		WS=26, COMMENT=27;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_usingStatement = 2, RULE_namespace = 3, 
		RULE_createStatement = 4, RULE_attribute = 5, RULE_attributeValue = 6, 
		RULE_timeRange = 7, RULE_time = 8, RULE_timePart = 9, RULE_weights = 10, 
		RULE_diet = 11, RULE_allergy = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "usingStatement", "namespace", "createStatement", 
			"attribute", "attributeValue", "timeRange", "time", "timePart", "weights", 
			"diet", "allergy"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'using'", "';'", "'.'", "'create'", "'Person'", "'{'", "'}'", 
			"'('", "')'", "'Busy'", "'-'", "'AM'", "'PM'", "'//'", "'here'", "'will'", 
			"'be'", "'chosen'", "'weights'", "'for'", "'sport'", "'Standard'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"INT", "STRING", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__3 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public UsingStatementContext usingStatement() {
			return getRuleContext(UsingStatementContext.class,0);
		}
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				usingStatement();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				createStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingStatementContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public UsingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterUsingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitUsingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitUsingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingStatementContext usingStatement() throws RecognitionException {
		UsingStatementContext _localctx = new UsingStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_usingStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			namespace();
			setState(37);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLanguageParser.ID, i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(40);
				match(T__2);
				setState(41);
				match(ID);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__3);
			setState(48);
			match(T__4);
			setState(49);
			match(ID);
			setState(50);
			match(T__5);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				attribute();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(56);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(T__7);
			setState(60);
			attributeValue();
			setState(61);
			match(T__8);
			setState(62);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode INT() { return getToken(MyLanguageParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public TimeRangeContext timeRange() {
			return getRuleContext(TimeRangeContext.class,0);
		}
		public WeightsContext weights() {
			return getRuleContext(WeightsContext.class,0);
		}
		public DietContext diet() {
			return getRuleContext(DietContext.class,0);
		}
		public AllergyContext allergy() {
			return getRuleContext(AllergyContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributeValue);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				timeRange();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				weights();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				diet();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				allergy();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeRangeContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TimeRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterTimeRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitTimeRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitTimeRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeRangeContext timeRange() throws RecognitionException {
		TimeRangeContext _localctx = new TimeRangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_timeRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
			setState(74);
			match(T__9);
			setState(75);
			match(T__7);
			setState(76);
			time();
			setState(77);
			match(T__8);
			setState(78);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeContext extends ParserRuleContext {
		public List<TimePartContext> timePart() {
			return getRuleContexts(TimePartContext.class);
		}
		public TimePartContext timePart(int i) {
			return getRuleContext(TimePartContext.class,i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			timePart();
			setState(81);
			match(T__10);
			setState(82);
			timePart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimePartContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MyLanguageParser.INT, 0); }
		public TimePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterTimePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitTimePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitTimePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePartContext timePart() throws RecognitionException {
		TimePartContext _localctx = new TimePartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_timePart);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(INT);
				setState(85);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(INT);
				setState(87);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WeightsContext extends ParserRuleContext {
		public WeightsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weights; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterWeights(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitWeights(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitWeights(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeightsContext weights() throws RecognitionException {
		WeightsContext _localctx = new WeightsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_weights);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__5);
			setState(91);
			match(T__13);
			setState(92);
			match(T__14);
			setState(93);
			match(T__15);
			setState(94);
			match(T__16);
			setState(95);
			match(T__17);
			setState(96);
			match(T__18);
			setState(97);
			match(T__19);
			setState(98);
			match(T__20);
			setState(99);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DietContext extends ParserRuleContext {
		public DietContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDiet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDiet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDiet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DietContext diet() throws RecognitionException {
		DietContext _localctx = new DietContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_diet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllergyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLanguageParser.ID, i);
		}
		public AllergyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allergy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAllergy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAllergy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAllergy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllergyContext allergy() throws RecognitionException {
		AllergyContext _localctx = new AllergyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_allergy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(T__2);
			setState(105);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001bl\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u00045\b\u0004\u000b\u0004\f\u00046\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006H\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tY\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0000i\u0000\u001b\u0001\u0000\u0000\u0000\u0002"+
		"!\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006\'\u0001"+
		"\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000"+
		"\fG\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010P\u0001"+
		"\u0000\u0000\u0000\u0012X\u0001\u0000\u0000\u0000\u0014Z\u0001\u0000\u0000"+
		"\u0000\u0016e\u0001\u0000\u0000\u0000\u0018g\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0003\u0004\u0002\u0000 \"\u0003\b\u0004\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0005"+
		"\u0001\u0000\u0000$%\u0003\u0006\u0003\u0000%&\u0005\u0002\u0000\u0000"+
		"&\u0005\u0001\u0000\u0000\u0000\',\u0005\u0017\u0000\u0000()\u0005\u0003"+
		"\u0000\u0000)+\u0005\u0017\u0000\u0000*(\u0001\u0000\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-\u0007\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0004"+
		"\u0000\u000001\u0005\u0005\u0000\u000012\u0005\u0017\u0000\u000024\u0005"+
		"\u0006\u0000\u000035\u0003\n\u0005\u000043\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0005\u0007\u0000\u00009\t\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0017\u0000\u0000;<\u0005\b\u0000\u0000<=\u0003\f\u0006"+
		"\u0000=>\u0005\t\u0000\u0000>?\u0005\u0002\u0000\u0000?\u000b\u0001\u0000"+
		"\u0000\u0000@H\u0005\u0017\u0000\u0000AH\u0005\u0018\u0000\u0000BH\u0005"+
		"\u0019\u0000\u0000CH\u0003\u000e\u0007\u0000DH\u0003\u0014\n\u0000EH\u0003"+
		"\u0016\u000b\u0000FH\u0003\u0018\f\u0000G@\u0001\u0000\u0000\u0000GA\u0001"+
		"\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000"+
		"GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000"+
		"\u0000H\r\u0001\u0000\u0000\u0000IJ\u0005\u0006\u0000\u0000JK\u0005\n"+
		"\u0000\u0000KL\u0005\b\u0000\u0000LM\u0003\u0010\b\u0000MN\u0005\t\u0000"+
		"\u0000NO\u0005\u0007\u0000\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0003"+
		"\u0012\t\u0000QR\u0005\u000b\u0000\u0000RS\u0003\u0012\t\u0000S\u0011"+
		"\u0001\u0000\u0000\u0000TU\u0005\u0018\u0000\u0000UY\u0005\f\u0000\u0000"+
		"VW\u0005\u0018\u0000\u0000WY\u0005\r\u0000\u0000XT\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y\u0013\u0001\u0000\u0000\u0000Z[\u0005\u0006"+
		"\u0000\u0000[\\\u0005\u000e\u0000\u0000\\]\u0005\u000f\u0000\u0000]^\u0005"+
		"\u0010\u0000\u0000^_\u0005\u0011\u0000\u0000_`\u0005\u0012\u0000\u0000"+
		"`a\u0005\u0013\u0000\u0000ab\u0005\u0014\u0000\u0000bc\u0005\u0015\u0000"+
		"\u0000cd\u0005\u0007\u0000\u0000d\u0015\u0001\u0000\u0000\u0000ef\u0005"+
		"\u0016\u0000\u0000f\u0017\u0001\u0000\u0000\u0000gh\u0005\u0017\u0000"+
		"\u0000hi\u0005\u0003\u0000\u0000ij\u0005\u0017\u0000\u0000j\u0019\u0001"+
		"\u0000\u0000\u0000\u0006\u001d!,6GX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}