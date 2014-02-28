public class VAR_DEF extends AssemblerCmd {
    private String mName;

    public VAR_DEF(String name) {
        mName = name;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof VAR_DEF)) {
            return false;
        }
        VAR_DEF r = (VAR_DEF) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "VAR_DEF(" + mName.toString() + ")";
    }
}
