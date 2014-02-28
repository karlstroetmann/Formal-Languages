package Assembler;

public class GOTO extends AssemblerCmd {
    private Integer mLabel;

    public GOTO(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "goto l" + mLabel;
    }
}
