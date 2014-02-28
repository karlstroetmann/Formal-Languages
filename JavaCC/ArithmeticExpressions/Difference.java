public class Difference extends Expr {
	Expr mLhs;
	Expr mRhs;
	
	public Difference(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}
	public Difference diff(Variable x) {
		return new Difference(mLhs.diff(x), mRhs.diff(x));
	}
	public String toString() {
		return mLhs.toString() + " - (" + mRhs.toString() + ")";
	}
}
