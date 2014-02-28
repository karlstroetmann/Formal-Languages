public class Sum extends Expr {
	Expr mLhs;
	Expr mRhs;
	
	public Sum(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}
	public Double eval()	{
		return mLhs.eval() + mRhs.eval();
	}
	public String toString() {
		return mLhs.toString() + " + " + mRhs.toString();
	}
}
