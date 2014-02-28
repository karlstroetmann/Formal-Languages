import org.antlr.runtime.*;
import java.io.FileInputStream;

public class GrammarAnalysis {

    public static void main(String[] args) throws Exception {
        FileInputStream   stream = new FileInputStream(args[0]);
        ANTLRInputStream  input  = new ANTLRInputStream(stream);
        grammatikLexer    lexer  = new grammatikLexer(input);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        grammatikParser   parser = new grammatikParser(ts);
        Grammar           g      = parser.grammatik();
    }
}

