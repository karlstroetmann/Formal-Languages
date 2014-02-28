package Assembler;

public class VAR_DEF extends AssemblerCmd {
    private String mName;

    public VAR_DEF(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "    " + mName;
    }
}
