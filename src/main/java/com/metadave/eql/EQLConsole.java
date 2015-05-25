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

package com.metadave.eql;

// NOTE: source for the JLine v1 ANSIBuffer is in this project
import com.metadave.eql.parser.EQLLexer;
import com.metadave.eql.parser.EQLParser;
import com.metadave.eql.parser.runtime.EQLWalker;
import com.metadave.eql.parser.runtime.RuntimeContext;
import jline.ANSIBuffer;
import jline.console.ConsoleReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.*;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EQLConsole {

    static String[] keywords = {
            "connect",

            "query",
            "from",
            "return",
    };

    static Map<String, ConsoleCommand> consoleOnlyCommands = new HashMap<String, ConsoleCommand>();

    static {
        consoleOnlyCommands.put("help", new ConsoleCommand() {
            @Override
            public void run(String line, ConsoleReader reader) {
                new EQLConsoleHelp(System.out).help(line);
            }
        });

        ConsoleCommand exit = new ConsoleCommand() {
            @Override
            public void run(String line, ConsoleReader reader) {
                System.out.println("Goodbye");
                System.exit(0);
            }
        };
        ConsoleCommand clear = new ConsoleCommand() {
            @Override
            public void run(String line, ConsoleReader reader) {
                try {
                    reader.clearScreen();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        ConsoleCommand source = new ConsoleCommand() {
            @Override
            public void run(String line, ConsoleReader reader) {


                //processOutput(ctx, out, !commandLine.hasOption("nocolor"));
            }
        };
        consoleOnlyCommands.put("exit", exit);
        consoleOnlyCommands.put("quit", exit);
        consoleOnlyCommands.put("clear", clear);
    }

    // TODO: this is a waste... reuse objects!
    private static void processInput(String line, RuntimeContext runtimeCtx) {
        ANTLRInputStream input = new ANTLRInputStream(line);
        EQLLexer lexer = new EQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EQLParser parser = new EQLParser(tokens);

        // combine these two into one
        parser.addErrorListener(new EQLErrorListener());

        ParseTreeWalker walker = new ParseTreeWalker();
        EQLWalker esq = new EQLWalker(runtimeCtx);

        try {
            EQLParser.StmtsContext stmts = parser.stmts();
            walker.walk(esq, stmts);
        } catch (Throwable t) {
            // catch parse errors. ANTLR will display a message for me.
            System.out.println(t.getMessage());
        }

    }

    private static void processOutput(RuntimeContext runtimeCtx, PrintWriter out, boolean ansi) {
        List<Throwable> errors = runtimeCtx.getErrors();
        for (Throwable t : errors) {

            ANSIBuffer buf = new ANSIBuffer();
            buf.setAnsiEnabled(ansi);
            buf.red(t.getMessage());
            if (t.getCause() != null) {
                buf.red(":" + t.getCause().getMessage());
            }
            buf.append("\n");
            System.out.print(buf.toString());
        }
        // TODO
        //runtimeCtx.reset();
    }

    private static String readConfig() throws IOException {
        String file = System.getProperty("user.home") + "/.EQL.config";
        File config = new File(file);
        if (config.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(config));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append("\n");
                    line = br.readLine();
                }
                return sb.toString();
            } finally {
                br.close();
            }
        } else {
            return null;
        }
    }

    @SuppressWarnings("static-access")
    public static CommandLine processArgs(String[] args) {
        Options options = new Options();

        Option help = OptionBuilder
                .withLongOpt("help")
                .withDescription("Print this list of commands").create();

        Option nocolor = OptionBuilder
                .withLongOpt("nocolor")
                .withDescription("Don't use color output").create();

        Option noconfig = OptionBuilder
                .withLongOpt("noconfig")
                .withDescription("Don't read ~/.EQL.config").create();

        Option infile = OptionBuilder
                .withLongOpt("infile")
                .withDescription("Read input from file and exit")
                .hasArg()
                .withArgName("filename")
                .create();

        Option nosignals = OptionBuilder
                .withLongOpt("nosignals")
                .withDescription("Don't catch the Ctrl-C (INT) signal").create();

        options.addOption(help);
        options.addOption(nocolor);
        options.addOption(noconfig);
        options.addOption(infile);
        options.addOption(nosignals);
        CommandLineParser parser = new org.apache.commons.cli.GnuParser();
        try {
            CommandLine line = parser.parse(options, args);
            if (line.hasOption("help")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("EQL", options);
                System.exit(0);
            }
            return line;
        } catch (ParseException exp) {
            System.err.println("Error processing command line args: " + exp.getMessage());
            System.exit(-1);
        }
        return null;
    }

//    private static void readInputFile(String filename,   RuntimeContext runtimeCtx) {
//        String input = null;
//        try {
//            File f = new File(filename);
//            input = org.apache.commons.io.FileUtils.readFileToString(f);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.exit(-1);
//        }
//        if (input != null && !input.trim().isEmpty()) {
//            processInput(input, walkers, runtimeCtx);
//        }
//    }

    // somewhat of a mess
    public static void main(String[] args) throws IOException {
        CommandLine commandLine = processArgs(args);
        ConsoleReader reader = new ConsoleReader();
        reader.setBellEnabled(false);
        reader.setExpandEvents(false); // TODO: look into this
        // TODO: Pasting in text with tabs prints out a ton of completions
        //reader.addCompleter(new jline.console.completer.StringsCompleter(keywords));

        String line;
        PrintWriter out = new PrintWriter(System.out);

        RuntimeContext ctx = new RuntimeContext();
        if (!commandLine.hasOption("nosignals")) {
            ConsoleSignalHander.install("INT", ctx);
        }

        boolean nextLinePrompt = false;

        ANSIBuffer buf = new ANSIBuffer();
        buf.setAnsiEnabled(!commandLine.hasOption("nocolor"));
        buf.blue("Welcome to EQL\n");
        buf.blue("(c) 2015 Dave Parfitt\n");
        System.out.println(buf.toString());

        if (!commandLine.hasOption("noconfig")) {
            String config = null;
            try {
                config = readConfig();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (config != null && !config.trim().isEmpty()) {
                processInput(config, ctx);
                processOutput(ctx, out, !commandLine.hasOption("nocolor"));
            }
        }

//        if (commandLine.hasOption("infile")) {
//            String filename = commandLine.getOptionValue("infile");
//            readInputFile(filename, ctx);
//            ctx.getActionListener().term();
//            System.exit(0);
//        }


        StringBuffer lines = new StringBuffer();
        ANSIBuffer ansiprompt = new ANSIBuffer();
        ansiprompt.setAnsiEnabled(true);
        ansiprompt.green("> ");
        String prompt = ansiprompt.toString(!commandLine.hasOption("nocolor"));
        boolean inHereDoc = false;



        while ((line = reader.readLine(nextLinePrompt ? "" : prompt)) != null) {
            out.flush();
            String chunks[] = line.split(" ");
            String consoleCommandCheck = chunks[0].toLowerCase().trim();
            if (consoleOnlyCommands.containsKey(consoleCommandCheck)) {
                consoleOnlyCommands.get(consoleCommandCheck).run(line, reader);
                continue;
            }

            if (line.contains("~%~") && !line.contains("\\~%~")) {
                inHereDoc = !inHereDoc;
            }

            if (!line.trim().endsWith(";")) {
                nextLinePrompt = true;
                lines.append(line);
                lines.append("\n");
            } else if (line.trim().endsWith(";") && !inHereDoc) {
                lines.append(line);
                String input = lines.toString();
                nextLinePrompt = false;
                processInput(input, ctx);
                processOutput(ctx, out, !commandLine.hasOption("nocolor"));
                lines = new StringBuffer();
            } else if (inHereDoc) {
                lines.append(line);
                lines.append("\n");
            }

        }
    }

}
