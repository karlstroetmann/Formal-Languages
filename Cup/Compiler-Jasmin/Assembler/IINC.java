package Assembler;

public class IINC extends AssemblerCmd {
    private String  mVar;
    private Integer mNumber;

    public IINC(String var, Integer number) {
        mVar = var;
        mNumber = number;
    }
    public String toString() {
        return "iinc " + mVar + " " + mNumber;
    }
}
