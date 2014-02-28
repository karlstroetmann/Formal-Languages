package Assembler;

public class ILOAD extends AssemblerCmd {
    private Integer mIndex;

    public ILOAD(Integer index) {
        mIndex = index;
    }
    public String toString() {
        return "iload " + mIndex;
    }
}
