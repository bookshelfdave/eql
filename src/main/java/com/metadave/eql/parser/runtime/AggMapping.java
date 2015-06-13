package com.metadave.eql.parser.runtime;

/**
 * Created by dparfitt on 6/13/15.
 */
public class AggMapping {
    String id;
    FunCall fc;

    public AggMapping(String id, FunCall fc) {
        this.id = id;
        this.fc = fc;
    }

    public String getId() {
        return id;
    }

    public FunCall getFc() {
        return fc;
    }
}
