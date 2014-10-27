package Assembler;

public class IF_ICMPEQ extends AssemblerCmd {
    private Integer mLabel;

    public IF_ICMPEQ(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "       if_icmpeq l" + mLabel;
    }
}
