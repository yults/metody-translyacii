// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USING=1, NAMESPACE=2, INCLUDE=3, CIN=4, COUT=5, MAIN=6, IF=7, ELSE=8, 
		FOR=9, RETURN=10, PlUSIK=11, MINUS=12, MUL=13, DIV=14, MOD=15, LR=16, 
		RR=17, LF=18, RF=19, LSQ=20, RSQ=21, RAA=22, LA=23, RA=24, COMMA=25, DOTT=26, 
		SEMICOLON=27, COLON=28, BETTEREQ=29, LESSEQ=30, EQ=31, NOTEQ=32, IS=33, 
		OR=34, AND=35, NOT=36, TRUE=37, FALSE=38, INT=39, DOUBLE=40, FLOAT=41, 
		LONG=42, SHORT=43, BOOLEAN=44, CHART=45, VOID=46, PP=47, MM=48, NUM=49, 
		STRING=50, VARAIBLE=51, WS=52, NL=53;
	public static final int
		RULE_file = 0, RULE_include = 1, RULE_namespace = 2, RULE_main = 3, RULE_body = 4, 
		RULE_varr = 5, RULE_var1 = 6, RULE_var2 = 7, RULE_is1 = 8, RULE_value = 9, 
		RULE_expr = 10, RULE_op = 11, RULE_if1 = 12, RULE_else1 = 13, RULE_cin = 14, 
		RULE_ravar = 15, RULE_for = 16, RULE_return1 = 17, RULE_type = 18, RULE_cmp = 19, 
		RULE_bool = 20, RULE_condition = 21, RULE_cmprble = 22, RULE_step = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "include", "namespace", "main", "body", "varr", "var1", "var2", 
			"is1", "value", "expr", "op", "if1", "else1", "cin", "ravar", "for", 
			"return1", "type", "cmp", "bool", "condition", "cmprble", "step"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'using'", "'namespace'", "'#include'", "'cin'", "'cout'", "'main'", 
			"'if'", "'else'", "'for'", "'return'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'>>'", "'<'", "'>'", "','", 
			"'.'", "';'", "':'", "'>='", "'<='", "'=='", "'!='", "'='", "'||'", "'&&'", 
			"'!'", "'true'", "'false'", "'int'", "'double'", "'float'", "'long'", 
			"'short'", "'bool'", "'char'", "'void'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USING", "NAMESPACE", "INCLUDE", "CIN", "COUT", "MAIN", "IF", "ELSE", 
			"FOR", "RETURN", "PlUSIK", "MINUS", "MUL", "DIV", "MOD", "LR", "RR", 
			"LF", "RF", "LSQ", "RSQ", "RAA", "LA", "RA", "COMMA", "DOTT", "SEMICOLON", 
			"COLON", "BETTEREQ", "LESSEQ", "EQ", "NOTEQ", "IS", "OR", "AND", "NOT", 
			"TRUE", "FALSE", "INT", "DOUBLE", "FLOAT", "LONG", "SHORT", "BOOLEAN", 
			"CHART", "VOID", "PP", "MM", "NUM", "STRING", "VARAIBLE", "WS", "NL"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(48);
				include();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			namespace();
			setState(55);
			main();
			setState(56);
			match(EOF);
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
	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(gParser.INCLUDE, 0); }
		public TerminalNode LA() { return getToken(gParser.LA, 0); }
		public TerminalNode VARAIBLE() { return getToken(gParser.VARAIBLE, 0); }
		public TerminalNode RA() { return getToken(gParser.RA, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(INCLUDE);
			setState(59);
			match(LA);
			setState(60);
			match(VARAIBLE);
			setState(61);
			match(RA);
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
		public TerminalNode USING() { return getToken(gParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(gParser.NAMESPACE, 0); }
		public TerminalNode VARAIBLE() { return getToken(gParser.VARAIBLE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(USING);
			setState(64);
			match(NAMESPACE);
			setState(65);
			match(VARAIBLE);
			setState(66);
			match(SEMICOLON);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gParser.INT, 0); }
		public TerminalNode MAIN() { return getToken(gParser.MAIN, 0); }
		public TerminalNode LR() { return getToken(gParser.LR, 0); }
		public TerminalNode RR() { return getToken(gParser.RR, 0); }
		public TerminalNode LF() { return getToken(gParser.LF, 0); }
		public TerminalNode RF() { return getToken(gParser.RF, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(INT);
			setState(69);
			match(MAIN);
			setState(70);
			match(LR);
			setState(71);
			match(RR);
			setState(72);
			match(LF);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3447518708893328L) != 0) {
				{
				{
				setState(73);
				body();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(RF);
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
	public static class BodyContext extends ParserRuleContext {
		public CinContext cin() {
			return getRuleContext(CinContext.class,0);
		}
		public If1Context if1() {
			return getRuleContext(If1Context.class,0);
		}
		public Return1Context return1() {
			return getRuleContext(Return1Context.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public VarrContext varr() {
			return getRuleContext(VarrContext.class,0);
		}
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				cin();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				if1();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				return1();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				for_();
				}
				break;
			case INT:
			case DOUBLE:
			case FLOAT:
			case LONG:
			case SHORT:
			case BOOLEAN:
			case CHART:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				varr();
				}
				break;
			case VARAIBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				var2();
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
	public static class VarrContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var1Context> var1() {
			return getRuleContexts(Var1Context.class);
		}
		public Var1Context var1(int i) {
			return getRuleContext(Var1Context.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public VarrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterVarr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitVarr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVarr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarrContext varr() throws RecognitionException {
		VarrContext _localctx = new VarrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type();
			setState(90);
			var1();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				var1();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(SEMICOLON);
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
	public static class Var1Context extends ParserRuleContext {
		public TerminalNode VARAIBLE() { return getToken(gParser.VARAIBLE, 0); }
		public Is1Context is1() {
			return getRuleContext(Is1Context.class,0);
		}
		public Var1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterVar1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitVar1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVar1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var1Context var1() throws RecognitionException {
		Var1Context _localctx = new Var1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_var1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(VARAIBLE);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(101);
				is1();
				}
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
	public static class Var2Context extends ParserRuleContext {
		public TerminalNode VARAIBLE() { return getToken(gParser.VARAIBLE, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public Is1Context is1() {
			return getRuleContext(Is1Context.class,0);
		}
		public Var2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterVar2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitVar2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVar2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var2Context var2() throws RecognitionException {
		Var2Context _localctx = new Var2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_var2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VARAIBLE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(105);
				is1();
				}
			}

			setState(108);
			match(SEMICOLON);
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
	public static class Is1Context extends ParserRuleContext {
		public TerminalNode IS() { return getToken(gParser.IS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Is1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIs1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIs1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIs1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is1Context is1() throws RecognitionException {
		Is1Context _localctx = new Is1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_is1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IS);
			setState(111);
			value();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode VARAIBLE() { return getToken(gParser.VARAIBLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(VARAIBLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				expr();
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
	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(gParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gParser.NUM, i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(NUM);
			setState(121);
			op();
			setState(122);
			match(NUM);
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
	public static class OpContext extends ParserRuleContext {
		public TerminalNode PlUSIK() { return getToken(gParser.PlUSIK, 0); }
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(gParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(gParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(gParser.MOD, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 63488L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class If1Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gParser.IF, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode LF() { return getToken(gParser.LF, 0); }
		public TerminalNode RF() { return getToken(gParser.RF, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Else1Context else1() {
			return getRuleContext(Else1Context.class,0);
		}
		public If1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If1Context if1() throws RecognitionException {
		If1Context _localctx = new If1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_if1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IF);
			setState(127);
			bool();
			setState(128);
			match(LF);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3447518708893328L) != 0) {
				{
				{
				setState(129);
				body();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(RF);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(136);
				else1();
				}
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
	public static class Else1Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(gParser.ELSE, 0); }
		public TerminalNode LF() { return getToken(gParser.LF, 0); }
		public TerminalNode RF() { return getToken(gParser.RF, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Else1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElse1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElse1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElse1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else1Context else1() throws RecognitionException {
		Else1Context _localctx = new Else1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_else1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ELSE);
			setState(140);
			match(LF);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3447518708893328L) != 0) {
				{
				{
				setState(141);
				body();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(RF);
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
	public static class CinContext extends ParserRuleContext {
		public TerminalNode CIN() { return getToken(gParser.CIN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public List<RavarContext> ravar() {
			return getRuleContexts(RavarContext.class);
		}
		public RavarContext ravar(int i) {
			return getRuleContext(RavarContext.class,i);
		}
		public CinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CinContext cin() throws RecognitionException {
		CinContext _localctx = new CinContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CIN);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAA) {
				{
				{
				setState(150);
				ravar();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(SEMICOLON);
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
	public static class RavarContext extends ParserRuleContext {
		public TerminalNode RAA() { return getToken(gParser.RAA, 0); }
		public TerminalNode VARAIBLE() { return getToken(gParser.VARAIBLE, 0); }
		public RavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterRavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitRavar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRavar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RavarContext ravar() throws RecognitionException {
		RavarContext _localctx = new RavarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ravar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(RAA);
			setState(159);
			match(VARAIBLE);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gParser.FOR, 0); }
		public TerminalNode LR() { return getToken(gParser.LR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var1Context var1() {
			return getRuleContext(Var1Context.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(gParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode VARAIBLE() { return getToken(gParser.VARAIBLE, 0); }
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public TerminalNode RR() { return getToken(gParser.RR, 0); }
		public TerminalNode LF() { return getToken(gParser.LF, 0); }
		public TerminalNode RF() { return getToken(gParser.RF, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(FOR);
			setState(162);
			match(LR);
			setState(163);
			type();
			setState(164);
			var1();
			setState(165);
			match(SEMICOLON);
			setState(166);
			condition();
			setState(167);
			match(SEMICOLON);
			setState(168);
			match(VARAIBLE);
			setState(169);
			step();
			setState(170);
			match(RR);
			setState(171);
			match(LF);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3447518708893328L) != 0) {
				{
				{
				setState(172);
				body();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(RF);
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
	public static class Return1Context extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public Return1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReturn1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReturn1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitReturn1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return1Context return1() throws RecognitionException {
		Return1Context _localctx = new Return1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_return1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(RETURN);
			setState(181);
			value();
			setState(182);
			match(SEMICOLON);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(gParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(gParser.FLOAT, 0); }
		public TerminalNode LONG() { return getToken(gParser.LONG, 0); }
		public TerminalNode SHORT() { return getToken(gParser.SHORT, 0); }
		public TerminalNode BOOLEAN() { return getToken(gParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode CHART() { return getToken(gParser.CHART, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1195718895206400L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CmpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(gParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(gParser.NOTEQ, 0); }
		public TerminalNode LA() { return getToken(gParser.LA, 0); }
		public TerminalNode RA() { return getToken(gParser.RA, 0); }
		public TerminalNode BETTEREQ() { return getToken(gParser.BETTEREQ, 0); }
		public TerminalNode LESSEQ() { return getToken(gParser.LESSEQ, 0); }
		public TerminalNode AND() { return getToken(gParser.AND, 0); }
		public TerminalNode OR() { return getToken(gParser.OR, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 59617837056L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(gParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(gParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(gParser.NOT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LR() { return getToken(gParser.LR, 0); }
		public TerminalNode RR() { return getToken(gParser.RR, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(NOT);
				setState(191);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(LR);
				setState(194);
				bool();
				setState(195);
				match(RR);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<CmprbleContext> cmprble() {
			return getRuleContexts(CmprbleContext.class);
		}
		public CmprbleContext cmprble(int i) {
			return getRuleContext(CmprbleContext.class,i);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			cmprble();
			setState(200);
			cmp();
			setState(201);
			cmprble();
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
	public static class CmprbleContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(gParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(gParser.FALSE, 0); }
		public TerminalNode VARAIBLE() { return getToken(gParser.VARAIBLE, 0); }
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public CmprbleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmprble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCmprble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCmprble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCmprble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmprbleContext cmprble() throws RecognitionException {
		CmprbleContext _localctx = new CmprbleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmprble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3941061990809600L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class StepContext extends ParserRuleContext {
		public TerminalNode PP() { return getToken(gParser.PP, 0); }
		public TerminalNode MM() { return getToken(gParser.MM, 0); }
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==PP || _la==MM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u00015\u00d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"K\b\u0003\n\u0003\f\u0003N\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"X\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"^\b\u0005\n\u0005\f\u0005a\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"k\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tw\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0083"+
		"\b\f\n\f\f\f\u0086\t\f\u0001\f\u0001\f\u0003\f\u008a\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u008f\b\r\n\r\f\r\u0092\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0098\b\u000e\n\u000e\f\u000e\u009b\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ae"+
		"\b\u0010\n\u0010\f\u0010\u00b1\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00c6\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.\u0000\u0005\u0001\u0000\u000b\u000f\u0002\u0000\'-22\u0003\u0000"+
		"\u0017\u0018\u001d \"#\u0002\u0000%&13\u0001\u0000/0\u00ce\u00003\u0001"+
		"\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000"+
		"\u0000\u0006D\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\nY\u0001"+
		"\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000"+
		"\u0000\u0010n\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000\u0000\u0014"+
		"x\u0001\u0000\u0000\u0000\u0016|\u0001\u0000\u0000\u0000\u0018~\u0001"+
		"\u0000\u0000\u0000\u001a\u008b\u0001\u0000\u0000\u0000\u001c\u0095\u0001"+
		"\u0000\u0000\u0000\u001e\u009e\u0001\u0000\u0000\u0000 \u00a1\u0001\u0000"+
		"\u0000\u0000\"\u00b4\u0001\u0000\u0000\u0000$\u00b8\u0001\u0000\u0000"+
		"\u0000&\u00ba\u0001\u0000\u0000\u0000(\u00c5\u0001\u0000\u0000\u0000*"+
		"\u00c7\u0001\u0000\u0000\u0000,\u00cb\u0001\u0000\u0000\u0000.\u00cd\u0001"+
		"\u0000\u0000\u000002\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u0000"+
		"25\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0003\u0004"+
		"\u0002\u000078\u0003\u0006\u0003\u000089\u0005\u0000\u0000\u00019\u0001"+
		"\u0001\u0000\u0000\u0000:;\u0005\u0003\u0000\u0000;<\u0005\u0017\u0000"+
		"\u0000<=\u00053\u0000\u0000=>\u0005\u0018\u0000\u0000>\u0003\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0001\u0000\u0000@A\u0005\u0002\u0000\u0000AB\u0005"+
		"3\u0000\u0000BC\u0005\u001b\u0000\u0000C\u0005\u0001\u0000\u0000\u0000"+
		"DE\u0005\'\u0000\u0000EF\u0005\u0006\u0000\u0000FG\u0005\u0010\u0000\u0000"+
		"GH\u0005\u0011\u0000\u0000HL\u0005\u0012\u0000\u0000IK\u0003\b\u0004\u0000"+
		"JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0013\u0000\u0000P\u0007\u0001\u0000\u0000\u0000"+
		"QX\u0003\u001c\u000e\u0000RX\u0003\u0018\f\u0000SX\u0003\"\u0011\u0000"+
		"TX\u0003 \u0010\u0000UX\u0003\n\u0005\u0000VX\u0003\u000e\u0007\u0000"+
		"WQ\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000"+
		"\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X\t\u0001\u0000\u0000\u0000YZ\u0003$\u0012\u0000Z_\u0003\f"+
		"\u0006\u0000[\\\u0005\u0019\u0000\u0000\\^\u0003\f\u0006\u0000][\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bc\u0005\u001b\u0000\u0000c\u000b\u0001\u0000\u0000\u0000df\u0005"+
		"3\u0000\u0000eg\u0003\u0010\b\u0000fe\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g\r\u0001\u0000\u0000\u0000hj\u00053\u0000\u0000ik\u0003"+
		"\u0010\b\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0005\u001b\u0000\u0000m\u000f\u0001\u0000\u0000"+
		"\u0000no\u0005!\u0000\u0000op\u0003\u0012\t\u0000p\u0011\u0001\u0000\u0000"+
		"\u0000qw\u00052\u0000\u0000rw\u0003(\u0014\u0000sw\u00051\u0000\u0000"+
		"tw\u00053\u0000\u0000uw\u0003\u0014\n\u0000vq\u0001\u0000\u0000\u0000"+
		"vr\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0005"+
		"1\u0000\u0000yz\u0003\u0016\u000b\u0000z{\u00051\u0000\u0000{\u0015\u0001"+
		"\u0000\u0000\u0000|}\u0007\u0000\u0000\u0000}\u0017\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u0007\u0000\u0000\u007f\u0080\u0003(\u0014\u0000\u0080"+
		"\u0084\u0005\u0012\u0000\u0000\u0081\u0083\u0003\b\u0004\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0005\u0013\u0000\u0000\u0088\u008a\u0003\u001a\r\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0019\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\b\u0000\u0000\u008c\u0090\u0005\u0012"+
		"\u0000\u0000\u008d\u008f\u0003\b\u0004\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0013\u0000"+
		"\u0000\u0094\u001b\u0001\u0000\u0000\u0000\u0095\u0099\u0005\u0004\u0000"+
		"\u0000\u0096\u0098\u0003\u001e\u000f\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001b\u0000"+
		"\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0016\u0000"+
		"\u0000\u009f\u00a0\u00053\u0000\u0000\u00a0\u001f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005\t\u0000\u0000\u00a2\u00a3\u0005\u0010\u0000\u0000\u00a3"+
		"\u00a4\u0003$\u0012\u0000\u00a4\u00a5\u0003\f\u0006\u0000\u00a5\u00a6"+
		"\u0005\u001b\u0000\u0000\u00a6\u00a7\u0003*\u0015\u0000\u00a7\u00a8\u0005"+
		"\u001b\u0000\u0000\u00a8\u00a9\u00053\u0000\u0000\u00a9\u00aa\u0003.\u0017"+
		"\u0000\u00aa\u00ab\u0005\u0011\u0000\u0000\u00ab\u00af\u0005\u0012\u0000"+
		"\u0000\u00ac\u00ae\u0003\b\u0004\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0013\u0000\u0000"+
		"\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5"+
		"\u00b6\u0003\u0012\t\u0000\u00b6\u00b7\u0005\u001b\u0000\u0000\u00b7#"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007\u0001\u0000\u0000\u00b9%\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0007\u0002\u0000\u0000\u00bb\'\u0001\u0000"+
		"\u0000\u0000\u00bc\u00c6\u0005%\u0000\u0000\u00bd\u00c6\u0005&\u0000\u0000"+
		"\u00be\u00bf\u0005$\u0000\u0000\u00bf\u00c6\u0003(\u0014\u0000\u00c0\u00c6"+
		"\u0003*\u0015\u0000\u00c1\u00c2\u0005\u0010\u0000\u0000\u00c2\u00c3\u0003"+
		"(\u0014\u0000\u00c3\u00c4\u0005\u0011\u0000\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00bc\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c5\u00be\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c6)\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0003,\u0016\u0000\u00c8\u00c9\u0003&\u0013\u0000\u00c9"+
		"\u00ca\u0003,\u0016\u0000\u00ca+\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007"+
		"\u0003\u0000\u0000\u00cc-\u0001\u0000\u0000\u0000\u00cd\u00ce\u0007\u0004"+
		"\u0000\u0000\u00ce/\u0001\u0000\u0000\u0000\r3LW_fjv\u0084\u0089\u0090"+
		"\u0099\u00af\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}