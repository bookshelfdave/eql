// Generated from ./src/main/java/com/metadave/eql/parser/EQL.g4 by ANTLR 4.5
package com.metadave.eql.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INDEX=5, SORT=6, CONNECT=7, QUERY=8, ALL=9, 
		GET=10, RETURNKW=11, FROM=12, WITH=13, ON=14, TO=15, AND=16, OR=17, NOT=18, 
		AT=19, DOLLAR=20, SPLAT=21, COMMA=22, LSQUARE=23, RSQUARE=24, LPAREN=25, 
		RPAREN=26, EQUALS=27, DOT=28, SEMI=29, ID=30, INT=31, FLOAT=32, DOUBLE_STRING=33, 
		SINGLE_STRING=34, DATA_CONTENT=35, LINE_COMMENT=36, COMMENT=37, WS=38, 
		WSCHARS=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "INDEX", "SORT", "CONNECT", "QUERY", "ALL", 
		"GET", "RETURNKW", "FROM", "WITH", "ON", "TO", "AND", "OR", "NOT", "AT", 
		"DOLLAR", "SPLAT", "COMMA", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", 
		"EQUALS", "DOT", "SEMI", "ID", "LOWER", "UPPER", "INT", "DIGIT", "FLOAT", 
		"DOUBLE_STRING", "ESC", "SINGLE_STRING", "SESC", "DATA_CONTENT", "DATA_ESC", 
		"LINE_COMMENT", "COMMENT", "WS", "WSCHARS", "Zs", "Cc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'filter'", "'asc'", "'desc'", "'index'", "'sort'", "'connect'", 
		"'query'", "'all'", "'get'", "'return'", "'from'", "'with'", "'on'", "'to'", 
		"'and'", "'or'", "'not'", "'@'", "'$'", "'*'", "','", "'['", "']'", "'('", 
		"')'", "'='", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INDEX", "SORT", "CONNECT", "QUERY", "ALL", 
		"GET", "RETURNKW", "FROM", "WITH", "ON", "TO", "AND", "OR", "NOT", "AT", 
		"DOLLAR", "SPLAT", "COMMA", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", 
		"EQUALS", "DOT", "SEMI", "ID", "INT", "FLOAT", "DOUBLE_STRING", "SINGLE_STRING", 
		"DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS", "WSCHARS"
	};
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


	public EQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u015b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u00d2\n\37\f\37\16\37"+
		"\u00d5\13\37\3 \3 \3!\3!\3\"\6\"\u00dc\n\"\r\"\16\"\u00dd\3#\3#\3$\6$"+
		"\u00e3\n$\r$\16$\u00e4\3$\3$\7$\u00e9\n$\f$\16$\u00ec\13$\3$\3$\6$\u00f0"+
		"\n$\r$\16$\u00f1\5$\u00f4\n$\3%\3%\3%\7%\u00f9\n%\f%\16%\u00fc\13%\3%"+
		"\3%\3&\3&\3&\3&\5&\u0104\n&\3\'\3\'\3\'\7\'\u0109\n\'\f\'\16\'\u010c\13"+
		"\'\3\'\3\'\3(\3(\3(\3(\5(\u0114\n(\3)\3)\3)\3)\3)\3)\7)\u011c\n)\f)\16"+
		")\u011f\13)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u012d\n*\3+\3+\3+\3"+
		"+\7+\u0133\n+\f+\16+\u0136\13+\3+\5+\u0139\n+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\7,\u0143\n,\f,\16,\u0146\13,\3,\3,\3,\3,\3,\3-\3-\3-\6-\u0150\n-\r-\16"+
		"-\u0151\3-\3-\3.\3.\3/\3/\3\60\3\60\7\u00fa\u010a\u011d\u0134\u0144\2"+
		"\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?\2A\2C!E\2G\"I#K\2M$O\2Q%S\2U&W\'Y([)]\2_\2\3\2\6\4\2\60\60aa\5"+
		"\2\13\f\17\17\"\"\t\2\"\"\u00a2\u00a2\u1682\u1682\u2002\u200c\u2031\u2031"+
		"\u2061\u2061\u3002\u3002\4\2\2!\u0081\u00a1\u016a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2C\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7j\3\2\2\2\tn\3\2\2\2\13"+
		"s\3\2\2\2\ry\3\2\2\2\17~\3\2\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2\25"+
		"\u0090\3\2\2\2\27\u0094\3\2\2\2\31\u009b\3\2\2\2\33\u00a0\3\2\2\2\35\u00a5"+
		"\3\2\2\2\37\u00a8\3\2\2\2!\u00ab\3\2\2\2#\u00af\3\2\2\2%\u00b2\3\2\2\2"+
		"\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00be\3"+
		"\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3\2"+
		"\2\29\u00c8\3\2\2\2;\u00ca\3\2\2\2=\u00cc\3\2\2\2?\u00d6\3\2\2\2A\u00d8"+
		"\3\2\2\2C\u00db\3\2\2\2E\u00df\3\2\2\2G\u00f3\3\2\2\2I\u00f5\3\2\2\2K"+
		"\u0103\3\2\2\2M\u0105\3\2\2\2O\u0113\3\2\2\2Q\u0115\3\2\2\2S\u012c\3\2"+
		"\2\2U\u012e\3\2\2\2W\u013e\3\2\2\2Y\u014f\3\2\2\2[\u0155\3\2\2\2]\u0157"+
		"\3\2\2\2_\u0159\3\2\2\2ab\7<\2\2b\4\3\2\2\2cd\7h\2\2de\7k\2\2ef\7n\2\2"+
		"fg\7v\2\2gh\7g\2\2hi\7t\2\2i\6\3\2\2\2jk\7c\2\2kl\7u\2\2lm\7e\2\2m\b\3"+
		"\2\2\2no\7f\2\2op\7g\2\2pq\7u\2\2qr\7e\2\2r\n\3\2\2\2st\7k\2\2tu\7p\2"+
		"\2uv\7f\2\2vw\7g\2\2wx\7z\2\2x\f\3\2\2\2yz\7u\2\2z{\7q\2\2{|\7t\2\2|}"+
		"\7v\2\2}\16\3\2\2\2~\177\7e\2\2\177\u0080\7q\2\2\u0080\u0081\7p\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7g\2\2\u0083\u0084\7e\2\2\u0084\u0085\7v\2\2"+
		"\u0085\20\3\2\2\2\u0086\u0087\7s\2\2\u0087\u0088\7w\2\2\u0088\u0089\7"+
		"g\2\2\u0089\u008a\7t\2\2\u008a\u008b\7{\2\2\u008b\22\3\2\2\2\u008c\u008d"+
		"\7c\2\2\u008d\u008e\7n\2\2\u008e\u008f\7n\2\2\u008f\24\3\2\2\2\u0090\u0091"+
		"\7i\2\2\u0091\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093\26\3\2\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7p\2\2\u009a\30\3\2\2\2\u009b\u009c\7h\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7q\2\2\u009e\u009f\7o\2\2\u009f\32\3\2\2\2\u00a0"+
		"\u00a1\7y\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7j\2\2"+
		"\u00a4\34\3\2\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2\u00a7\36\3\2\2"+
		"\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7q\2\2\u00aa \3\2\2\2\u00ab\u00ac\7"+
		"c\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7f\2\2\u00ae\"\3\2\2\2\u00af\u00b0"+
		"\7q\2\2\u00b0\u00b1\7t\2\2\u00b1$\3\2\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7v\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7B\2\2\u00b7(\3"+
		"\2\2\2\u00b8\u00b9\7&\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb,\3\2"+
		"\2\2\u00bc\u00bd\7.\2\2\u00bd.\3\2\2\2\u00be\u00bf\7]\2\2\u00bf\60\3\2"+
		"\2\2\u00c0\u00c1\7_\2\2\u00c1\62\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3\64\3"+
		"\2\2\2\u00c4\u00c5\7+\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7?\2\2\u00c78\3"+
		"\2\2\2\u00c8\u00c9\7\60\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7=\2\2\u00cb<\3"+
		"\2\2\2\u00cc\u00d3\5? \2\u00cd\u00d2\5A!\2\u00ce\u00d2\5? \2\u00cf\u00d2"+
		"\5E#\2\u00d0\u00d2\t\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4>\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7"+
		"\4c|\2\u00d7@\3\2\2\2\u00d8\u00d9\4C\\\2\u00d9B\3\2\2\2\u00da\u00dc\5"+
		"E#\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00deD\3\2\2\2\u00df\u00e0\4\62;\2\u00e0F\3\2\2\2\u00e1"+
		"\u00e3\5E#\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2"+
		"\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ea\59\35\2\u00e7\u00e9"+
		"\5E#\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00f4\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\59"+
		"\35\2\u00ee\u00f0\5E#\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e2\3\2"+
		"\2\2\u00f3\u00ed\3\2\2\2\u00f4H\3\2\2\2\u00f5\u00fa\7$\2\2\u00f6\u00f9"+
		"\5K&\2\u00f7\u00f9\13\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7$\2\2\u00feJ\3\2\2\2\u00ff\u0100"+
		"\7^\2\2\u0100\u0104\7$\2\2\u0101\u0102\7^\2\2\u0102\u0104\7^\2\2\u0103"+
		"\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u0104L\3\2\2\2\u0105\u010a\7)\2\2\u0106"+
		"\u0109\5O(\2\u0107\u0109\13\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7)\2\2\u010eN\3\2\2\2\u010f"+
		"\u0110\7^\2\2\u0110\u0114\7)\2\2\u0111\u0112\7^\2\2\u0112\u0114\7^\2\2"+
		"\u0113\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0114P\3\2\2\2\u0115\u0116\7"+
		"\u0080\2\2\u0116\u0117\7\'\2\2\u0117\u0118\7\u0080\2\2\u0118\u011d\3\2"+
		"\2\2\u0119\u011c\5S*\2\u011a\u011c\13\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\u0080\2\2\u0121"+
		"\u0122\7\'\2\2\u0122\u0123\7\u0080\2\2\u0123R\3\2\2\2\u0124\u0125\7^\2"+
		"\2\u0125\u0126\7\u0080\2\2\u0126\u0127\7\'\2\2\u0127\u012d\7\u0080\2\2"+
		"\u0128\u0129\7^\2\2\u0129\u012a\7\u0080\2\2\u012a\u012b\7\'\2\2\u012b"+
		"\u012d\7\u0080\2\2\u012c\u0124\3\2\2\2\u012c\u0128\3\2\2\2\u012dT\3\2"+
		"\2\2\u012e\u012f\7\61\2\2\u012f\u0130\7\61\2\2\u0130\u0134\3\2\2\2\u0131"+
		"\u0133\13\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0135\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0139\7\17\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3"+
		"\2\2\2\u013a\u013b\7\f\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b+\2\2\u013d"+
		"V\3\2\2\2\u013e\u013f\7\61\2\2\u013f\u0140\7,\2\2\u0140\u0144\3\2\2\2"+
		"\u0141\u0143\13\2\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0148\7,\2\2\u0148\u0149\7\61\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b,"+
		"\2\2\u014bX\3\2\2\2\u014c\u0150\5[.\2\u014d\u0150\5]/\2\u014e\u0150\5"+
		"_\60\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0154\b-\3\2\u0154Z\3\2\2\2\u0155\u0156\t\3\2\2\u0156\\\3\2"+
		"\2\2\u0157\u0158\t\4\2\2\u0158^\3\2\2\2\u0159\u015a\t\5\2\2\u015a`\3\2"+
		"\2\2\30\2\u00d1\u00d3\u00dd\u00e4\u00ea\u00f1\u00f3\u00f8\u00fa\u0103"+
		"\u0108\u010a\u0113\u011b\u011d\u012c\u0134\u0138\u0144\u014f\u0151\4\b"+
		"\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}