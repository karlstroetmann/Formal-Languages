public class Quotient extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Quotient(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Expr diff(String x) {
	Expr dividend = new Difference(new Product(mLhs.diff(x), mRhs), 
				       new Product(mLhs, mRhs.diff(x)));
	Expr divisor  = new Product(mRhs, mRhs);
        return new Quotient(dividend, divisor);
    }
    public String toString() {
        return "(" + mLhs.toString() + " / " + mRhs.toString() + ")";
    }
}
