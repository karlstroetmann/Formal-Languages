public class Sum extends Expr {
	Expr mLhs;
	Expr mRhs;
	
	public Sum(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}
	public Sum diff(Variable x)	{
		return new Sum(mLhs.diff(x), mRhs.diff(x));
	}
	public String toString() {
		return mLhs.toString() + " + " + mRhs.toString();
	}
}
