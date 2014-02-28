import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class LoadCSV {
    public static class Loader extends CSVBaseListener {
        /** Load a list of row maps that map field name to value */
        List<Map<String,String>> rows   = new ArrayList<Map<String, String>>();
        List<String>             header = new ArrayList<String>(); 
        List<String>             currentRowFieldValues;  

        public void exitHdr(CSVParser.HdrContext ctx) {
            header.addAll(currentRowFieldValues);
        }
        public void enterRow(CSVParser.RowContext ctx) {
            currentRowFieldValues = new ArrayList<String>();
        }
        public void exitRow(CSVParser.RowContext ctx) {
            // If this is the header row, do nothing.
            if (ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr) {
		return;
	    }
            // It's a data row
            Map<String, String> m = new LinkedHashMap<String, String>();
            int i = 0;
            for (String v: currentRowFieldValues) {
                m.put(header.get(i++), v);
            }
            rows.add(m);
        }
        public void exitString(CSVParser.StringContext ctx) {
            currentRowFieldValues.add(ctx.STRING().getText());
        }
        public void exitText(CSVParser.TextContext ctx) {
            currentRowFieldValues.add(ctx.TEXT().getText());
        }
        public void exitEmpty(CSVParser.EmptyContext ctx) {
            currentRowFieldValues.add("");
        }
    }
    public static void main(String[] args) throws Exception {
        String      inputFile = null;
        InputStream is        = System.in;
        if (args.length > 0)   { inputFile = args[0];                 }
        if (inputFile != null) { is = new FileInputStream(inputFile); }
        CSVLexer          lexer  = new CSVLexer(new ANTLRInputStream(is));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser         parser = new CSVParser(tokens);
        ParseTree         tree   = parser.file();
        ParseTreeWalker   walker = new ParseTreeWalker();
        Loader            loader = new Loader();
        walker.walk(loader, tree);
        System.out.println(loader.rows);
    }
}
