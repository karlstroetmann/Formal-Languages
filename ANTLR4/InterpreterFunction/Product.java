public class Product extends Expr {
    Expr mLhs;
    Expr mRhs;
    
    public Product(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }    
    public Value eval(Environment e) {
        return mLhs.eval(e).multiply(mRhs.eval(e));
    }
}
