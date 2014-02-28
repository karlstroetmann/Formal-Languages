public class LDC_W extends AssemblerCmd {
    private String mName;

    public LDC_W(String name) {
        mName = name;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof LDC_W)) {
            return false;
        }
        LDC_W r = (LDC_W) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "LDC_W(" + mName.toString() + ")";
    }
}
