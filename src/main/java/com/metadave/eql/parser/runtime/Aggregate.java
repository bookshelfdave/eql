package com.metadave.eql.parser.runtime;

import java.util.List;

/**
 * Created by dparfitt on 6/13/15.
 */
public class Aggregate {
    List<AggMapping> mappings;

    public Aggregate(List<AggMapping> mappings) {
        this.mappings = mappings;
    }

    public List<AggMapping> getMappings() {
        return mappings;
    }
}
