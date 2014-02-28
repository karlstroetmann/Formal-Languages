import org.antlr.runtime.*;

public class GrammarAnalysis {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream  input  = new ANTLRInputStream(System.in);
        grammatikLexer    lexer  = new grammatikLexer(input);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        grammatikParser   parser = new grammatikParser(ts);
        Grammar           g      = parser.grammatik();
    }
}

