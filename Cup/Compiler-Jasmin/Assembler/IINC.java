package Assembler;

public class IINC extends AssemblerCmd {
    private Integer mVariable;
    private Integer mNumber;

    public IINC(Integer variable, Integer number) {
        mVariable = variable;
        mNumber   = number;
    }
    public String toString() {
        return "       iinc " + mVariable + " " + mNumber;
    }
}
