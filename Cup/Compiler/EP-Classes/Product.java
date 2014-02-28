public class Product extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Product(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(Expr rhs) {
        if (!(rhs instanceof Product)) {
            return false;
        }
        Product r = (Product) rhs;
        if(!mLhs.equals(r.mLhs)) {
            return false;
        }
        if(!mRhs.equals(r.mRhs)) {
            return false;
        }
        return true;
    }
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Product(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
