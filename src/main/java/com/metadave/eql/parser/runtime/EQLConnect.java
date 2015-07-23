package com.metadave.eql.parser.runtime;

import org.immutables.value.Value;

/**
 * Created by dparfitt on 7/20/15.
 */

@Value.Immutable()
public abstract class EQLConnect extends EQLStmt {
    abstract String host();
    abstract int port();
    abstract String clusterName();
}
