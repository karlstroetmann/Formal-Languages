package Assembler;

public class LDC extends AssemblerCmd {
    private Integer mNumber;

    public LDC(Integer number) {
        mNumber = number;
    }
    public String toString() {
        return "       ldc " + mNumber;
    }
}
