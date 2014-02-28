package Assembler;

public class IF_ICMPLE extends AssemblerCmd {
    private Integer mLabel;

    public IF_ICMPLE(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "if_icmple l" + mLabel;
    }
}
