package Assembler;

public class IFEQ extends AssemblerCmd {
    private Integer mLabel;

    public IFEQ(Integer label) {
        mLabel = label;
    }
    public String toString() {
        return "       ifeq l" + mLabel;
    }
}
