package Assembler;

public class IFEQ extends AssemblerCmd {
    private Integer mLabel;

    public IFEQ(Integer label) {
        mLabel = label;
    }
    public Integer getLabel() {
        return mLabel;
    }
    public String toString() {
        return "ifeq l" + mLabel;
    }
}
