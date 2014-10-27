package Assembler;

public class PRINTLN extends AssemblerCmd {
    public PRINTLN() {}
    public String toString() {
        return "       invokevirtual java/io/PrintStream/println(I)V";
    }
}
