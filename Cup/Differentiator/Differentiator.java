import java_cup.runtime.*;

public class Differentiator {
    public static void main(String[] args) {
        try { 
            parser p = new parser(new Yylex(System.in)); 
            Symbol s = p.parse(); 
            Expr   e = (Expr) s.value;
	        Expr   d = e.diff("x");
	        System.out.println("d/dx " + e + " = " + d);
        } catch (Exception e) {}
    }
}
