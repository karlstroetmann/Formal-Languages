package Assembler;

public class IF_ICMPGT extends AssemblerCmd {
    private Integer mLabel;

    public IF_ICMPGT(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "       if_icmpgt l" + mLabel;
    }
}
