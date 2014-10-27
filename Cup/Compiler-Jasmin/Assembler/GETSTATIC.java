package Assembler;

public class GETSTATIC extends AssemblerCmd {
    String mAll;
    public GETSTATIC(String all) {
        mAll = all;
    }
    public String toString() {
        return "       getstatic " + mAll;
    }
}
