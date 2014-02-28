public class Assign extends Statement {
    private String mVar;
    private Expr mExpr;

    public Assign(String var, Expr expr) {
        mVar = var;
        mExpr = expr;
    }
    public Boolean equals(Statement rhs) {
        if (!(rhs instanceof Assign)) {
            return false;
        }
        Assign r = (Assign) rhs;
        if(!mVar.equals(r.mVar)) {
            return false;
        }
        if(!mExpr.equals(r.mExpr)) {
            return false;
        }
        return true;
    }
    public String getVar() {
        return mVar;
    }
    public Expr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "Assign(" + mVar.toString() + ", " + mExpr.toString() + ")";
    }
}
