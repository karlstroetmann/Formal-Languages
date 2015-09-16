public class Negation extends BoolExpr {
    BoolExpr mExpr;

    public Negation(BoolExpr expr) {
        mExpr = expr;
    }
    public Boolean eval() throws ReturnException {
    	return !mExpr.eval();
    }
    public String toString() {
        return "!(" + mExpr + ")";
    }
}