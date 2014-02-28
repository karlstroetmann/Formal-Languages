import org.antlr.v4.runtime.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Grammatik2HTML {
    public static void main(String[] args) throws Exception {
        String inputFile = null; 
        InputStream is = System.in;
        if (args.length > 0)   { inputFile = args[0];                 }
	System.out.println(inputFile);
        if (inputFile != null) { is = new FileInputStream(inputFile); }
        ANTLRInputStream  input   = new ANTLRInputStream(is);
        GrammatikLexer    lexer   = new GrammatikLexer(input);
        CommonTokenStream tokens  = new CommonTokenStream(lexer);
        GrammatikParser   parser  = new GrammatikParser(tokens);
        Grammar           grammar = parser.grammatik().g; 
        System.out.println(grammar); 
    }
}
