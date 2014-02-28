public class ILOAD extends AssemblerCmd {
    private String mVar;

    public ILOAD(String var) {
        mVar = var;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof ILOAD)) {
            return false;
        }
        ILOAD r = (ILOAD) rhs;
        if(!mVar.equals(r.mVar)) {
            return false;
        }
        return true;
    }
    public String getVar() {
        return mVar;
    }
    public String toString() {
        return "ILOAD(" + mVar.toString() + ")";
    }
}
