import java_cup.runtime.*;

public class Calculator {
    public static void main(String[] args) {
        try { 
            parser p = new parser(new Yylex(System.in)); 
            p.parse(); 
        } catch (Exception e) {}
    }
}
