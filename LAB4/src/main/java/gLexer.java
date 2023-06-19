// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, REGEX=3, CODE=4, GRAMMAR=5, HEADER=6, MEMBERS=7, INIT=8, 
		RETURNS=9, LOCALS=10, VAR=11, COMMA=12, OR=13, COLON=14, SEMICOLON=15, 
		WHITESPACEERASE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "REGEX", "CODE", "GRAMMAR", "HEADER", "MEMBERS", "INIT", 
			"RETURNS", "LOCALS", "VAR", "COMMA", "OR", "COLON", "SEMICOLON", "WHITESPACEERASE"
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0004\u0002(\b\u0002\u000b\u0002\f\u0002)\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u00034\b\u0003\u0005\u00036\b\u0003\n\u0003\f"+
		"\u00039\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nm\b\n\n\n\f"+
		"\np\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0004\u000f{\b\u000f\u000b\u000f\f\u000f"+
		"|\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001"+
		"\u0000\u0005\u0002\u0000\n\n\'\'\u0002\u0000{{}}\u0002\u0000AZaz\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u0085\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001"+
		"\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000"+
		"\u0000\t<\u0001\u0000\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rL\u0001"+
		"\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011[\u0001\u0000\u0000"+
		"\u0000\u0013c\u0001\u0000\u0000\u0000\u0015j\u0001\u0000\u0000\u0000\u0017"+
		"q\u0001\u0000\u0000\u0000\u0019s\u0001\u0000\u0000\u0000\u001bu\u0001"+
		"\u0000\u0000\u0000\u001dw\u0001\u0000\u0000\u0000\u001fz\u0001\u0000\u0000"+
		"\u0000!\"\u0005[\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005]"+
		"\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%\'\u0005\'\u0000\u0000&(\b"+
		"\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+,\u0005\'\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-7\u0005{\u0000"+
		"\u0000./\u0005\\\u0000\u0000/4\u0005{\u0000\u000001\u0005\\\u0000\u0000"+
		"14\u0005}\u0000\u000024\b\u0001\u0000\u00003.\u0001\u0000\u0000\u0000"+
		"30\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u000046\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:;\u0005}\u0000\u0000;\b\u0001\u0000\u0000\u0000<=\u0005"+
		"g\u0000\u0000=>\u0005r\u0000\u0000>?\u0005a\u0000\u0000?@\u0005m\u0000"+
		"\u0000@A\u0005m\u0000\u0000AB\u0005a\u0000\u0000BC\u0005r\u0000\u0000"+
		"C\n\u0001\u0000\u0000\u0000DE\u0005@\u0000\u0000EF\u0005h\u0000\u0000"+
		"FG\u0005e\u0000\u0000GH\u0005a\u0000\u0000HI\u0005d\u0000\u0000IJ\u0005"+
		"e\u0000\u0000JK\u0005r\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005"+
		"@\u0000\u0000MN\u0005m\u0000\u0000NO\u0005e\u0000\u0000OP\u0005m\u0000"+
		"\u0000PQ\u0005b\u0000\u0000QR\u0005e\u0000\u0000RS\u0005r\u0000\u0000"+
		"ST\u0005s\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005@\u0000\u0000"+
		"VW\u0005i\u0000\u0000WX\u0005n\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005"+
		"t\u0000\u0000Z\u0010\u0001\u0000\u0000\u0000[\\\u0005r\u0000\u0000\\]"+
		"\u0005e\u0000\u0000]^\u0005t\u0000\u0000^_\u0005u\u0000\u0000_`\u0005"+
		"r\u0000\u0000`a\u0005n\u0000\u0000ab\u0005s\u0000\u0000b\u0012\u0001\u0000"+
		"\u0000\u0000cd\u0005l\u0000\u0000de\u0005o\u0000\u0000ef\u0005c\u0000"+
		"\u0000fg\u0005a\u0000\u0000gh\u0005l\u0000\u0000hi\u0005s\u0000\u0000"+
		"i\u0014\u0001\u0000\u0000\u0000jn\u0007\u0002\u0000\u0000km\u0007\u0003"+
		"\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0016\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qr\u0005,\u0000\u0000r\u0018\u0001\u0000"+
		"\u0000\u0000st\u0005|\u0000\u0000t\u001a\u0001\u0000\u0000\u0000uv\u0005"+
		":\u0000\u0000v\u001c\u0001\u0000\u0000\u0000wx\u0005;\u0000\u0000x\u001e"+
		"\u0001\u0000\u0000\u0000y{\u0007\u0004\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0006\u000f\u0000\u0000"+
		"\u007f \u0001\u0000\u0000\u0000\u0006\u0000)37n|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}