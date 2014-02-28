import java_cup.runtime.*;
import java.io.*;
import java.util.*;

public class Compiler {
	public static void main(String[] args) {
		try { 
			File    f    = new File(args[0] + ".c");
			FileReader r = new FileReader(f);
			parser  p    = new parser(new Yylex(r)); 
			Symbol  s    = p.parse(); 
 			Program prog = (Program) s.value;
// 			System.out.println("Program: " + prog);
 			List<AssemblerCmd> asmCmds = prog.compile();
			File assembler = new File(args[0] + ".jas");
			FileWriter fw = new FileWriter(assembler);
			for (AssemblerCmd cmd: asmCmds) {
				fw.write(cmd + "\n");
			}
			fw.close();
		} catch (Exception e) {}
	}
}
