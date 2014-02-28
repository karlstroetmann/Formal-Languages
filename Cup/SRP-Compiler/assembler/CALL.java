package assembler;

public class CALL extends AssemblerCmd {
    private String mName;

    public CALL(String name) {
        mName = name;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof CALL)) {
            return false;
        }
        CALL r = (CALL) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "      call   " + mName;
    }
}
