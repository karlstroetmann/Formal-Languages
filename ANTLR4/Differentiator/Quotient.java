public class Quotient extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Quotient(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    // Quotient rule: (p/q)' = (p' * q - p * q') / (q * q)
    public Expr diff(String x) {
	Expr psq     = new Product(mLhs.diff(x), mRhs);
	Expr pqs     = new Product(mLhs, mRhs.diff(x));
	Expr psq_pqs = new Difference(psq, pqs);
	Expr qq      = new Product(mRhs, mRhs);
        return new Quotient(psq_pqs, qq);
    }
    public String toString() {
        return mLhs.toString() + " / " + mRhs.toString();
    }
}
