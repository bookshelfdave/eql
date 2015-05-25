package com.metadave.eql.parser.runtime;

/**
 * Created by dparfitt on 5/22/15.
 */
public class Return {
    private Integer size;
    private Integer lower;

    public Return(Integer size, Integer lower, Integer upper) {
        this.size = size;
        this.lower = lower;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getLower() {
        return lower;
    }
}
