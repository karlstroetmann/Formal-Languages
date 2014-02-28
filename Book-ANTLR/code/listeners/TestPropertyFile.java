import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.Map;

public class TestPropertyFile {
    public static class PropertyFileLoader extends PropertyFileBaseListener {
        Map<String,String> props = new OrderedHashMap<String, String>();
        public void exitProp(PropertyFileParser.PropContext ctx) {
            String id    = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
            String value = ctx.STRING().getText();
            props.put(id, value);
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) { 
            inputFile = args[0]; 
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream   input  = new ANTLRInputStream(is);
        PropertyFileLexer  lexer  = new PropertyFileLexer(input);
        CommonTokenStream  tokens = new CommonTokenStream(lexer);
        PropertyFileParser parser = new PropertyFileParser(tokens);
        ParseTree          tree   = parser.file();
        ParseTreeWalker    walker = new ParseTreeWalker();
        PropertyFileLoader loader = new PropertyFileLoader();
        walker.walk(loader, tree);        // walk parse tree
        System.out.println(loader.props); // print results
    }
}
