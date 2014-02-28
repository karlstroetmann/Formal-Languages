public class Equal extends BoolExpr {
	Expr mLhs;
	Expr mRhs;
	
	public Equal(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}
	public Boolean eval(Environment e) throws ReturnException {
		if ((double) mLhs.eval(e) == (double) mRhs.eval(e)) {
			return true;
		}
		return false;
	}
	public String toString() {
		return mLhs + " == " + mRhs;
	}
}
		