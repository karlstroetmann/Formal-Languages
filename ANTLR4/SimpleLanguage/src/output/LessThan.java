package output;
public class LessThan extends BoolExpr {
	Expr mLhs;
	Expr mRhs;
	
	public LessThan(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}
	public Boolean eval() {
		if (mLhs.eval() < mRhs.eval()) {
			return true;
		}
		return false;
	}
	public String toString() {
		return mLhs + " < " + mRhs;
	}
}