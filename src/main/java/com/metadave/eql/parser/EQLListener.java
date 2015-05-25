// Generated from ./src/main/java/com/metadave/eql/parser/EQL.g4 by ANTLR 4.5
package com.metadave.eql.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EQLParser}.
 */
public interface EQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EQLParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(EQLParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(EQLParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#connect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConnect_stmt(EQLParser.Connect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#connect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConnect_stmt(EQLParser.Connect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#hostport}.
	 * @param ctx the parse tree
	 */
	void enterHostport(EQLParser.HostportContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#hostport}.
	 * @param ctx the parse tree
	 */
	void exitHostport(EQLParser.HostportContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#query_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuery_stmt(EQLParser.Query_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#query_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuery_stmt(EQLParser.Query_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(EQLParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(EQLParser.Field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#filter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFilter_stmt(EQLParser.Filter_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#filter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFilter_stmt(EQLParser.Filter_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#filter_pred}.
	 * @param ctx the parse tree
	 */
	void enterFilter_pred(EQLParser.Filter_predContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#filter_pred}.
	 * @param ctx the parse tree
	 */
	void exitFilter_pred(EQLParser.Filter_predContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#filter_rest}.
	 * @param ctx the parse tree
	 */
	void enterFilter_rest(EQLParser.Filter_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#filter_rest}.
	 * @param ctx the parse tree
	 */
	void exitFilter_rest(EQLParser.Filter_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(EQLParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(EQLParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#sort_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSort_stmt(EQLParser.Sort_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#sort_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSort_stmt(EQLParser.Sort_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#ascdesc}.
	 * @param ctx the parse tree
	 */
	void enterAscdesc(EQLParser.AscdescContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#ascdesc}.
	 * @param ctx the parse tree
	 */
	void exitAscdesc(EQLParser.AscdescContext ctx);
}