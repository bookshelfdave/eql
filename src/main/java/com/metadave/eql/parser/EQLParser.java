// Generated from ./src/main/java/com/metadave/eql/parser/EQL.g4 by ANTLR 4.5
package com.metadave.eql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INDEX=4, SORT=5, AGGREGATE=6, CONNECT=7, QUERY=8, 
		FILTER=9, ALL=10, GET=11, RETURNKW=12, FROM=13, WITH=14, ON=15, TO=16, 
		AND=17, OR=18, NOT=19, AT=20, DOLLAR=21, SPLAT=22, COMMA=23, LSQUARE=24, 
		RSQUARE=25, LPAREN=26, RPAREN=27, EQUALS=28, DOT=29, SEMI=30, ID=31, INT=32, 
		FLOAT=33, ANY_UNTIL_COLON=34, DOUBLE_STRING=35, SINGLE_STRING=36, DATA_CONTENT=37, 
		LINE_COMMENT=38, COMMENT=39, WS=40, WSCHARS=41;
	public static final int
		RULE_esql_stmts = 0, RULE_eql_connect_stmt = 1, RULE_eql_hostport = 2, 
		RULE_eql_index_stmt = 3, RULE_eql_get_stmt = 4, RULE_eql_query_stmt = 5, 
		RULE_eql_aggregate_stmt = 6, RULE_eql_aggregate_mappings = 7, RULE_eql_aggregate_mapping = 8, 
		RULE_eql_funcall = 9, RULE_eql_field_list = 10, RULE_eql_filter_stmt = 11, 
		RULE_eql_filter_pred = 12, RULE_eql_filter_rest = 13, RULE_eql_filter_pred_value = 14, 
		RULE_eql_return_stmt = 15, RULE_eql_sort_stmt = 16, RULE_eql_ascdesc = 17, 
		RULE_string_value = 18;
	public static final String[] ruleNames = {
		"esql_stmts", "eql_connect_stmt", "eql_hostport", "eql_index_stmt", "eql_get_stmt", 
		"eql_query_stmt", "eql_aggregate_stmt", "eql_aggregate_mappings", "eql_aggregate_mapping", 
		"eql_funcall", "eql_field_list", "eql_filter_stmt", "eql_filter_pred", 
		"eql_filter_rest", "eql_filter_pred_value", "eql_return_stmt", "eql_sort_stmt", 
		"eql_ascdesc", "string_value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'asc'", "'desc'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'@'", "'$'", "'*'", 
		"','", "'['", "']'", "'('", "')'", "'='", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "INDEX", "SORT", "AGGREGATE", "CONNECT", "QUERY", 
		"FILTER", "ALL", "GET", "RETURNKW", "FROM", "WITH", "ON", "TO", "AND", 
		"OR", "NOT", "AT", "DOLLAR", "SPLAT", "COMMA", "LSQUARE", "RSQUARE", "LPAREN", 
		"RPAREN", "EQUALS", "DOT", "SEMI", "ID", "INT", "FLOAT", "ANY_UNTIL_COLON", 
		"DOUBLE_STRING", "SINGLE_STRING", "DATA_CONTENT", "LINE_COMMENT", "COMMENT", 
		"WS", "WSCHARS"
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

	@Override
	public String getGrammarFileName() { return "EQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Esql_stmtsContext extends ParserRuleContext {
		public List<Eql_connect_stmtContext> eql_connect_stmt() {
			return getRuleContexts(Eql_connect_stmtContext.class);
		}
		public Eql_connect_stmtContext eql_connect_stmt(int i) {
			return getRuleContext(Eql_connect_stmtContext.class,i);
		}
		public List<Eql_query_stmtContext> eql_query_stmt() {
			return getRuleContexts(Eql_query_stmtContext.class);
		}
		public Eql_query_stmtContext eql_query_stmt(int i) {
			return getRuleContext(Eql_query_stmtContext.class,i);
		}
		public List<Eql_index_stmtContext> eql_index_stmt() {
			return getRuleContexts(Eql_index_stmtContext.class);
		}
		public Eql_index_stmtContext eql_index_stmt(int i) {
			return getRuleContext(Eql_index_stmtContext.class,i);
		}
		public List<Eql_get_stmtContext> eql_get_stmt() {
			return getRuleContexts(Eql_get_stmtContext.class);
		}
		public Eql_get_stmtContext eql_get_stmt(int i) {
			return getRuleContext(Eql_get_stmtContext.class,i);
		}
		public Esql_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esql_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEsql_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEsql_stmts(this);
		}
	}

	public final Esql_stmtsContext esql_stmts() throws RecognitionException {
		Esql_stmtsContext _localctx = new Esql_stmtsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_esql_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEX) | (1L << CONNECT) | (1L << QUERY) | (1L << GET))) != 0)) {
				{
				setState(42);
				switch (_input.LA(1)) {
				case CONNECT:
					{
					setState(38);
					eql_connect_stmt();
					}
					break;
				case QUERY:
					{
					setState(39);
					eql_query_stmt();
					}
					break;
				case INDEX:
					{
					setState(40);
					eql_index_stmt();
					}
					break;
				case GET:
					{
					setState(41);
					eql_get_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Eql_connect_stmtContext extends ParserRuleContext {
		public String_valueContext cluster_name;
		public Eql_hostportContext eql_hostport;
		public List<Eql_hostportContext> hps = new ArrayList<Eql_hostportContext>();
		public TerminalNode CONNECT() { return getToken(EQLParser.CONNECT, 0); }
		public List<Eql_hostportContext> eql_hostport() {
			return getRuleContexts(Eql_hostportContext.class);
		}
		public Eql_hostportContext eql_hostport(int i) {
			return getRuleContext(Eql_hostportContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EQLParser.COMMA, i);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Eql_connect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_connect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_connect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_connect_stmt(this);
		}
	}

	public final Eql_connect_stmtContext eql_connect_stmt() throws RecognitionException {
		Eql_connect_stmtContext _localctx = new Eql_connect_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eql_connect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(CONNECT);
			setState(49);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_STRING) | (1L << SINGLE_STRING) | (1L << DATA_CONTENT))) != 0)) {
				{
				setState(48);
				((Eql_connect_stmtContext)_localctx).cluster_name = string_value();
				}
			}

			setState(51);
			((Eql_connect_stmtContext)_localctx).eql_hostport = eql_hostport();
			((Eql_connect_stmtContext)_localctx).hps.add(((Eql_connect_stmtContext)_localctx).eql_hostport);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);
				setState(53);
				((Eql_connect_stmtContext)_localctx).eql_hostport = eql_hostport();
				((Eql_connect_stmtContext)_localctx).hps.add(((Eql_connect_stmtContext)_localctx).eql_hostport);
				}
				}
				setState(58);
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

	public static class Eql_hostportContext extends ParserRuleContext {
		public Token host;
		public Token port;
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(EQLParser.INT, 0); }
		public Eql_hostportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_hostport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_hostport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_hostport(this);
		}
	}

	public final Eql_hostportContext eql_hostport() throws RecognitionException {
		Eql_hostportContext _localctx = new Eql_hostportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eql_hostport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((Eql_hostportContext)_localctx).host = match(ID);
			setState(60);
			match(T__0);
			setState(61);
			((Eql_hostportContext)_localctx).port = match(INT);
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

	public static class Eql_index_stmtContext extends ParserRuleContext {
		public Token idx;
		public Token itype;
		public String_valueContext content;
		public TerminalNode INDEX() { return getToken(EQLParser.INDEX, 0); }
		public TerminalNode WITH() { return getToken(EQLParser.WITH, 0); }
		public TerminalNode EQUALS() { return getToken(EQLParser.EQUALS, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Eql_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_index_stmt(this);
		}
	}

	public final Eql_index_stmtContext eql_index_stmt() throws RecognitionException {
		Eql_index_stmtContext _localctx = new Eql_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eql_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(INDEX);
			setState(64);
			((Eql_index_stmtContext)_localctx).idx = match(ID);
			setState(65);
			match(WITH);
			setState(66);
			((Eql_index_stmtContext)_localctx).itype = match(ID);
			setState(67);
			match(EQUALS);
			setState(68);
			((Eql_index_stmtContext)_localctx).content = string_value();
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

	public static class Eql_get_stmtContext extends ParserRuleContext {
		public Token idx;
		public Token itype;
		public String_valueContext content;
		public TerminalNode GET() { return getToken(EQLParser.GET, 0); }
		public TerminalNode WITH() { return getToken(EQLParser.WITH, 0); }
		public TerminalNode EQUALS() { return getToken(EQLParser.EQUALS, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Eql_get_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_get_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_get_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_get_stmt(this);
		}
	}

	public final Eql_get_stmtContext eql_get_stmt() throws RecognitionException {
		Eql_get_stmtContext _localctx = new Eql_get_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eql_get_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(GET);
			setState(71);
			((Eql_get_stmtContext)_localctx).idx = match(ID);
			setState(72);
			match(WITH);
			setState(73);
			((Eql_get_stmtContext)_localctx).itype = match(ID);
			setState(74);
			match(EQUALS);
			setState(75);
			((Eql_get_stmtContext)_localctx).content = string_value();
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

	public static class Eql_query_stmtContext extends ParserRuleContext {
		public Token key;
		public TerminalNode QUERY() { return getToken(EQLParser.QUERY, 0); }
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public Eql_field_listContext eql_field_list() {
			return getRuleContext(Eql_field_listContext.class,0);
		}
		public Eql_filter_stmtContext eql_filter_stmt() {
			return getRuleContext(Eql_filter_stmtContext.class,0);
		}
		public Eql_aggregate_stmtContext eql_aggregate_stmt() {
			return getRuleContext(Eql_aggregate_stmtContext.class,0);
		}
		public Eql_return_stmtContext eql_return_stmt() {
			return getRuleContext(Eql_return_stmtContext.class,0);
		}
		public Eql_sort_stmtContext eql_sort_stmt() {
			return getRuleContext(Eql_sort_stmtContext.class,0);
		}
		public Eql_query_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_query_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_query_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_query_stmt(this);
		}
	}

	public final Eql_query_stmtContext eql_query_stmt() throws RecognitionException {
		Eql_query_stmtContext _localctx = new Eql_query_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eql_query_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(QUERY);
			setState(78);
			((Eql_query_stmtContext)_localctx).key = match(ID);
			setState(80);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(79);
				eql_field_list();
				}
			}

			setState(83);
			_la = _input.LA(1);
			if (_la==FILTER) {
				{
				setState(82);
				eql_filter_stmt();
				}
			}

			setState(86);
			_la = _input.LA(1);
			if (_la==AGGREGATE) {
				{
				setState(85);
				eql_aggregate_stmt();
				}
			}

			setState(89);
			_la = _input.LA(1);
			if (_la==RETURNKW) {
				{
				setState(88);
				eql_return_stmt();
				}
			}

			setState(92);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(91);
				eql_sort_stmt();
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

	public static class Eql_aggregate_stmtContext extends ParserRuleContext {
		public TerminalNode AGGREGATE() { return getToken(EQLParser.AGGREGATE, 0); }
		public Eql_aggregate_mappingsContext eql_aggregate_mappings() {
			return getRuleContext(Eql_aggregate_mappingsContext.class,0);
		}
		public Eql_aggregate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_aggregate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_aggregate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_aggregate_stmt(this);
		}
	}

	public final Eql_aggregate_stmtContext eql_aggregate_stmt() throws RecognitionException {
		Eql_aggregate_stmtContext _localctx = new Eql_aggregate_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eql_aggregate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(AGGREGATE);
			setState(95);
			eql_aggregate_mappings();
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

	public static class Eql_aggregate_mappingsContext extends ParserRuleContext {
		public Eql_aggregate_mappingContext eql_aggregate_mapping;
		public List<Eql_aggregate_mappingContext> am = new ArrayList<Eql_aggregate_mappingContext>();
		public List<Eql_aggregate_mappingContext> eql_aggregate_mapping() {
			return getRuleContexts(Eql_aggregate_mappingContext.class);
		}
		public Eql_aggregate_mappingContext eql_aggregate_mapping(int i) {
			return getRuleContext(Eql_aggregate_mappingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EQLParser.COMMA, i);
		}
		public Eql_aggregate_mappingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_aggregate_mappings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_aggregate_mappings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_aggregate_mappings(this);
		}
	}

	public final Eql_aggregate_mappingsContext eql_aggregate_mappings() throws RecognitionException {
		Eql_aggregate_mappingsContext _localctx = new Eql_aggregate_mappingsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eql_aggregate_mappings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((Eql_aggregate_mappingsContext)_localctx).eql_aggregate_mapping = eql_aggregate_mapping();
			((Eql_aggregate_mappingsContext)_localctx).am.add(((Eql_aggregate_mappingsContext)_localctx).eql_aggregate_mapping);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				((Eql_aggregate_mappingsContext)_localctx).eql_aggregate_mapping = eql_aggregate_mapping();
				((Eql_aggregate_mappingsContext)_localctx).am.add(((Eql_aggregate_mappingsContext)_localctx).eql_aggregate_mapping);
				}
				}
				setState(104);
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

	public static class Eql_aggregate_mappingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(EQLParser.EQUALS, 0); }
		public Eql_funcallContext eql_funcall() {
			return getRuleContext(Eql_funcallContext.class,0);
		}
		public Eql_aggregate_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_aggregate_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_aggregate_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_aggregate_mapping(this);
		}
	}

	public final Eql_aggregate_mappingContext eql_aggregate_mapping() throws RecognitionException {
		Eql_aggregate_mappingContext _localctx = new Eql_aggregate_mappingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eql_aggregate_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			match(ID);
			setState(106);
			match(EQUALS);
			setState(107);
			eql_funcall();
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

	public static class Eql_funcallContext extends ParserRuleContext {
		public Token funname;
		public Token field;
		public TerminalNode LPAREN() { return getToken(EQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EQLParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public Eql_funcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_funcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_funcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_funcall(this);
		}
	}

	public final Eql_funcallContext eql_funcall() throws RecognitionException {
		Eql_funcallContext _localctx = new Eql_funcallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eql_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((Eql_funcallContext)_localctx).funname = match(ID);
			setState(110);
			match(LPAREN);
			setState(111);
			((Eql_funcallContext)_localctx).field = match(ID);
			setState(112);
			match(RPAREN);
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

	public static class Eql_field_listContext extends ParserRuleContext {
		public Token ID;
		public List<Token> fields = new ArrayList<Token>();
		public TerminalNode LPAREN() { return getToken(EQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EQLParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EQLParser.COMMA, i);
		}
		public Eql_field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_field_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_field_list(this);
		}
	}

	public final Eql_field_listContext eql_field_list() throws RecognitionException {
		Eql_field_listContext _localctx = new Eql_field_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eql_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LPAREN);
			setState(115);
			((Eql_field_listContext)_localctx).ID = match(ID);
			((Eql_field_listContext)_localctx).fields.add(((Eql_field_listContext)_localctx).ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				((Eql_field_listContext)_localctx).ID = match(ID);
				((Eql_field_listContext)_localctx).fields.add(((Eql_field_listContext)_localctx).ID);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(RPAREN);
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

	public static class Eql_filter_stmtContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(EQLParser.FILTER, 0); }
		public Eql_filter_predContext eql_filter_pred() {
			return getRuleContext(Eql_filter_predContext.class,0);
		}
		public Eql_filter_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_filter_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_filter_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_filter_stmt(this);
		}
	}

	public final Eql_filter_stmtContext eql_filter_stmt() throws RecognitionException {
		Eql_filter_stmtContext _localctx = new Eql_filter_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eql_filter_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FILTER);
			setState(126);
			eql_filter_pred();
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

	public static class Eql_filter_predContext extends ParserRuleContext {
		public Token name;
		public Eql_filter_predContext childpred;
		public Eql_filter_pred_valueContext eql_filter_pred_value() {
			return getRuleContext(Eql_filter_pred_valueContext.class,0);
		}
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public Eql_filter_restContext eql_filter_rest() {
			return getRuleContext(Eql_filter_restContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EQLParser.RPAREN, 0); }
		public Eql_filter_predContext eql_filter_pred() {
			return getRuleContext(Eql_filter_predContext.class,0);
		}
		public Eql_filter_predContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_filter_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_filter_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_filter_pred(this);
		}
	}

	public final Eql_filter_predContext eql_filter_pred() throws RecognitionException {
		Eql_filter_predContext _localctx = new Eql_filter_predContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eql_filter_pred);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((Eql_filter_predContext)_localctx).name = match(ID);
				setState(129);
				match(EQUALS);
				setState(130);
				eql_filter_pred_value();
				setState(132);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(131);
					eql_filter_rest();
					}
					break;
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(LPAREN);
				setState(135);
				((Eql_filter_predContext)_localctx).childpred = eql_filter_pred();
				setState(136);
				match(RPAREN);
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

	public static class Eql_filter_restContext extends ParserRuleContext {
		public Eql_filter_predContext eql_filter_pred;
		public List<Eql_filter_predContext> ands = new ArrayList<Eql_filter_predContext>();
		public List<Eql_filter_predContext> ors = new ArrayList<Eql_filter_predContext>();
		public List<TerminalNode> AND() { return getTokens(EQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EQLParser.AND, i);
		}
		public List<Eql_filter_predContext> eql_filter_pred() {
			return getRuleContexts(Eql_filter_predContext.class);
		}
		public Eql_filter_predContext eql_filter_pred(int i) {
			return getRuleContext(Eql_filter_predContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(EQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(EQLParser.OR, i);
		}
		public Eql_filter_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_filter_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_filter_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_filter_rest(this);
		}
	}

	public final Eql_filter_restContext eql_filter_rest() throws RecognitionException {
		Eql_filter_restContext _localctx = new Eql_filter_restContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eql_filter_rest);
		try {
			int _alt;
			setState(152);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(140);
						match(AND);
						setState(141);
						((Eql_filter_restContext)_localctx).eql_filter_pred = eql_filter_pred();
						((Eql_filter_restContext)_localctx).ands.add(((Eql_filter_restContext)_localctx).eql_filter_pred);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(144); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(146);
						match(OR);
						setState(147);
						((Eql_filter_restContext)_localctx).eql_filter_pred = eql_filter_pred();
						((Eql_filter_restContext)_localctx).ors.add(((Eql_filter_restContext)_localctx).eql_filter_pred);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(150); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Eql_filter_pred_valueContext extends ParserRuleContext {
		public Token intval;
		public String_valueContext stringval;
		public TerminalNode INT() { return getToken(EQLParser.INT, 0); }
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Eql_filter_pred_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_filter_pred_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_filter_pred_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_filter_pred_value(this);
		}
	}

	public final Eql_filter_pred_valueContext eql_filter_pred_value() throws RecognitionException {
		Eql_filter_pred_valueContext _localctx = new Eql_filter_pred_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eql_filter_pred_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(154);
				((Eql_filter_pred_valueContext)_localctx).intval = match(INT);
				}
				break;
			case DOUBLE_STRING:
			case SINGLE_STRING:
			case DATA_CONTENT:
				{
				setState(155);
				((Eql_filter_pred_valueContext)_localctx).stringval = string_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Eql_return_stmtContext extends ParserRuleContext {
		public Token size;
		public Token lower;
		public TerminalNode RETURNKW() { return getToken(EQLParser.RETURNKW, 0); }
		public TerminalNode FROM() { return getToken(EQLParser.FROM, 0); }
		public List<TerminalNode> INT() { return getTokens(EQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EQLParser.INT, i);
		}
		public Eql_return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_return_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_return_stmt(this);
		}
	}

	public final Eql_return_stmtContext eql_return_stmt() throws RecognitionException {
		Eql_return_stmtContext _localctx = new Eql_return_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eql_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(RETURNKW);
			setState(160);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(159);
				((Eql_return_stmtContext)_localctx).size = match(INT);
				}
			}

			setState(164);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(162);
				match(FROM);
				setState(163);
				((Eql_return_stmtContext)_localctx).lower = match(INT);
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

	public static class Eql_sort_stmtContext extends ParserRuleContext {
		public Token ID;
		public List<Token> keys = new ArrayList<Token>();
		public Eql_ascdescContext eql_ascdesc;
		public List<Eql_ascdescContext> sorts = new ArrayList<Eql_ascdescContext>();
		public TerminalNode SORT() { return getToken(EQLParser.SORT, 0); }
		public TerminalNode ON() { return getToken(EQLParser.ON, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public List<Eql_ascdescContext> eql_ascdesc() {
			return getRuleContexts(Eql_ascdescContext.class);
		}
		public Eql_ascdescContext eql_ascdesc(int i) {
			return getRuleContext(Eql_ascdescContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EQLParser.COMMA, i);
		}
		public Eql_sort_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_sort_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_sort_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_sort_stmt(this);
		}
	}

	public final Eql_sort_stmtContext eql_sort_stmt() throws RecognitionException {
		Eql_sort_stmtContext _localctx = new Eql_sort_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eql_sort_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(SORT);
			setState(167);
			match(ON);
			setState(168);
			((Eql_sort_stmtContext)_localctx).ID = match(ID);
			((Eql_sort_stmtContext)_localctx).keys.add(((Eql_sort_stmtContext)_localctx).ID);
			setState(169);
			((Eql_sort_stmtContext)_localctx).eql_ascdesc = eql_ascdesc();
			((Eql_sort_stmtContext)_localctx).sorts.add(((Eql_sort_stmtContext)_localctx).eql_ascdesc);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170);
				match(COMMA);
				setState(171);
				((Eql_sort_stmtContext)_localctx).ID = match(ID);
				((Eql_sort_stmtContext)_localctx).keys.add(((Eql_sort_stmtContext)_localctx).ID);
				setState(172);
				((Eql_sort_stmtContext)_localctx).eql_ascdesc = eql_ascdesc();
				((Eql_sort_stmtContext)_localctx).sorts.add(((Eql_sort_stmtContext)_localctx).eql_ascdesc);
				}
				}
				setState(177);
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

	public static class Eql_ascdescContext extends ParserRuleContext {
		public Token asc;
		public Token desc;
		public Eql_ascdescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eql_ascdesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterEql_ascdesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitEql_ascdesc(this);
		}
	}

	public final Eql_ascdescContext eql_ascdesc() throws RecognitionException {
		Eql_ascdescContext _localctx = new Eql_ascdescContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eql_ascdesc);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((Eql_ascdescContext)_localctx).asc = match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((Eql_ascdescContext)_localctx).desc = match(T__2);
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

	public static class String_valueContext extends ParserRuleContext {
		public TerminalNode SINGLE_STRING() { return getToken(EQLParser.SINGLE_STRING, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(EQLParser.DOUBLE_STRING, 0); }
		public TerminalNode DATA_CONTENT() { return getToken(EQLParser.DATA_CONTENT, 0); }
		public String_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterString_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitString_value(this);
		}
	}

	public final String_valueContext string_value() throws RecognitionException {
		String_valueContext _localctx = new String_valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_STRING) | (1L << SINGLE_STRING) | (1L << DATA_CONTENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3\3"+
		"\5\3\64\n\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7S\n"+
		"\7\3\7\5\7V\n\7\3\7\5\7Y\n\7\3\7\5\7\\\n\7\3\7\5\7_\n\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\5\16\u0087\n\16\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3"+
		"\17\3\17\6\17\u0091\n\17\r\17\16\17\u0092\3\17\3\17\6\17\u0097\n\17\r"+
		"\17\16\17\u0098\5\17\u009b\n\17\3\20\3\20\5\20\u009f\n\20\3\21\3\21\5"+
		"\21\u00a3\n\21\3\21\3\21\5\21\u00a7\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00b0\n\22\f\22\16\22\u00b3\13\22\3\23\3\23\5\23\u00b7\n\23"+
		"\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3"+
		"\3\2%\'\u00be\2.\3\2\2\2\4\61\3\2\2\2\6=\3\2\2\2\bA\3\2\2\2\nH\3\2\2\2"+
		"\fO\3\2\2\2\16`\3\2\2\2\20c\3\2\2\2\22k\3\2\2\2\24o\3\2\2\2\26t\3\2\2"+
		"\2\30\177\3\2\2\2\32\u008c\3\2\2\2\34\u009a\3\2\2\2\36\u009e\3\2\2\2 "+
		"\u00a0\3\2\2\2\"\u00a8\3\2\2\2$\u00b6\3\2\2\2&\u00b8\3\2\2\2(-\5\4\3\2"+
		")-\5\f\7\2*-\5\b\5\2+-\5\n\6\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2"+
		"-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60.\3\2\2\2\61\63\7\t\2\2"+
		"\62\64\5&\24\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65:\5\6\4\2\66"+
		"\67\7\31\2\2\679\5\6\4\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5"+
		"\3\2\2\2<:\3\2\2\2=>\7!\2\2>?\7\3\2\2?@\7\"\2\2@\7\3\2\2\2AB\7\6\2\2B"+
		"C\7!\2\2CD\7\20\2\2DE\7!\2\2EF\7\36\2\2FG\5&\24\2G\t\3\2\2\2HI\7\r\2\2"+
		"IJ\7!\2\2JK\7\20\2\2KL\7!\2\2LM\7\36\2\2MN\5&\24\2N\13\3\2\2\2OP\7\n\2"+
		"\2PR\7!\2\2QS\5\26\f\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\30\r\2UT\3\2"+
		"\2\2UV\3\2\2\2VX\3\2\2\2WY\5\16\b\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\5"+
		" \21\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\5\"\22\2^]\3\2\2\2^_\3\2\2\2"+
		"_\r\3\2\2\2`a\7\b\2\2ab\5\20\t\2b\17\3\2\2\2ch\5\22\n\2de\7\31\2\2eg\5"+
		"\22\n\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\21\3\2\2\2jh\3\2\2\2"+
		"kl\7!\2\2lm\7\36\2\2mn\5\24\13\2n\23\3\2\2\2op\7!\2\2pq\7\34\2\2qr\7!"+
		"\2\2rs\7\35\2\2s\25\3\2\2\2tu\7\34\2\2uz\7!\2\2vw\7\31\2\2wy\7!\2\2xv"+
		"\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\35\2\2"+
		"~\27\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\5\32\16\2\u0081\31\3\2\2\2"+
		"\u0082\u0083\7!\2\2\u0083\u0084\7\36\2\2\u0084\u0086\5\36\20\2\u0085\u0087"+
		"\5\34\17\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008d\3\2\2\2"+
		"\u0088\u0089\7\34\2\2\u0089\u008a\5\32\16\2\u008a\u008b\7\35\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0088\3\2\2\2\u008d\33\3\2\2"+
		"\2\u008e\u008f\7\23\2\2\u008f\u0091\5\32\16\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009b\3\2"+
		"\2\2\u0094\u0095\7\24\2\2\u0095\u0097\5\32\16\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0090\3\2\2\2\u009a\u0096\3\2\2\2\u009b\35\3\2\2\2\u009c\u009f"+
		"\7\"\2\2\u009d\u009f\5&\24\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\37\3\2\2\2\u00a0\u00a2\7\16\2\2\u00a1\u00a3\7\"\2\2\u00a2\u00a1\3\2\2"+
		"\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\7\17\2\2\u00a5"+
		"\u00a7\7\"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7!\3\2\2\2"+
		"\u00a8\u00a9\7\7\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\7!\2\2\u00ab\u00b1"+
		"\5$\23\2\u00ac\u00ad\7\31\2\2\u00ad\u00ae\7!\2\2\u00ae\u00b0\5$\23\2\u00af"+
		"\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2#\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\7\4\2\2\u00b5\u00b7"+
		"\7\5\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7%\3\2\2\2\u00b8"+
		"\u00b9\t\2\2\2\u00b9\'\3\2\2\2\27,.\63:RUX[^hz\u0086\u008c\u0092\u0098"+
		"\u009a\u009e\u00a2\u00a6\u00b1\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}