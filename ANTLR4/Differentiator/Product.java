public class Product extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Product(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Expr diff(String x) {
        return new Sum(new Product(mLhs.diff(x), mRhs), 
                       new Product(mLhs, mRhs.diff(x)));
    }
    public String toString() {
        return mLhs.toString() + " * " + mRhs.toString();
    }
}
