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
		T__0=1, T__1=2, T__2=3, T__3=4, SORT=5, CONNECT=6, QUERY=7, ALL=8, RETURNKW=9, 
		FROM=10, ON=11, TO=12, AND=13, OR=14, NOT=15, AT=16, DOLLAR=17, SPLAT=18, 
		COMMA=19, LSQUARE=20, RSQUARE=21, LPAREN=22, RPAREN=23, EQUALS=24, DOT=25, 
		SEMI=26, ID=27, INT=28, FLOAT=29, STRING=30, DATA_CONTENT=31, LINE_COMMENT=32, 
		COMMENT=33, WS=34;
	public static final int
		RULE_stmts = 0, RULE_connect_stmt = 1, RULE_hostport = 2, RULE_query_stmt = 3, 
		RULE_field_list = 4, RULE_filter_stmt = 5, RULE_filter_pred = 6, RULE_filter_rest = 7, 
		RULE_return_stmt = 8, RULE_sort_stmt = 9, RULE_ascdesc = 10;
	public static final String[] ruleNames = {
		"stmts", "connect_stmt", "hostport", "query_stmt", "field_list", "filter_stmt", 
		"filter_pred", "filter_rest", "return_stmt", "sort_stmt", "ascdesc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'filter'", "'asc'", "'desc'", "'sort'", "'connect'", "'query'", 
		"'all'", "'return'", "'from'", "'on'", "'to'", "'and'", "'or'", "'not'", 
		"'@'", "'$'", "'*'", "','", "'['", "']'", "'('", "')'", "'='", "'.'", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "SORT", "CONNECT", "QUERY", "ALL", "RETURNKW", 
		"FROM", "ON", "TO", "AND", "OR", "NOT", "AT", "DOLLAR", "SPLAT", "COMMA", 
		"LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "EQUALS", "DOT", "SEMI", "ID", 
		"INT", "FLOAT", "STRING", "DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS"
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
			setState(23);
			_la = _input.LA(1);
			if (_la==CONNECT) {
				{
				setState(22);
				connect_stmt();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QUERY) {
				{
				{
				setState(25);
				query_stmt();
				}
				}
				setState(30);
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
			setState(31);
			match(CONNECT);
			setState(33);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(32);
				((Connect_stmtContext)_localctx).clusterName = match(ID);
				}
				break;
			}
			setState(35);
			((Connect_stmtContext)_localctx).hostport = hostport();
			((Connect_stmtContext)_localctx).hps.add(((Connect_stmtContext)_localctx).hostport);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(36);
				match(COMMA);
				setState(37);
				((Connect_stmtContext)_localctx).hostport = hostport();
				((Connect_stmtContext)_localctx).hps.add(((Connect_stmtContext)_localctx).hostport);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
			setState(45);
			((HostportContext)_localctx).host = match(ID);
			setState(46);
			match(T__0);
			setState(47);
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
		enterRule(_localctx, 6, RULE_query_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(QUERY);
			setState(50);
			((Query_stmtContext)_localctx).key = match(ID);
			setState(52);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(51);
				field_list();
				}
			}

			setState(55);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(54);
				filter_stmt();
				}
			}

			setState(58);
			_la = _input.LA(1);
			if (_la==RETURNKW) {
				{
				setState(57);
				return_stmt();
				}
			}

			setState(61);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(60);
				sort_stmt();
				}
			}

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
		enterRule(_localctx, 8, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(LPAREN);
			setState(66);
			((Field_listContext)_localctx).ID = match(ID);
			((Field_listContext)_localctx).fields.add(((Field_listContext)_localctx).ID);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(67);
				match(COMMA);
				setState(68);
				((Field_listContext)_localctx).ID = match(ID);
				((Field_listContext)_localctx).fields.add(((Field_listContext)_localctx).ID);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
		enterRule(_localctx, 10, RULE_filter_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__1);
			setState(77);
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
		public Token stringval;
		public Filter_predContext childpred;
		public TerminalNode ID() { return getToken(EQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(EQLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(EQLParser.STRING, 0); }
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
		enterRule(_localctx, 12, RULE_filter_pred);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((Filter_predContext)_localctx).name = match(ID);
				setState(80);
				match(EQUALS);
				setState(83);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(81);
					((Filter_predContext)_localctx).intval = match(INT);
					}
					break;
				case STRING:
					{
					setState(82);
					((Filter_predContext)_localctx).stringval = match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(85);
					filter_rest();
					}
					break;
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(LPAREN);
				setState(89);
				((Filter_predContext)_localctx).childpred = filter_pred();
				setState(90);
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
		enterRule(_localctx, 14, RULE_filter_rest);
		try {
			int _alt;
			setState(106);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(94);
						match(AND);
						setState(95);
						((Filter_restContext)_localctx).filter_pred = filter_pred();
						((Filter_restContext)_localctx).ands.add(((Filter_restContext)_localctx).filter_pred);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(98); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(100);
						match(OR);
						setState(101);
						((Filter_restContext)_localctx).filter_pred = filter_pred();
						((Filter_restContext)_localctx).ors.add(((Filter_restContext)_localctx).filter_pred);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 16, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(RETURNKW);
			setState(110);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(109);
				((Return_stmtContext)_localctx).size = match(INT);
				}
			}

			setState(114);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(112);
				match(FROM);
				setState(113);
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
		enterRule(_localctx, 18, RULE_sort_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(SORT);
			setState(117);
			match(ON);
			setState(118);
			((Sort_stmtContext)_localctx).ID = match(ID);
			((Sort_stmtContext)_localctx).keys.add(((Sort_stmtContext)_localctx).ID);
			setState(119);
			((Sort_stmtContext)_localctx).ascdesc = ascdesc();
			((Sort_stmtContext)_localctx).sorts.add(((Sort_stmtContext)_localctx).ascdesc);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				((Sort_stmtContext)_localctx).ID = match(ID);
				((Sort_stmtContext)_localctx).keys.add(((Sort_stmtContext)_localctx).ID);
				setState(122);
				((Sort_stmtContext)_localctx).ascdesc = ascdesc();
				((Sort_stmtContext)_localctx).sorts.add(((Sort_stmtContext)_localctx).ascdesc);
				}
				}
				setState(127);
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
		enterRule(_localctx, 20, RULE_ascdesc);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((AscdescContext)_localctx).asc = match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0087\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\5\2\32\n\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\5\3$"+
		"\n\3\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\5\5\67\n\5\3\5\5\5:\n\5\3\5\5\5=\n\5\3\5\5\5@\n\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\5\bV\n\b\3\b\5\bY\n\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\6\tc\n\t\r\t\16"+
		"\td\3\t\3\t\6\ti\n\t\r\t\16\tj\5\tm\n\t\3\n\3\n\5\nq\n\n\3\n\3\n\5\nu"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13"+
		"\13\3\f\3\f\5\f\u0085\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u008e"+
		"\2\31\3\2\2\2\4!\3\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\nC\3\2\2\2\fN\3\2\2\2"+
		"\16^\3\2\2\2\20l\3\2\2\2\22n\3\2\2\2\24v\3\2\2\2\26\u0084\3\2\2\2\30\32"+
		"\5\4\3\2\31\30\3\2\2\2\31\32\3\2\2\2\32\36\3\2\2\2\33\35\5\b\5\2\34\33"+
		"\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 \36\3\2"+
		"\2\2!#\7\b\2\2\"$\7\35\2\2#\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%*\5\6\4\2&\'"+
		"\7\25\2\2\')\5\6\4\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2"+
		",*\3\2\2\2-.\7\34\2\2.\5\3\2\2\2/\60\7\35\2\2\60\61\7\3\2\2\61\62\7\36"+
		"\2\2\62\7\3\2\2\2\63\64\7\t\2\2\64\66\7\35\2\2\65\67\5\n\6\2\66\65\3\2"+
		"\2\2\66\67\3\2\2\2\679\3\2\2\28:\5\f\7\298\3\2\2\29:\3\2\2\2:<\3\2\2\2"+
		";=\5\22\n\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\5\24\13\2?>\3\2\2\2?@\3\2"+
		"\2\2@A\3\2\2\2AB\7\34\2\2B\t\3\2\2\2CD\7\30\2\2DI\7\35\2\2EF\7\25\2\2"+
		"FH\7\35\2\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2"+
		"\2LM\7\31\2\2M\13\3\2\2\2NO\7\4\2\2OP\5\16\b\2P\r\3\2\2\2QR\7\35\2\2R"+
		"U\7\32\2\2SV\7\36\2\2TV\7 \2\2US\3\2\2\2UT\3\2\2\2VX\3\2\2\2WY\5\20\t"+
		"\2XW\3\2\2\2XY\3\2\2\2Y_\3\2\2\2Z[\7\30\2\2[\\\5\16\b\2\\]\7\31\2\2]_"+
		"\3\2\2\2^Q\3\2\2\2^Z\3\2\2\2_\17\3\2\2\2`a\7\17\2\2ac\5\16\b\2b`\3\2\2"+
		"\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2em\3\2\2\2fg\7\20\2\2gi\5\16\b\2hf\3\2"+
		"\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lb\3\2\2\2lh\3\2\2\2m\21\3"+
		"\2\2\2np\7\13\2\2oq\7\36\2\2po\3\2\2\2pq\3\2\2\2qt\3\2\2\2rs\7\f\2\2s"+
		"u\7\36\2\2tr\3\2\2\2tu\3\2\2\2u\23\3\2\2\2vw\7\7\2\2wx\7\r\2\2xy\7\35"+
		"\2\2y\177\5\26\f\2z{\7\25\2\2{|\7\35\2\2|~\5\26\f\2}z\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\25\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0085\7\5\2\2\u0083\u0085\7\6\2\2\u0084\u0082\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\27\3\2\2\2\25\31\36#*\669<?IUX^djlpt\177\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}