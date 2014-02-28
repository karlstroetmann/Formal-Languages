public class LessThan extends BoolExpr {
	Expr mLhs;
	Expr mRhs;
	
	public LessThan(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}
	public Boolean eval(Environment e) throws ReturnException {
		if (mLhs.eval(e) < mRhs.eval(e)) {
			return true;
		}
		return false;
	}
	public String toString() {
		return mLhs + " < " + mRhs;
	}
}