import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class CheckSymbols {
    public static Symbol.Type getType(int tokenType) {
        switch (tokenType) {
            case CymbolParser.K_VOID : return Symbol.Type.VOID;
            case CymbolParser.K_INT  : return Symbol.Type.INT;
            case CymbolParser.K_FLOAT: return Symbol.Type.FLOAT;
        }
        return Symbol.Type.INVALID;
    }
    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
    }
    public void process(String[] args) throws Exception {
        String      inputFile = null;
        InputStream is        = System.in;
        if (args.length > 0)   { inputFile = args[0];                 }
        if (inputFile != null) { is = new FileInputStream(inputFile); }
        ANTLRInputStream  input  = new ANTLRInputStream(is);
        CymbolLexer       lexer  = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser      parser = new CymbolParser(tokens);
        ParseTree         tree   = parser.file();
        ParseTreeWalker   walker = new ParseTreeWalker();
        DefPhase          def    = new DefPhase();
        walker.walk(def, tree);
        // create next phase and feed symbol table info from def to ref phase
        RefPhase          ref = new RefPhase(def.globals, def.scopes);
        walker.walk(ref, tree);
    }

    public static void main(String[] args) throws Exception {
        new CheckSymbols().process(args);
    }
}
