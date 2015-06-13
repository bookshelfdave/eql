package com.metadave.eql.parser.runtime;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dparfitt on 6/13/15.
 */
public class FunCall {
    String field;
    ValidFun funname;

    public enum ValidFun {
        MIN,
        MAX,
        AVG,
        SUM
    }

    public FunCall(ValidFun f, String field) {
        this.funname = f;
        this.field = field;
    }

    public ValidFun getFunName() {
        return funname;
    }

    public String getField() {
        return field;
    }
}
