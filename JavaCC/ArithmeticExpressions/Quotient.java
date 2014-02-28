public class Quotient extends Expr {
	Expr mLhs;
	Expr mRhs;
	
	public Quotient(Expr lhs, Expr rhs)	{
		mLhs = lhs;
		mRhs = rhs;
	}	
	public Quotient diff(Variable x) {
		return new Quotient(new Difference(new Product(mLhs.diff(x), mRhs), 
										   new Product(mLhs, mRhs.diff(x))),
							new Product(mRhs, mRhs));
	}
	public String toString() {
		return "(" + mLhs.toString() + ") / (" + mRhs.toString() + ")";
	}
}
