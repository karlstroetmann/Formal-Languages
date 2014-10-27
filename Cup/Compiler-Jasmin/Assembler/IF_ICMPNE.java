package Assembler;

public class IF_ICMPNE extends AssemblerCmd {
    private Integer mLabel;

    public IF_ICMPNE(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "       if_icmpne l" + mLabel;
    }
}
