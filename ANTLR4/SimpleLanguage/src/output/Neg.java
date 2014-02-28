package output;

public class Neg extends BoolExpr{
    BoolExpr mLhs;
    
    public Neg(BoolExpr lhs) {
        mLhs = lhs;
    }
    public Boolean eval() {
        return !mLhs.eval();
    }
    public String toString() {
        return "!" + mLhs;
    }
}
