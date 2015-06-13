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
		T__0=1, T__1=2, T__2=3, T__3=4, INDEX=5, SORT=6, AGGREGATE=7, CONNECT=8, 
		QUERY=9, ALL=10, GET=11, RETURNKW=12, FROM=13, WITH=14, ON=15, TO=16, 
		AND=17, OR=18, NOT=19, AT=20, DOLLAR=21, SPLAT=22, COMMA=23, LSQUARE=24, 
		RSQUARE=25, LPAREN=26, RPAREN=27, EQUALS=28, DOT=29, SEMI=30, ID=31, INT=32, 
		FLOAT=33, DOUBLE_STRING=34, SINGLE_STRING=35, DATA_CONTENT=36, LINE_COMMENT=37, 
		COMMENT=38, WS=39, WSCHARS=40;
	public static final int
		RULE_stmts = 0, RULE_connect_stmt = 1, RULE_hostport = 2, RULE_index_stmt = 3, 
		RULE_get_stmt = 4, RULE_query_stmt = 5, RULE_aggregate_stmt = 6, RULE_aggregate_mappings = 7, 
		RULE_aggregate_mapping = 8, RULE_funcall = 9, RULE_field_list = 10, RULE_filter_stmt = 11, 
		RULE_filter_pred = 12, RULE_filter_rest = 13, RULE_return_stmt = 14, RULE_sort_stmt = 15, 
		RULE_ascdesc = 16, RULE_string_value = 17;
	public static final String[] ruleNames = {
		"stmts", "connect_stmt", "hostport", "index_stmt", "get_stmt", "query_stmt", 
		"aggregate_stmt", "aggregate_mappings", "aggregate_mapping", "funcall", 
		"field_list", "filter_stmt", "filter_pred", "filter_rest", "return_stmt", 
		"sort_stmt", "ascdesc", "string_value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'filter'", "'asc'", "'desc'", "'index'", "'sort'", "'aggregate'", 
		"'connect'", "'query'", "'all'", "'get'", "'return'", "'from'", "'with'", 
		"'on'", "'to'", "'and'", "'or'", "'not'", "'@'", "'$'", "'*'", "','", 
		"'['", "']'", "'('", "')'", "'='", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INDEX", "SORT", "AGGREGATE", "CONNECT", 
		"QUERY", "ALL", "GET", "RETURNKW", "FROM", "WITH", "ON", "TO", "AND", 
		"OR", "NOT", "AT", "DOLLAR", "SPLAT", "COMMA", "LSQUARE", "RSQUARE", "LPAREN", 
		"RPAREN", "EQUALS", "DOT", "SEMI", "ID", "INT", "FLOAT", "DOUBLE_STRING", 
		"SINGLE_STRING", "DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS", "WSCHARS"
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
			setState(37);
			_la = _input.LA(1);
			if (_la==CONNECT) {
				{
				setState(36);
				connect_stmt();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEX) | (1L << QUERY) | (1L << GET))) != 0)) {
				{
				setState(42);
				switch (_input.LA(1)) {
				case QUERY:
					{
					setState(39);
					query_stmt();
					}
					break;
				case INDEX:
					{
					setState(40);
					index_stmt();
					}
					break;
				case GET:
					{
					setState(41);
					get_stmt();
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
			setState(47);
			match(CONNECT);
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(48);
				((Connect_stmtContext)_localctx).clusterName = match(ID);
				}
				break;
			}
			setState(51);
			((Connect_stmtContext)_localctx).hostport = hostport();
			((Connect_stmtContext)_localctx).hps.add(((Connect_stmtContext)_localctx).hostport);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);
				setState(53);
				((Connect_stmtContext)_localctx).hostport = hostport();
				((Connect_stmtContext)_localctx).hps.add(((Connect_stmtContext)_localctx).hostport);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
			setState(61);
			((HostportContext)_localctx).host = match(ID);
			setState(62);
			match(T__0);
			setState(63);
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
			setState(65);
			match(INDEX);
			setState(66);
			((Index_stmtContext)_localctx).idx = match(ID);
			setState(67);
			match(WITH);
			setState(68);
			((Index_stmtContext)_localctx).itype = match(ID);
			setState(69);
			match(EQUALS);
			setState(70);
			((Index_stmtContext)_localctx).content = string_value();
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
			setState(73);
			match(GET);
			setState(74);
			((Get_stmtContext)_localctx).idx = match(ID);
			setState(75);
			match(WITH);
			setState(76);
			((Get_stmtContext)_localctx).itype = match(ID);
			setState(77);
			match(EQUALS);
			setState(78);
			((Get_stmtContext)_localctx).content = string_value();
			setState(79);
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
		public Aggregate_stmtContext aggregate_stmt() {
			return getRuleContext(Aggregate_stmtContext.class,0);
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
			setState(81);
			match(QUERY);
			setState(82);
			((Query_stmtContext)_localctx).key = match(ID);
			setState(84);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(83);
				field_list();
				}
			}

			setState(87);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(86);
				filter_stmt();
				}
			}

			setState(90);
			_la = _input.LA(1);
			if (_la==AGGREGATE) {
				{
				setState(89);
				aggregate_stmt();
				}
			}

			setState(93);
			_la = _input.LA(1);
			if (_la==RETURNKW) {
				{
				setState(92);
				return_stmt();
				}
			}

			setState(96);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(95);
				sort_stmt();
				}
			}

			setState(98);
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

	public static class Aggregate_stmtContext extends ParserRuleContext {
		public TerminalNode AGGREGATE() { return getToken(EQLParser.AGGREGATE, 0); }
		public Aggregate_mappingsContext aggregate_mappings() {
			return getRuleContext(Aggregate_mappingsContext.class,0);
		}
		public Aggregate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterAggregate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitAggregate_stmt(this);
		}
	}

	public final Aggregate_stmtContext aggregate_stmt() throws RecognitionException {
		Aggregate_stmtContext _localctx = new Aggregate_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aggregate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(AGGREGATE);
			setState(101);
			aggregate_mappings();
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

	public static class Aggregate_mappingsContext extends ParserRuleContext {
		public Aggregate_mappingContext aggregate_mapping;
		public List<Aggregate_mappingContext> am = new ArrayList<Aggregate_mappingContext>();
		public List<Aggregate_mappingContext> aggregate_mapping() {
			return getRuleContexts(Aggregate_mappingContext.class);
		}
		public Aggregate_mappingContext aggregate_mapping(int i) {
			return getRuleContext(Aggregate_mappingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EQLParser.COMMA, i);
		}
		public Aggregate_mappingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_mappings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterAggregate_mappings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitAggregate_mappings(this);
		}
	}

	public final Aggregate_mappingsContext aggregate_mappings() throws RecognitionException {
		Aggregate_mappingsContext _localctx = new Aggregate_mappingsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggregate_mappings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((Aggregate_mappingsContext)_localctx).aggregate_mapping = aggregate_mapping();
			((Aggregate_mappingsContext)_localctx).am.add(((Aggregate_mappingsContext)_localctx).aggregate_mapping);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				((Aggregate_mappingsContext)_localctx).aggregate_mapping = aggregate_mapping();
				((Aggregate_mappingsContext)_localctx).am.add(((Aggregate_mappingsContext)_localctx).aggregate_mapping);
				}
				}
				setState(110);
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

	public static class Aggregate_mappingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(EQLParser.EQUALS, 0); }
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public Aggregate_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterAggregate_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitAggregate_mapping(this);
		}
	}

	public final Aggregate_mappingContext aggregate_mapping() throws RecognitionException {
		Aggregate_mappingContext _localctx = new Aggregate_mappingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aggregate_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
			match(ID);
			setState(112);
			match(EQUALS);
			setState(113);
			funcall();
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

	public static class FuncallContext extends ParserRuleContext {
		public Token funname;
		public Token field;
		public TerminalNode LPAREN() { return getToken(EQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EQLParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(EQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EQLParser.ID, i);
		}
		public FuncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterFuncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitFuncall(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((FuncallContext)_localctx).funname = match(ID);
			setState(116);
			match(LPAREN);
			setState(117);
			((FuncallContext)_localctx).field = match(ID);
			setState(118);
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
		enterRule(_localctx, 20, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LPAREN);
			setState(121);
			((Field_listContext)_localctx).ID = match(ID);
			((Field_listContext)_localctx).fields.add(((Field_listContext)_localctx).ID);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				((Field_listContext)_localctx).ID = match(ID);
				((Field_listContext)_localctx).fields.add(((Field_listContext)_localctx).ID);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
		enterRule(_localctx, 22, RULE_filter_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__1);
			setState(132);
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
		enterRule(_localctx, 24, RULE_filter_pred);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((Filter_predContext)_localctx).name = match(ID);
				setState(135);
				match(EQUALS);
				setState(138);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(136);
					((Filter_predContext)_localctx).intval = match(INT);
					}
					break;
				case DOUBLE_STRING:
				case SINGLE_STRING:
				case DATA_CONTENT:
					{
					setState(137);
					((Filter_predContext)_localctx).stringval = string_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(140);
					filter_rest();
					}
					break;
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(LPAREN);
				setState(144);
				((Filter_predContext)_localctx).childpred = filter_pred();
				setState(145);
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
		enterRule(_localctx, 26, RULE_filter_rest);
		try {
			int _alt;
			setState(161);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(149);
						match(AND);
						setState(150);
						((Filter_restContext)_localctx).filter_pred = filter_pred();
						((Filter_restContext)_localctx).ands.add(((Filter_restContext)_localctx).filter_pred);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(155);
						match(OR);
						setState(156);
						((Filter_restContext)_localctx).filter_pred = filter_pred();
						((Filter_restContext)_localctx).ors.add(((Filter_restContext)_localctx).filter_pred);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(159); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 28, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(RETURNKW);
			setState(165);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(164);
				((Return_stmtContext)_localctx).size = match(INT);
				}
			}

			setState(169);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(167);
				match(FROM);
				setState(168);
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
		enterRule(_localctx, 30, RULE_sort_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(SORT);
			setState(172);
			match(ON);
			setState(173);
			((Sort_stmtContext)_localctx).ID = match(ID);
			((Sort_stmtContext)_localctx).keys.add(((Sort_stmtContext)_localctx).ID);
			setState(174);
			((Sort_stmtContext)_localctx).ascdesc = ascdesc();
			((Sort_stmtContext)_localctx).sorts.add(((Sort_stmtContext)_localctx).ascdesc);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				((Sort_stmtContext)_localctx).ID = match(ID);
				((Sort_stmtContext)_localctx).keys.add(((Sort_stmtContext)_localctx).ID);
				setState(177);
				((Sort_stmtContext)_localctx).ascdesc = ascdesc();
				((Sort_stmtContext)_localctx).sorts.add(((Sort_stmtContext)_localctx).ascdesc);
				}
				}
				setState(182);
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
		enterRule(_localctx, 32, RULE_ascdesc);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((AscdescContext)_localctx).asc = match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
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
		enterRule(_localctx, 34, RULE_string_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\5\2(\n\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3\3"+
		"\5\3\64\n\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\5\7W\n\7\3\7\5\7Z\n\7\3\7\5\7]\n\7\3\7\5\7`\n\7\3\7\5\7c\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\177\n\f\f\f\16\f\u0082"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3\16\5\16"+
		"\u0090\n\16\3\16\3\16\3\16\3\16\5\16\u0096\n\16\3\17\3\17\6\17\u009a\n"+
		"\17\r\17\16\17\u009b\3\17\3\17\6\17\u00a0\n\17\r\17\16\17\u00a1\5\17\u00a4"+
		"\n\17\3\20\3\20\5\20\u00a8\n\20\3\20\3\20\5\20\u00ac\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00b5\n\21\f\21\16\21\u00b8\13\21\3\22\3"+
		"\22\5\22\u00bc\n\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\3\3\2$&\u00c4\2\'\3\2\2\2\4\61\3\2\2\2\6?\3\2\2\2\bC\3"+
		"\2\2\2\nK\3\2\2\2\fS\3\2\2\2\16f\3\2\2\2\20i\3\2\2\2\22q\3\2\2\2\24u\3"+
		"\2\2\2\26z\3\2\2\2\30\u0085\3\2\2\2\32\u0095\3\2\2\2\34\u00a3\3\2\2\2"+
		"\36\u00a5\3\2\2\2 \u00ad\3\2\2\2\"\u00bb\3\2\2\2$\u00bd\3\2\2\2&(\5\4"+
		"\3\2\'&\3\2\2\2\'(\3\2\2\2(.\3\2\2\2)-\5\f\7\2*-\5\b\5\2+-\5\n\6\2,)\3"+
		"\2\2\2,*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3\2\2\2"+
		"\60.\3\2\2\2\61\63\7\n\2\2\62\64\7!\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65:\5\6\4\2\66\67\7\31\2\2\679\5\6\4\28\66\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7 \2\2>\5\3\2\2\2?@\7!\2"+
		"\2@A\7\3\2\2AB\7\"\2\2B\7\3\2\2\2CD\7\7\2\2DE\7!\2\2EF\7\20\2\2FG\7!\2"+
		"\2GH\7\36\2\2HI\5$\23\2IJ\7 \2\2J\t\3\2\2\2KL\7\r\2\2LM\7!\2\2MN\7\20"+
		"\2\2NO\7!\2\2OP\7\36\2\2PQ\5$\23\2QR\7 \2\2R\13\3\2\2\2ST\7\13\2\2TV\7"+
		"!\2\2UW\5\26\f\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XZ\5\30\r\2YX\3\2\2\2YZ"+
		"\3\2\2\2Z\\\3\2\2\2[]\5\16\b\2\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\5\36"+
		"\20\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\5 \21\2ba\3\2\2\2bc\3\2\2\2cd\3"+
		"\2\2\2de\7 \2\2e\r\3\2\2\2fg\7\t\2\2gh\5\20\t\2h\17\3\2\2\2in\5\22\n\2"+
		"jk\7\31\2\2km\5\22\n\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\21\3\2"+
		"\2\2pn\3\2\2\2qr\7!\2\2rs\7\36\2\2st\5\24\13\2t\23\3\2\2\2uv\7!\2\2vw"+
		"\7\34\2\2wx\7!\2\2xy\7\35\2\2y\25\3\2\2\2z{\7\34\2\2{\u0080\7!\2\2|}\7"+
		"\31\2\2}\177\7!\2\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\35\2\2"+
		"\u0084\27\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5\32\16\2\u0087\31\3"+
		"\2\2\2\u0088\u0089\7!\2\2\u0089\u008c\7\36\2\2\u008a\u008d\7\"\2\2\u008b"+
		"\u008d\5$\23\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u0090\5\34\17\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0096\3\2\2\2\u0091\u0092\7\34\2\2\u0092\u0093\5\32\16\2\u0093\u0094"+
		"\7\35\2\2\u0094\u0096\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u0091\3\2\2\2"+
		"\u0096\33\3\2\2\2\u0097\u0098\7\23\2\2\u0098\u009a\5\32\16\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u00a4\3\2\2\2\u009d\u009e\7\24\2\2\u009e\u00a0\5\32\16\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\35\3\2\2"+
		"\2\u00a5\u00a7\7\16\2\2\u00a6\u00a8\7\"\2\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\7\17\2\2\u00aa\u00ac\7"+
		"\"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\37\3\2\2\2\u00ad"+
		"\u00ae\7\b\2\2\u00ae\u00af\7\21\2\2\u00af\u00b0\7!\2\2\u00b0\u00b6\5\""+
		"\22\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\7!\2\2\u00b3\u00b5\5\"\22\2\u00b4"+
		"\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7!\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\7\5\2\2\u00ba\u00bc"+
		"\7\6\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc#\3\2\2\2\u00bd"+
		"\u00be\t\2\2\2\u00be%\3\2\2\2\30\',.\63:VY\\_bn\u0080\u008c\u008f\u0095"+
		"\u009b\u00a1\u00a3\u00a7\u00ab\u00b6\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}