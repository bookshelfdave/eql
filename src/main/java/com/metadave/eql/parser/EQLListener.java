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
	 * Enter a parse tree produced by {@link EQLParser#esql_stmts}.
	 * @param ctx the parse tree
	 */
	void enterEsql_stmts(EQLParser.Esql_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#esql_stmts}.
	 * @param ctx the parse tree
	 */
	void exitEsql_stmts(EQLParser.Esql_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_connect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEql_connect_stmt(EQLParser.Eql_connect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_connect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEql_connect_stmt(EQLParser.Eql_connect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_hostport}.
	 * @param ctx the parse tree
	 */
	void enterEql_hostport(EQLParser.Eql_hostportContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_hostport}.
	 * @param ctx the parse tree
	 */
	void exitEql_hostport(EQLParser.Eql_hostportContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEql_index_stmt(EQLParser.Eql_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEql_index_stmt(EQLParser.Eql_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_get_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEql_get_stmt(EQLParser.Eql_get_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_get_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEql_get_stmt(EQLParser.Eql_get_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_query_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEql_query_stmt(EQLParser.Eql_query_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_query_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEql_query_stmt(EQLParser.Eql_query_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_aggregate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEql_aggregate_stmt(EQLParser.Eql_aggregate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_aggregate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEql_aggregate_stmt(EQLParser.Eql_aggregate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_aggregate_mappings}.
	 * @param ctx the parse tree
	 */
	void enterEql_aggregate_mappings(EQLParser.Eql_aggregate_mappingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_aggregate_mappings}.
	 * @param ctx the parse tree
	 */
	void exitEql_aggregate_mappings(EQLParser.Eql_aggregate_mappingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_aggregate_mapping}.
	 * @param ctx the parse tree
	 */
	void enterEql_aggregate_mapping(EQLParser.Eql_aggregate_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_aggregate_mapping}.
	 * @param ctx the parse tree
	 */
	void exitEql_aggregate_mapping(EQLParser.Eql_aggregate_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_funcall}.
	 * @param ctx the parse tree
	 */
	void enterEql_funcall(EQLParser.Eql_funcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_funcall}.
	 * @param ctx the parse tree
	 */
	void exitEql_funcall(EQLParser.Eql_funcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_field_list}.
	 * @param ctx the parse tree
	 */
	void enterEql_field_list(EQLParser.Eql_field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_field_list}.
	 * @param ctx the parse tree
	 */
	void exitEql_field_list(EQLParser.Eql_field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_filter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEql_filter_stmt(EQLParser.Eql_filter_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_filter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEql_filter_stmt(EQLParser.Eql_filter_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_filter_pred}.
	 * @param ctx the parse tree
	 */
	void enterEql_filter_pred(EQLParser.Eql_filter_predContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_filter_pred}.
	 * @param ctx the parse tree
	 */
	void exitEql_filter_pred(EQLParser.Eql_filter_predContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_filter_rest}.
	 * @param ctx the parse tree
	 */
	void enterEql_filter_rest(EQLParser.Eql_filter_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_filter_rest}.
	 * @param ctx the parse tree
	 */
	void exitEql_filter_rest(EQLParser.Eql_filter_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_filter_pred_value}.
	 * @param ctx the parse tree
	 */
	void enterEql_filter_pred_value(EQLParser.Eql_filter_pred_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_filter_pred_value}.
	 * @param ctx the parse tree
	 */
	void exitEql_filter_pred_value(EQLParser.Eql_filter_pred_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEql_return_stmt(EQLParser.Eql_return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEql_return_stmt(EQLParser.Eql_return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_sort_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEql_sort_stmt(EQLParser.Eql_sort_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_sort_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEql_sort_stmt(EQLParser.Eql_sort_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#eql_ascdesc}.
	 * @param ctx the parse tree
	 */
	void enterEql_ascdesc(EQLParser.Eql_ascdescContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#eql_ascdesc}.
	 * @param ctx the parse tree
	 */
	void exitEql_ascdesc(EQLParser.Eql_ascdescContext ctx);
	/**
	 * Enter a parse tree produced by {@link EQLParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(EQLParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EQLParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(EQLParser.String_valueContext ctx);
}