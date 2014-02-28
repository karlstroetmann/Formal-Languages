public class ExprStatement extends Statement {
    private Expr mExpr;

    public ExprStatement(Expr expr) {
        mExpr = expr;
    }
    public Boolean equals(Statement rhs) {
        if (!(rhs instanceof ExprStatement)) {
            return false;
        }
        ExprStatement r = (ExprStatement) rhs;
        if(!mExpr.equals(r.mExpr)) {
            return false;
        }
        return true;
    }
    public Expr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "ExprStatement(" + mExpr.toString() + ")";
    }
}
