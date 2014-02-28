public class Negation extends BoolExpr {
    BoolExpr mExpr;

    public Negation(BoolExpr expr) {
        mExpr = expr;
    }
    public Boolean eval(Environment e) {
        return !mExpr.eval(e);
    }
}