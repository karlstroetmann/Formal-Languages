public class Declaration {
    private String mVar;

    public Declaration(String var) {
        mVar = var;
    }
    public Boolean equals(Declaration rhs) {
        if (!(rhs instanceof Declaration)) {
            return false;
        }
        if(!mVar.equals(rhs.mVar)) {
            return false;
        }
        return true;
    }
    public String getVar() {
        return mVar;
    }
    public String toString() {
        return "Declaration(" + mVar.toString() + ")";
    }
}
