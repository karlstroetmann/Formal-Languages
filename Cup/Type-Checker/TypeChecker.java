import java_cup.runtime.*;
import java.io.*;

public class TypeChecker {
    public static void main(String[] args) {
        try { 
            // parser  p    = new parser(new Yylex(System.in)); 
            File    f    = new File("types.ttl");
            FileReader r = new FileReader(f);
            parser  p    = new parser(new Yylex(r)); 
            Symbol  s    = p.parse(); 
            Program prog = (Program) s.value;
            System.out.println(prog.myString());
            prog.typeCheck();
        } catch (Exception e) {}
    }
}
