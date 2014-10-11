import java_cup.runtime.*;
import java.io.*;

public class Differentiator {
    public static void main(String[] args) {
        try { 
	    Reader  reader  = new InputStreamReader(System.in);
	    Scanner scanner = new Yylex(reader);
            parser  parser  = new parser(scanner); 
            Symbol  symbol  = parser.parse(); 
            Expr    expr    = (Expr) symbol.value;
	    Expr    derivative = expr.diff("x");
	    System.out.println("d/dx " + expr + " = " + derivative);
        } catch (Exception e) {}
    }
}
