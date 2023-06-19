// Generated from java-escape by ANTLR 4.11.1
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
		T__0=1, T__1=2, REGEX=3, CODE=4, GRAMMAR=5, HEADER=6, MEMBERS=7, INIT=8, 
		RETURNS=9, LOCALS=10, VAR=11, COMMA=12, OR=13, COLON=14, SEMICOLON=15, 
		WHITESPACEERASE=16;
	public static final int
		RULE_start = 0, RULE_gHeader = 1, RULE_header = 2, RULE_members = 3, RULE_code = 4, 
		RULE_params = 5, RULE_termD = 6, RULE_netermD = 7, RULE_netReturns = 8, 
		RULE_netParams = 9, RULE_netRule = 10, RULE_item = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "gHeader", "header", "members", "code", "params", "termD", "netermD", 
			"netReturns", "netParams", "netRule", "item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", null, null, "'grammar'", "'@header'", "'@members'", 
			"'@init'", "'returns'", "'locals'", null, "','", "'|'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "REGEX", "CODE", "GRAMMAR", "HEADER", "MEMBERS", "INIT", 
			"RETURNS", "LOCALS", "VAR", "COMMA", "OR", "COLON", "SEMICOLON", "WHITESPACEERASE"
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
	public static class StartContext extends ParserRuleContext {
		public Grammar g1;
		public TermDContext termD;
		public NetermDContext netermD;
		public GHeaderContext gHeader() {
			return getRuleContext(GHeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public List<TermDContext> termD() {
			return getRuleContexts(TermDContext.class);
		}
		public TermDContext termD(int i) {
			return getRuleContext(TermDContext.class,i);
		}
		public List<NetermDContext> netermD() {
			return getRuleContexts(NetermDContext.class);
		}
		public NetermDContext netermD(int i) {
			return getRuleContext(NetermDContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		((StartContext)_localctx).g1 =  new Grammar();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			gHeader(_localctx.g1);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(25);
				header(_localctx.g1);
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMBERS) {
				{
				setState(28);
				members(_localctx.g1);
				}
			}

			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(31);
					((StartContext)_localctx).termD = termD();
					_localctx.g1.addTerm(((StartContext)_localctx).termD.term);
					}
					break;
				case 2:
					{
					setState(34);
					((StartContext)_localctx).netermD = netermD();
					_localctx.g1.addNeterm(((StartContext)_localctx).netermD.neterm);
					}
					break;
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
	public static class GHeaderContext extends ParserRuleContext {
		public Grammar g1;
		public Token VAR;
		public TerminalNode GRAMMAR() { return getToken(gParser.GRAMMAR, 0); }
		public TerminalNode VAR() { return getToken(gParser.VAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public GHeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GHeaderContext(ParserRuleContext parent, int invokingState, Grammar g1) {
			super(parent, invokingState);
			this.g1 = g1;
		}
		@Override public int getRuleIndex() { return RULE_gHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GHeaderContext gHeader(Grammar g1) throws RecognitionException {
		GHeaderContext _localctx = new GHeaderContext(_ctx, getState(), g1);
		enterRule(_localctx, 2, RULE_gHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(GRAMMAR);
			setState(45);
			((GHeaderContext)_localctx).VAR = match(VAR);
			setState(46);
			match(SEMICOLON);
			_localctx.g1.setName((((GHeaderContext)_localctx).VAR!=null?((GHeaderContext)_localctx).VAR.getText():null));
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
	public static class HeaderContext extends ParserRuleContext {
		public Grammar g1;
		public StringBuilder sb;
		public TerminalNode HEADER() { return getToken(gParser.HEADER, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HeaderContext(ParserRuleContext parent, int invokingState, Grammar g1) {
			super(parent, invokingState);
			this.g1 = g1;
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header(Grammar g1) throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState(), g1);
		enterRule(_localctx, 4, RULE_header);

		        ((HeaderContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(HEADER);
			setState(50);
			code(_localctx.sb);
			_localctx.g1.setHeader(_localctx.sb.toString());
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
	public static class MembersContext extends ParserRuleContext {
		public Grammar g1;
		public StringBuilder sb;
		public TerminalNode MEMBERS() { return getToken(gParser.MEMBERS, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MembersContext(ParserRuleContext parent, int invokingState, Grammar g1) {
			super(parent, invokingState);
			this.g1 = g1;
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members(Grammar g1) throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState(), g1);
		enterRule(_localctx, 6, RULE_members);

		        ((MembersContext)_localctx).sb =  new StringBuilder();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(MEMBERS);
			setState(54);
			code(_localctx.sb);
			_localctx.g1.setMembers(_localctx.sb.toString());
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
	public static class CodeContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token CODE;
		public TerminalNode CODE() { return getToken(gParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodeContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code(StringBuilder sb) throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState(), sb);
		enterRule(_localctx, 8, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((CodeContext)_localctx).CODE = match(CODE);
			_localctx.sb.append((((CodeContext)_localctx).CODE!=null?((CodeContext)_localctx).CODE.getText():null).substring(1, (((CodeContext)_localctx).CODE!=null?((CodeContext)_localctx).CODE.getText():null).length() - 1));
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
	public static class ParamsContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token CODE;
		public TerminalNode CODE() { return getToken(gParser.CODE, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamsContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params(StringBuilder sb) throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState(), sb);
		enterRule(_localctx, 10, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			((ParamsContext)_localctx).CODE = match(CODE);
			setState(62);
			match(T__1);

			        String p = (((ParamsContext)_localctx).CODE!=null?((ParamsContext)_localctx).CODE.getText():null);
			        _localctx.sb.append(p.substring(1, p.length() - 1));
			    
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
	public static class TermDContext extends ParserRuleContext {
		public Term term;
		public Token VAR;
		public Token REGEX;
		public TerminalNode VAR() { return getToken(gParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public TerminalNode REGEX() { return getToken(gParser.REGEX, 0); }
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public TermDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTermD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTermD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTermD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermDContext termD() throws RecognitionException {
		TermDContext _localctx = new TermDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((TermDContext)_localctx).VAR = match(VAR);
			setState(66);
			match(COLON);
			setState(67);
			((TermDContext)_localctx).REGEX = match(REGEX);
			setState(68);
			match(SEMICOLON);

			    String rx = (((TermDContext)_localctx).REGEX!=null?((TermDContext)_localctx).REGEX.getText():null);
			    ((TermDContext)_localctx).term =  new Term((((TermDContext)_localctx).VAR!=null?((TermDContext)_localctx).VAR.getText():null), rx.substring(1, rx.length() - 1));

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
	public static class NetermDContext extends ParserRuleContext {
		public Neterm neterm;
		public StringBuilder sb;
		public Token VAR;
		public NetRuleContext netRule;
		public TerminalNode VAR() { return getToken(gParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public List<NetRuleContext> netRule() {
			return getRuleContexts(NetRuleContext.class);
		}
		public NetRuleContext netRule(int i) {
			return getRuleContext(NetRuleContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(gParser.SEMICOLON, 0); }
		public NetParamsContext netParams() {
			return getRuleContext(NetParamsContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(gParser.RETURNS, 0); }
		public NetReturnsContext netReturns() {
			return getRuleContext(NetReturnsContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(gParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(gParser.OR, i);
		}
		public NetermDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_netermD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNetermD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNetermD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNetermD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetermDContext netermD() throws RecognitionException {
		NetermDContext _localctx = new NetermDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_netermD);

		        ((NetermDContext)_localctx).sb =  new StringBuilder();
		        ((NetermDContext)_localctx).neterm =  new Neterm();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((NetermDContext)_localctx).VAR = match(VAR);
			_localctx.neterm.setName((((NetermDContext)_localctx).VAR!=null?((NetermDContext)_localctx).VAR.getText():null));
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(73);
				match(T__0);
				setState(74);
				netParams(_localctx.neterm);
				setState(75);
				match(T__1);
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(79);
				match(RETURNS);
				setState(80);
				match(T__0);
				setState(81);
				netReturns(_localctx.neterm);
				setState(82);
				match(T__1);
				}
			}

			setState(86);
			match(COLON);
			setState(87);
			((NetermDContext)_localctx).netRule = netRule();
			_localctx.neterm.addRule(((NetermDContext)_localctx).netRule.rule_);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(89);
				match(OR);
				setState(90);
				((NetermDContext)_localctx).netRule = netRule();
				_localctx.neterm.addRule(((NetermDContext)_localctx).netRule.rule_);
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
	public static class NetReturnsContext extends ParserRuleContext {
		public Neterm neterm;
		public Token type;
		public Token name;
		public List<TerminalNode> VAR() { return getTokens(gParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(gParser.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public NetReturnsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NetReturnsContext(ParserRuleContext parent, int invokingState, Neterm neterm) {
			super(parent, invokingState);
			this.neterm = neterm;
		}
		@Override public int getRuleIndex() { return RULE_netReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNetReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNetReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNetReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetReturnsContext netReturns(Neterm neterm) throws RecognitionException {
		NetReturnsContext _localctx = new NetReturnsContext(_ctx, getState(), neterm);
		enterRule(_localctx, 16, RULE_netReturns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((NetReturnsContext)_localctx).type = match(VAR);
			setState(101);
			((NetReturnsContext)_localctx).name = match(VAR);
			_localctx.neterm.addReturn((((NetReturnsContext)_localctx).type!=null?((NetReturnsContext)_localctx).type.getText():null), (((NetReturnsContext)_localctx).name!=null?((NetReturnsContext)_localctx).name.getText():null));
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(103);
				match(COMMA);
				setState(104);
				((NetReturnsContext)_localctx).type = match(VAR);
				setState(105);
				((NetReturnsContext)_localctx).name = match(VAR);
				_localctx.neterm.addReturn((((NetReturnsContext)_localctx).type!=null?((NetReturnsContext)_localctx).type.getText():null), (((NetReturnsContext)_localctx).name!=null?((NetReturnsContext)_localctx).name.getText():null));
				}
				}
				setState(111);
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
	public static class NetParamsContext extends ParserRuleContext {
		public Neterm neterm;
		public Token type;
		public Token name;
		public List<TerminalNode> VAR() { return getTokens(gParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(gParser.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public NetParamsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NetParamsContext(ParserRuleContext parent, int invokingState, Neterm neterm) {
			super(parent, invokingState);
			this.neterm = neterm;
		}
		@Override public int getRuleIndex() { return RULE_netParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNetParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNetParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNetParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetParamsContext netParams(Neterm neterm) throws RecognitionException {
		NetParamsContext _localctx = new NetParamsContext(_ctx, getState(), neterm);
		enterRule(_localctx, 18, RULE_netParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((NetParamsContext)_localctx).type = match(VAR);
			setState(113);
			((NetParamsContext)_localctx).name = match(VAR);
			_localctx.neterm.addParam((((NetParamsContext)_localctx).type!=null?((NetParamsContext)_localctx).type.getText():null), (((NetParamsContext)_localctx).name!=null?((NetParamsContext)_localctx).name.getText():null));
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				((NetParamsContext)_localctx).type = match(VAR);
				setState(117);
				((NetParamsContext)_localctx).name = match(VAR);
				_localctx.neterm.addParam((((NetParamsContext)_localctx).type!=null?((NetParamsContext)_localctx).type.getText():null), (((NetParamsContext)_localctx).name!=null?((NetParamsContext)_localctx).name.getText():null));
				}
				}
				setState(123);
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
	public static class NetRuleContext extends ParserRuleContext {
		public Rule rule_;
		public ItemContext item;
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public NetRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_netRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNetRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetRuleContext netRule() throws RecognitionException {
		NetRuleContext _localctx = new NetRuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_netRule);

		        ((NetRuleContext)_localctx).rule_ =  new Rule();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				((NetRuleContext)_localctx).item = item();
				_localctx.rule_.addItem(((NetRuleContext)_localctx).item.i);
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
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
	public static class ItemContext extends ParserRuleContext {
		public Item i;
		public StringBuilder sb;
		public StringBuilder p;
		public Token VAR;
		public TerminalNode VAR() { return getToken(gParser.VAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_item);

		        ((ItemContext)_localctx).i =  new Item();
		        ((ItemContext)_localctx).sb =  new StringBuilder();
		        ((ItemContext)_localctx).p =  new StringBuilder();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((ItemContext)_localctx).VAR = match(VAR);
			_localctx.i.setName((((ItemContext)_localctx).VAR!=null?((ItemContext)_localctx).VAR.getText():null));
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(133);
				params(_localctx.p);
				_localctx.i.setParams(_localctx.p.toString());
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(138);
				code(_localctx.sb);
				_localctx.i.setCode(_localctx.sb.toString());
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

	public static final String _serializedATN =
		"\u0004\u0001\u0010\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000\u0003\u0000"+
		"\u001e\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007N\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"U\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007^\b\u0007\n\u0007\f\u0007a\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bl\b\b\n\b\f\bo\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\tx\b\t\n\t\f\t{\t\t\u0001\n\u0001\n\u0001\n\u0004"+
		"\n\u0080\b\n\u000b\n\f\n\u0081\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0089\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u008e\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u008f\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u00041\u0001"+
		"\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000"+
		"\u0000\n<\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eG\u0001"+
		"\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000\u0000"+
		"\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u001b\u0003\u0004\u0002"+
		"\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0006\u0003"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\'\u0001\u0000\u0000\u0000\u001f \u0003\f\u0006\u0000 !\u0006"+
		"\u0000\uffff\uffff\u0000!&\u0001\u0000\u0000\u0000\"#\u0003\u000e\u0007"+
		"\u0000#$\u0006\u0000\uffff\uffff\u0000$&\u0001\u0000\u0000\u0000%\u001f"+
		"\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000\u0001+\u0001"+
		"\u0001\u0000\u0000\u0000,-\u0005\u0005\u0000\u0000-.\u0005\u000b\u0000"+
		"\u0000./\u0005\u000f\u0000\u0000/0\u0006\u0001\uffff\uffff\u00000\u0003"+
		"\u0001\u0000\u0000\u000012\u0005\u0006\u0000\u000023\u0003\b\u0004\u0000"+
		"34\u0006\u0002\uffff\uffff\u00004\u0005\u0001\u0000\u0000\u000056\u0005"+
		"\u0007\u0000\u000067\u0003\b\u0004\u000078\u0006\u0003\uffff\uffff\u0000"+
		"8\u0007\u0001\u0000\u0000\u00009:\u0005\u0004\u0000\u0000:;\u0006\u0004"+
		"\uffff\uffff\u0000;\t\u0001\u0000\u0000\u0000<=\u0005\u0001\u0000\u0000"+
		"=>\u0005\u0004\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0006\u0005\uffff"+
		"\uffff\u0000@\u000b\u0001\u0000\u0000\u0000AB\u0005\u000b\u0000\u0000"+
		"BC\u0005\u000e\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0005\u000f\u0000"+
		"\u0000EF\u0006\u0006\uffff\uffff\u0000F\r\u0001\u0000\u0000\u0000GH\u0005"+
		"\u000b\u0000\u0000HM\u0006\u0007\uffff\uffff\u0000IJ\u0005\u0001\u0000"+
		"\u0000JK\u0003\u0012\t\u0000KL\u0005\u0002\u0000\u0000LN\u0001\u0000\u0000"+
		"\u0000MI\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NT\u0001\u0000"+
		"\u0000\u0000OP\u0005\t\u0000\u0000PQ\u0005\u0001\u0000\u0000QR\u0003\u0010"+
		"\b\u0000RS\u0005\u0002\u0000\u0000SU\u0001\u0000\u0000\u0000TO\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005"+
		"\u000e\u0000\u0000WX\u0003\u0014\n\u0000X_\u0006\u0007\uffff\uffff\u0000"+
		"YZ\u0005\r\u0000\u0000Z[\u0003\u0014\n\u0000[\\\u0006\u0007\uffff\uffff"+
		"\u0000\\^\u0001\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u000f\u0000\u0000"+
		"c\u000f\u0001\u0000\u0000\u0000de\u0005\u000b\u0000\u0000ef\u0005\u000b"+
		"\u0000\u0000fm\u0006\b\uffff\uffff\u0000gh\u0005\f\u0000\u0000hi\u0005"+
		"\u000b\u0000\u0000ij\u0005\u000b\u0000\u0000jl\u0006\b\uffff\uffff\u0000"+
		"kg\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u0011\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u0005\u000b\u0000\u0000qr\u0005\u000b\u0000\u0000"+
		"ry\u0006\t\uffff\uffff\u0000st\u0005\f\u0000\u0000tu\u0005\u000b\u0000"+
		"\u0000uv\u0005\u000b\u0000\u0000vx\u0006\t\uffff\uffff\u0000ws\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z\u0013\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|}\u0003\u0016\u000b\u0000}~\u0006\n\uffff\uffff\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000b"+
		"\u0000\u0000\u0084\u0088\u0006\u000b\uffff\uffff\u0000\u0085\u0086\u0003"+
		"\n\u0005\u0000\u0086\u0087\u0006\u000b\uffff\uffff\u0000\u0087\u0089\u0001"+
		"\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008d\u0001\u0000\u0000\u0000\u008a\u008b\u0003"+
		"\b\u0004\u0000\u008b\u008c\u0006\u000b\uffff\uffff\u0000\u008c\u008e\u0001"+
		"\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0017\u0001\u0000\u0000\u0000\f\u001a\u001d%"+
		"\'MT_my\u0081\u0088\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}