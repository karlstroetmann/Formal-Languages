public class INVOKE extends AssemblerCmd {
    private String mName;

    public INVOKE(String name) {
        mName = name;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof INVOKE)) {
            return false;
        }
        INVOKE r = (INVOKE) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "INVOKE(" + mName.toString() + ")";
    }
}
