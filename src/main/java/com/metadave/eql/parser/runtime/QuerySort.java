package com.metadave.eql.parser.runtime;

/**
 * Created by dparfitt on 5/22/15.
 */
public class QuerySort {
    public enum Order {
        Ascending,
        Descending,
        None
    }

    private String key;
    private Order orderBy = Order.None;

    public QuerySort() {
    }

    public String getKey() {
        return key;
    }

    public Order getOrderBy() {
        return orderBy;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setOrderBy(Order orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public String toString() {
        return "order on " + key + " " + orderBy;
    }
}
