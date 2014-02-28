public class Negation extends BoolExpr {
	BoolExpr mExpr;

	public Negation(BoolExpr expr) {
		mExpr = expr;
	}
	public Boolean eval(Environment e) throws ReturnException {
		return ! mExpr.eval(e);
	}
	public String toString() {
		return "!(" + mExpr + ")";
	}
}