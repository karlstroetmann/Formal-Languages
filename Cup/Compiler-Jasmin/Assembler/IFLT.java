package Assembler;

public class IFLT extends AssemblerCmd {
    private Integer mLabel;

    public IFLT(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "       iflt l" + mLabel;
    }
}
