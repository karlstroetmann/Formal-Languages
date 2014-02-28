public class Negation extends BoolExpr {
    private BoolExpr mExpr;

    public Negation(BoolExpr expr) {
        mExpr = expr;
    }
    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof Negation)) {
            return false;
        }
        Negation r = (Negation) rhs;
        if(!mExpr.equals(r.mExpr)) {
            return false;
        }
        return true;
    }
    public BoolExpr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "Negation(" + mExpr.toString() + ")";
    }
}
