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
		T__0=1, T__1=2, T__2=3, T__3=4, INDEX=5, SORT=6, CONNECT=7, QUERY=8, ALL=9, 
		GET=10, RETURNKW=11, FROM=12, WITH=13, ON=14, TO=15, AND=16, OR=17, NOT=18, 
		AT=19, DOLLAR=20, SPLAT=21, COMMA=22, LSQUARE=23, RSQUARE=24, LPAREN=25, 
		RPAREN=26, EQUALS=27, DOT=28, SEMI=29, ID=30, INT=31, FLOAT=32, DOUBLE_STRING=33, 
		SINGLE_STRING=34, DATA_CONTENT=35, LINE_COMMENT=36, COMMENT=37, WS=38, 
		WSCHARS=39;
	public static final int
		RULE_stmts = 0, RULE_connect_stmt = 1, RULE_hostport = 2, RULE_index_stmt = 3, 
		RULE_get_stmt = 4, RULE_query_stmt = 5, RULE_field_list = 6, RULE_filter_stmt = 7, 
		RULE_filter_pred = 8, RULE_filter_rest = 9, RULE_return_stmt = 10, RULE_sort_stmt = 11, 
		RULE_ascdesc = 12, RULE_string_value = 13;
	public static final String[] ruleNames = {
		"stmts", "connect_stmt", "hostport", "index_stmt", "get_stmt", "query_stmt", 
		"field_list", "filter_stmt", "filter_pred", "filter_rest", "return_stmt", 
		"sort_stmt", "ascdesc", "string_value"
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
	public static class StmtsContext extends ParserRuleContext {
		public Connect_stmtContext connect_stmt() {
			return getRuleContext(Connect_stmtContext.class,0);
		}
		public List<Query_stmtContext> query_stmt() {
			return getRuleContexts(Query_stmtContext.class);
		}
		public Query_stmtContext query_stmt(int i) {
			return getRuleContext(Query_stmtContext.class,i);
		}
		public List<Index_stmtContext> index_stmt() {
			return getRuleContexts(Index_stmtContext.class);
		}
		public Index_stmtContext index_stmt(int i) {
			return getRuleContext(Index_stmtContext.class,i);
		}
		public List<Get_stmtContext> get_stmt() {
			return getRuleContexts(Get_stmtContext.class);
		}
		public Get_stmtContext get_stmt(int i) {
			return getRuleContext(Get_stmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if (_la==CONNECT) {
				{
				setState(28);
				connect_stmt();
				}
			}

			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEX) | (1L << QUERY) | (1L << GET))) != 0)) {
				{
				setState(34);
				switch (_input.LA(1)) {
				case QUERY:
					{
					setState(31);
					query_stmt();
					}
					break;
				case INDEX:
					{
					setState(32);
					index_stmt();
					}
					break;
				case GET:
					{
					setState(33);
					get_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
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

	public static class Connect_stmtContext extends ParserRuleContext {
		public Token clusterName;
		public HostportContext hostport;
		public List<HostportContext> hps = new ArrayList<HostportContext>();
		public TerminalNode CONNECT() { return getToken(EQLParser.CONNECT, 0); }
		public TerminalNode SEMI() { return getToken(EQLParser.SEMI, 0); }
		public List<HostportContext> hostport() {
			return getRuleContexts(HostportContext.class);
		}
		public HostportContext hostport(int i) {
			return getRuleContext(HostportContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EQLParser.COMMA, i);
		}
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public Connect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterConnect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitConnect_stmt(this);
		}
	}

	public final Connect_stmtContext connect_stmt() throws RecognitionException {
		Connect_stmtContext _localctx = new Connect_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_connect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(CONNECT);
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(40);
				((Connect_stmtContext)_localctx).clusterName = match(ID);
				}
				break;
			}
			setState(43);
			((Connect_stmtContext)_localctx).hostport = hostport();
			((Connect_stmtContext)_localctx).hps.add(((Connect_stmtContext)_localctx).hostport);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(44);
				match(COMMA);
				setState(45);
				((Connect_stmtContext)_localctx).hostport = hostport();
				((Connect_stmtContext)_localctx).hps.add(((Connect_stmtContext)_localctx).hostport);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(SEMI);
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

	public static class HostportContext extends ParserRuleContext {
		public Token host;
		public Token port;
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(EQLParser.INT, 0); }
		public HostportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterHostport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitHostport(this);
		}
	}

	public final HostportContext hostport() throws RecognitionException {
		HostportContext _localctx = new HostportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hostport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((HostportContext)_localctx).host = match(ID);
			setState(54);
			match(T__0);
			setState(55);
			((HostportContext)_localctx).port = match(INT);
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

	public static class Index_stmtContext extends ParserRuleContext {
		public Token idx;
		public Token itype;
		public String_valueContext content;
		public TerminalNode INDEX() { return getToken(EQLParser.INDEX, 0); }
		public TerminalNode WITH() { return getToken(EQLParser.WITH, 0); }
		public TerminalNode EQUALS() { return getToken(EQLParser.EQUALS, 0); }
		public TerminalNode SEMI() { return getToken(EQLParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterIndex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitIndex_stmt(this);
		}
	}

	public final Index_stmtContext index_stmt() throws RecognitionException {
		Index_stmtContext _localctx = new Index_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(INDEX);
			setState(58);
			((Index_stmtContext)_localctx).idx = match(ID);
			setState(59);
			match(WITH);
			setState(60);
			((Index_stmtContext)_localctx).itype = match(ID);
			setState(61);
			match(EQUALS);
			setState(62);
			((Index_stmtContext)_localctx).content = string_value();
			setState(63);
			match(SEMI);
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

	public static class Get_stmtContext extends ParserRuleContext {
		public Token idx;
		public Token itype;
		public String_valueContext content;
		public TerminalNode GET() { return getToken(EQLParser.GET, 0); }
		public TerminalNode WITH() { return getToken(EQLParser.WITH, 0); }
		public TerminalNode EQUALS() { return getToken(EQLParser.EQUALS, 0); }
		public TerminalNode SEMI() { return getToken(EQLParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Get_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterGet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitGet_stmt(this);
		}
	}

	public final Get_stmtContext get_stmt() throws RecognitionException {
		Get_stmtContext _localctx = new Get_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_get_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(GET);
			setState(66);
			((Get_stmtContext)_localctx).idx = match(ID);
			setState(67);
			match(WITH);
			setState(68);
			((Get_stmtContext)_localctx).itype = match(ID);
			setState(69);
			match(EQUALS);
			setState(70);
			((Get_stmtContext)_localctx).content = string_value();
			setState(71);
			match(SEMI);
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

	public static class Query_stmtContext extends ParserRuleContext {
		public Token key;
		public TerminalNode QUERY() { return getToken(EQLParser.QUERY, 0); }
		public TerminalNode SEMI() { return getToken(EQLParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Filter_stmtContext filter_stmt() {
			return getRuleContext(Filter_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Sort_stmtContext sort_stmt() {
			return getRuleContext(Sort_stmtContext.class,0);
		}
		public Query_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterQuery_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitQuery_stmt(this);
		}
	}

	public final Query_stmtContext query_stmt() throws RecognitionException {
		Query_stmtContext _localctx = new Query_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_query_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(QUERY);
			setState(74);
			((Query_stmtContext)_localctx).key = match(ID);
			setState(76);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(75);
				field_list();
				}
			}

			setState(79);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(78);
				filter_stmt();
				}
			}

			setState(82);
			_la = _input.LA(1);
			if (_la==RETURNKW) {
				{
				setState(81);
				return_stmt();
				}
			}

			setState(85);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(84);
				sort_stmt();
				}
			}

			setState(87);
			match(SEMI);
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

	public static class Field_listContext extends ParserRuleContext {
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
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterField_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitField_list(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LPAREN);
			setState(90);
			((Field_listContext)_localctx).ID = match(ID);
			((Field_listContext)_localctx).fields.add(((Field_listContext)_localctx).ID);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				((Field_listContext)_localctx).ID = match(ID);
				((Field_listContext)_localctx).fields.add(((Field_listContext)_localctx).ID);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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

	public static class Filter_stmtContext extends ParserRuleContext {
		public Filter_predContext filter_pred() {
			return getRuleContext(Filter_predContext.class,0);
		}
		public Filter_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterFilter_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitFilter_stmt(this);
		}
	}

	public final Filter_stmtContext filter_stmt() throws RecognitionException {
		Filter_stmtContext _localctx = new Filter_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_filter_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__1);
			setState(101);
			filter_pred();
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

	public static class Filter_predContext extends ParserRuleContext {
		public Token name;
		public Token intval;
		public String_valueContext stringval;
		public Filter_predContext childpred;
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(EQLParser.INT, 0); }
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Filter_restContext filter_rest() {
			return getRuleContext(Filter_restContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EQLParser.RPAREN, 0); }
		public Filter_predContext filter_pred() {
			return getRuleContext(Filter_predContext.class,0);
		}
		public Filter_predContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterFilter_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitFilter_pred(this);
		}
	}

	public final Filter_predContext filter_pred() throws RecognitionException {
		Filter_predContext _localctx = new Filter_predContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_filter_pred);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((Filter_predContext)_localctx).name = match(ID);
				setState(104);
				match(EQUALS);
				setState(107);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(105);
					((Filter_predContext)_localctx).intval = match(INT);
					}
					break;
				case DOUBLE_STRING:
				case SINGLE_STRING:
				case DATA_CONTENT:
					{
					setState(106);
					((Filter_predContext)_localctx).stringval = string_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(109);
					filter_rest();
					}
					break;
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(LPAREN);
				setState(113);
				((Filter_predContext)_localctx).childpred = filter_pred();
				setState(114);
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

	public static class Filter_restContext extends ParserRuleContext {
		public Filter_predContext filter_pred;
		public List<Filter_predContext> ands = new ArrayList<Filter_predContext>();
		public List<Filter_predContext> ors = new ArrayList<Filter_predContext>();
		public List<TerminalNode> AND() { return getTokens(EQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EQLParser.AND, i);
		}
		public List<Filter_predContext> filter_pred() {
			return getRuleContexts(Filter_predContext.class);
		}
		public Filter_predContext filter_pred(int i) {
			return getRuleContext(Filter_predContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(EQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(EQLParser.OR, i);
		}
		public Filter_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterFilter_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitFilter_rest(this);
		}
	}

	public final Filter_restContext filter_rest() throws RecognitionException {
		Filter_restContext _localctx = new Filter_restContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filter_rest);
		try {
			int _alt;
			setState(130);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(118);
						match(AND);
						setState(119);
						((Filter_restContext)_localctx).filter_pred = filter_pred();
						((Filter_restContext)_localctx).ands.add(((Filter_restContext)_localctx).filter_pred);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(122); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(124);
						match(OR);
						setState(125);
						((Filter_restContext)_localctx).filter_pred = filter_pred();
						((Filter_restContext)_localctx).ors.add(((Filter_restContext)_localctx).filter_pred);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
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

	public static class Return_stmtContext extends ParserRuleContext {
		public Token size;
		public Token lower;
		public TerminalNode RETURNKW() { return getToken(EQLParser.RETURNKW, 0); }
		public TerminalNode FROM() { return getToken(EQLParser.FROM, 0); }
		public List<TerminalNode> INT() { return getTokens(EQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EQLParser.INT, i);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(RETURNKW);
			setState(134);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(133);
				((Return_stmtContext)_localctx).size = match(INT);
				}
			}

			setState(138);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(136);
				match(FROM);
				setState(137);
				((Return_stmtContext)_localctx).lower = match(INT);
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

	public static class Sort_stmtContext extends ParserRuleContext {
		public Token ID;
		public List<Token> keys = new ArrayList<Token>();
		public AscdescContext ascdesc;
		public List<AscdescContext> sorts = new ArrayList<AscdescContext>();
		public TerminalNode SORT() { return getToken(EQLParser.SORT, 0); }
		public TerminalNode ON() { return getToken(EQLParser.ON, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public List<AscdescContext> ascdesc() {
			return getRuleContexts(AscdescContext.class);
		}
		public AscdescContext ascdesc(int i) {
			return getRuleContext(AscdescContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EQLParser.COMMA, i);
		}
		public Sort_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterSort_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitSort_stmt(this);
		}
	}

	public final Sort_stmtContext sort_stmt() throws RecognitionException {
		Sort_stmtContext _localctx = new Sort_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sort_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(SORT);
			setState(141);
			match(ON);
			setState(142);
			((Sort_stmtContext)_localctx).ID = match(ID);
			((Sort_stmtContext)_localctx).keys.add(((Sort_stmtContext)_localctx).ID);
			setState(143);
			((Sort_stmtContext)_localctx).ascdesc = ascdesc();
			((Sort_stmtContext)_localctx).sorts.add(((Sort_stmtContext)_localctx).ascdesc);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				((Sort_stmtContext)_localctx).ID = match(ID);
				((Sort_stmtContext)_localctx).keys.add(((Sort_stmtContext)_localctx).ID);
				setState(146);
				((Sort_stmtContext)_localctx).ascdesc = ascdesc();
				((Sort_stmtContext)_localctx).sorts.add(((Sort_stmtContext)_localctx).ascdesc);
				}
				}
				setState(151);
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

	public static class AscdescContext extends ParserRuleContext {
		public Token asc;
		public Token desc;
		public AscdescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascdesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterAscdesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitAscdesc(this);
		}
	}

	public final AscdescContext ascdesc() throws RecognitionException {
		AscdescContext _localctx = new AscdescContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ascdesc);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				((AscdescContext)_localctx).asc = match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((AscdescContext)_localctx).desc = match(T__3);
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
		enterRule(_localctx, 26, RULE_string_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\3\2\7\2%"+
		"\n\2\f\2\16\2(\13\2\3\3\3\3\5\3,\n\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7O\n\7\3\7\5\7R\n\7\3\7\5\7U\n"+
		"\7\3\7\5\7X\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nn\n\n\3\n\5\nq\n\n\3\n\3\n\3\n\3\n\5"+
		"\nw\n\n\3\13\3\13\6\13{\n\13\r\13\16\13|\3\13\3\13\6\13\u0081\n\13\r\13"+
		"\16\13\u0082\5\13\u0085\n\13\3\f\3\f\5\f\u0089\n\f\3\f\3\f\5\f\u008d\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0096\n\r\f\r\16\r\u0099\13\r\3\16"+
		"\3\16\5\16\u009d\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\2\3\3\2#%\u00a7\2\37\3\2\2\2\4)\3\2\2\2\6\67\3\2\2\2\b;\3\2"+
		"\2\2\nC\3\2\2\2\fK\3\2\2\2\16[\3\2\2\2\20f\3\2\2\2\22v\3\2\2\2\24\u0084"+
		"\3\2\2\2\26\u0086\3\2\2\2\30\u008e\3\2\2\2\32\u009c\3\2\2\2\34\u009e\3"+
		"\2\2\2\36 \5\4\3\2\37\36\3\2\2\2\37 \3\2\2\2 &\3\2\2\2!%\5\f\7\2\"%\5"+
		"\b\5\2#%\5\n\6\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'"+
		"\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)+\7\t\2\2*,\7 \2\2+*\3\2\2\2+,\3\2\2\2"+
		",-\3\2\2\2-\62\5\6\4\2./\7\30\2\2/\61\5\6\4\2\60.\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\37"+
		"\2\2\66\5\3\2\2\2\678\7 \2\289\7\3\2\29:\7!\2\2:\7\3\2\2\2;<\7\7\2\2<"+
		"=\7 \2\2=>\7\17\2\2>?\7 \2\2?@\7\35\2\2@A\5\34\17\2AB\7\37\2\2B\t\3\2"+
		"\2\2CD\7\f\2\2DE\7 \2\2EF\7\17\2\2FG\7 \2\2GH\7\35\2\2HI\5\34\17\2IJ\7"+
		"\37\2\2J\13\3\2\2\2KL\7\n\2\2LN\7 \2\2MO\5\16\b\2NM\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PR\5\20\t\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\5\26\f\2TS\3\2\2"+
		"\2TU\3\2\2\2UW\3\2\2\2VX\5\30\r\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\37"+
		"\2\2Z\r\3\2\2\2[\\\7\33\2\2\\a\7 \2\2]^\7\30\2\2^`\7 \2\2_]\3\2\2\2`c"+
		"\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\34\2\2e\17\3\2\2"+
		"\2fg\7\4\2\2gh\5\22\n\2h\21\3\2\2\2ij\7 \2\2jm\7\35\2\2kn\7!\2\2ln\5\34"+
		"\17\2mk\3\2\2\2ml\3\2\2\2np\3\2\2\2oq\5\24\13\2po\3\2\2\2pq\3\2\2\2qw"+
		"\3\2\2\2rs\7\33\2\2st\5\22\n\2tu\7\34\2\2uw\3\2\2\2vi\3\2\2\2vr\3\2\2"+
		"\2w\23\3\2\2\2xy\7\22\2\2y{\5\22\n\2zx\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}\u0085\3\2\2\2~\177\7\23\2\2\177\u0081\5\22\n\2\u0080~\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084z\3\2\2\2\u0084\u0080\3\2\2\2\u0085\25\3\2\2\2\u0086\u0088"+
		"\7\r\2\2\u0087\u0089\7!\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u008b\7\16\2\2\u008b\u008d\7!\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0090"+
		"\7\20\2\2\u0090\u0091\7 \2\2\u0091\u0097\5\32\16\2\u0092\u0093\7\30\2"+
		"\2\u0093\u0094\7 \2\2\u0094\u0096\5\32\16\2\u0095\u0092\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\31\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u009a\u009d\7\5\2\2\u009b\u009d\7\6\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009b\3\2\2\2\u009d\33\3\2\2\2\u009e\u009f\t\2\2\2\u009f"+
		"\35\3\2\2\2\26\37$&+\62NQTWampv|\u0082\u0084\u0088\u008c\u0097\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}