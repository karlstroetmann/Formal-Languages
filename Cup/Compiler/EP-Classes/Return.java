public class Return extends Statement {
    private Expr mExpr;

    public Return(Expr expr) {
        mExpr = expr;
    }
    public Boolean equals(Statement rhs) {
        if (!(rhs instanceof Return)) {
            return false;
        }
        Return r = (Return) rhs;
        if(!mExpr.equals(r.mExpr)) {
            return false;
        }
        return true;
    }
    public Expr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "Return(" + mExpr.toString() + ")";
    }
}
