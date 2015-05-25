package com.metadave.eql.parser.runtime;

/**
 * Created by dparfitt on 5/24/15.
 */
public class FilterPred<T> {
    String name;
    T value;
    Op op;

    public enum Op {
        EQUAL,
        NOTEQUAL
    }

    public FilterPred(String name, Op op, T value) {
        this.name = name;
        this.value = value;
        this.op = op;
    }


    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public Op getOp() {
        return op;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name, op, value);
    }
}
