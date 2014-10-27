package Assembler;

public class IF_ICMPLT extends AssemblerCmd {
    private Integer mLabel;

    public IF_ICMPLT(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "       if_icmplt l" + mLabel;
    }
}
