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
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.util.Iterator;

public class EQLParserTest {

    public void testQueries() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource("");
        File testdir = new File(url.toURI());
        String[] suffixes = {"pass","fail"};
        Iterator<File> testFiles = FileUtils.iterateFiles(testdir, suffixes, false);
        while(testFiles.hasNext()) {
            File testFile = testFiles.next();
            System.out.println(testFile.getName());
            String content = FileUtils.readFileToString(testFile, "UTF-8");
            //System.out.println(content);
        }
    }

    public static String loadResource(String name) throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(name);
        File f = new File(url.getPath());
        return org.apache.commons.io.FileUtils.readFileToString(f, "UTF-8");
    }
}
