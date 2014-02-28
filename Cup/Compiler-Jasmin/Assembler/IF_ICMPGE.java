package Assembler;

public class IF_ICMPGE extends AssemblerCmd {
    private Integer mLabel;

    public IF_ICMPGE(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "if_icmpge l" + mLabel;
    }
}
