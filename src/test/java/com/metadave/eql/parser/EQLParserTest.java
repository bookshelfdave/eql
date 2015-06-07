/*
 * -------------------------------------------------------------------
 *
 * Copyright (c) 2015 Dave Parfitt
 *
 * This file is provided to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * -------------------------------------------------------------------
 */

package com.metadave.eql.parser;

import com.metadave.eql.EQLErrorListener;
import com.metadave.eql.parser.runtime.EQLWalker;
import com.metadave.eql.parser.runtime.RuntimeContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.File;
import java.net.URL;

public class EQLParserTest {

//    @Test
//    public void testQueryParsing() {
//        try {
//            String script = EQLParserTest.loadResource("query.test");
//            testScript(script);
//        } catch (Throwable e) {
//            e.printStackTrace();
//            Assert.fail();
//        }
//    }

    @Test
    public void testQueryEval() throws Throwable {
        String script = EQLParserTest.loadResource("query.test");
        testEvalScript(script);
    }


    @Test
    public void testIndexEval() throws Throwable {
        String script = EQLParserTest.loadResource("index.test");
        testEvalScript(script);
    }

    private void testEvalScript(String script) throws Throwable {
        RuntimeContext ctx = new RuntimeContext();
        ANTLRInputStream input = new ANTLRInputStream(script);
        EQLLexer lexer = new EQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EQLParser parser = new EQLParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        EQLWalker esq = new EQLWalker(ctx);
        parser.addErrorListener(new EQLErrorListener());
        EQLParser.StmtsContext qc = parser.stmts();
        //walker.walk(esq, qc);
    }


//    private void testScript(String script) throws Throwable {
//
//        ANTLRInputStream input = new ANTLRInputStream(script);
//        EQLLexer lexer = new EQLLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        EQLParser parser = new EQLParser(tokens);
//        parser.addErrorListener(new EQLErrorListener());
//        parser.stmts();
//    }

    public static String loadResource(String name) throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(name);
        File f = new File(url.getPath());
        return org.apache.commons.io.FileUtils.readFileToString(f, "UTF-8");
    }
}
