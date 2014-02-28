package Assembler;

public class LIMIT extends AssemblerCmd {
    String  mWhat;
    Integer mBound;

    public LIMIT(String what, Integer bound) {
        mWhat  = what;
        mBound = bound;
    }
    public String toString() {
        return ".limit " + mWhat + " " + mBound;
    }
}
