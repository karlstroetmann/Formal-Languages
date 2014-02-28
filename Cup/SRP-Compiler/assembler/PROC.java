package assembler;

public class PROC extends AssemblerCmd {
    private String mName;

    public PROC(String name) {
        mName = name;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof PROC)) {
            return false;
        }
        PROC r = (PROC) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "proc  " + mName;
    }
}
