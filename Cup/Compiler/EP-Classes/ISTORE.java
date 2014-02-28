public class ISTORE extends AssemblerCmd {
    private String mVar;

    public ISTORE(String var) {
        mVar = var;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof ISTORE)) {
            return false;
        }
        ISTORE r = (ISTORE) rhs;
        if(!mVar.equals(r.mVar)) {
            return false;
        }
        return true;
    }
    public String getVar() {
        return mVar;
    }
    public String toString() {
        return "ISTORE(" + mVar.toString() + ")";
    }
}
