public class Product extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Product(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Expr diff(String x) {
		Expr lhsDiff = mLhs.diff(x);
		Expr rhsDiff = mRhs.diff(x);
        return new Sum(new Product(lhsDiff, mRhs), 
                       new Product(mLhs, rhsDiff));
    }
    public String toString() {
        return "(" + mLhs.toString() + " * " + mRhs.toString() + ")";
    }
}
