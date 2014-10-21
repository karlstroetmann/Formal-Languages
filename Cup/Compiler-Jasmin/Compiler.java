import Assembler.*;
import java_cup.runtime.*;
import java.io.*;
import java.util.*;

public class Compiler {
    public static String sClassName;

    public static void main(String[] args) {
        try { 
            sClassName = args[0];
            File           f = new File(args[0] + ".c");
            FileReader     r = new FileReader(f);
            IntegerCParser p = new IntegerCParser(new Yylex(r)); 
            Symbol         s = p.parse(); 
            Program        prog = (Program) s.value;
//          System.out.println("Program: " + prog);
            List<AssemblerCmd> asmCmds = prog.compile();
            File assembler = new File(args[0] + ".jas");
            FileWriter fw = new FileWriter(assembler);
            fw.write(".class public " + args[0] + "\n");
            fw.write(".super java/lang/Object\n\n");
            fw.write(".method public <init>()V\n");
            fw.write("    aload 0\n");
            fw.write("    invokenonvirtual java/lang/Object/<init>()V\n");
            fw.write("    return\n");
            fw.write(".end method\n\n");
            for (AssemblerCmd cmd: asmCmds) {
                fw.write(cmd + "\n");
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
