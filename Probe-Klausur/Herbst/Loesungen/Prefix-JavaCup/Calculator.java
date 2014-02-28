import java_cup.runtime.*;

public class Calculator {
    public static void main(String[] args) {
        try { 
            parser  p = new parser(new Yylex(System.in)); 
            Symbol  s = p.parse(); 
            Integer n = (Integer) s.value;
			System.out.println(n);
        } catch (Exception e) {}
    }
}
