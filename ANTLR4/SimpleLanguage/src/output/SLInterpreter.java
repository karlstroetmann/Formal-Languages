package output;
import org.antlr.runtime.*;
import java.util.List;

public class SLInterpreter {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream     input   = new ANTLRInputStream(System.in);
        simpleLanguageLexer  lexer   = new simpleLanguageLexer(input);
        CommonTokenStream    ts      = new CommonTokenStream(lexer);
        simpleLanguageParser parser  = new simpleLanguageParser(ts);
        List<Statement>      program = parser.simpleLanguage();
        System.out.println("\nProgram listing:\n");
        for (Statement stmnt: program) {
            System.out.println(stmnt);
        }
        System.out.println("\nProgram trace:\n");
        for (Statement stmnt: program) {
            stmnt.execute();
        }
    }
}
