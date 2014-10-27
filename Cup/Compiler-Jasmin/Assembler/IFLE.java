package Assembler;

public class IFLE extends AssemblerCmd {
    private Integer mLabel;

    public IFLE(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "       ifle l" + mLabel;
    }
}
