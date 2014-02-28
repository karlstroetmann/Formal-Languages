import org.antlr.runtime.*;

public class EBNF {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream   input  = new ANTLRInputStream(System.in);
        EBNF_GrammarLexer  lexer  = new EBNF_GrammarLexer(input);
        CommonTokenStream  ts     = new CommonTokenStream(lexer);
        EBNF_GrammarParser parser = new EBNF_GrammarParser(ts);
        Grammar            g      = parser.ebnf_grammar();
        System.out.println(g);
    }
}

