package com.metadave.eql.parser;

/**
 * Created by dparfitt on 5/22/15.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ParseUtils {
    public static String getDataContent(String content) {
        if(content.startsWith("~%~\n")) {
            content=content.substring(4);
        } else {
            content=content.substring(3);
        }
        if(content.endsWith("\n~%~")) {
            content=content.substring(0, content.length() - 4);
        }  else {
            content=content.substring(0, content.length() - 3);
        }
        if(content.contains("\\~%~")) {
            content = content.replaceAll("\\\\~%~","~%~");
        }
        return content;
    }

    public static String stripQuotes(String rawVal) {
        // should probably check if it's an empty string and all that..
        if (rawVal.length() == 2) {
            return "";
        } else if (rawVal.length() == 3) {
            return rawVal.substring(1, 2);
        } else {
            String v = rawVal.substring(1, rawVal.length() - 1);
            if(v.contains("\\\"")) {
                v = v.replaceAll("\\\\\"","\"");
            }
            return v;
        }
    }

    @Test
    public void testStripQuotes() {
        // TODO: edge cases
        //assertEquals("this is \"a test\"", stripQuotes("\"this is \"a test\"\""));
        String orig ="\"{\\\"Foo\\\":1}\"";
        System.out.println(orig);
        assertEquals("{\"Foo\":1}",stripQuotes(orig));
    }

    @Test
    public void testDataContent() {
        assertEquals("This is a test", getDataContent("~%~This is a test~%~"));
        assertEquals("This is a test", getDataContent("~%~\nThis is a test~%~"));
        assertEquals("This is a test", getDataContent("~%~\nThis is a test~%~"));
        assertEquals("This is a test", getDataContent("~%~\nThis is a test\n~%~"));
        assertEquals("This is a ~%~test~%~", getDataContent("~%~This is a \\~%~test\\~%~~%~"));
    }

}