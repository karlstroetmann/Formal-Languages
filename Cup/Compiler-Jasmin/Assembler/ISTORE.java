package Assembler;

public class ISTORE extends AssemblerCmd {
    private Integer mIndex;

    public ISTORE(Integer index) {
        mIndex = index;
    }
    public String toString() {
        return "istore " + mIndex;
    }
}
