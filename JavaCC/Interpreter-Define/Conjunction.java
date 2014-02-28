public class Conjunction extends BoolExpr {
	BoolExpr mLhs;
	BoolExpr mRhs;

	public Conjunction(BoolExpr lhs, BoolExpr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}
	public Boolean eval(Environment e) throws ReturnException {
		return mLhs.eval(e) && mRhs.eval(e);
	}
	public String toString() {
		return "(" + mLhs + ") && (" + mRhs + ")";
	}
}