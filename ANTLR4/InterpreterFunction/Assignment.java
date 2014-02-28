public class Assignment extends Statement {
    String mLhs;
    Expr   mRhs;
    
    public Assignment(String lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public void execute(Environment e) throws ReturnException {
        e.putValue(mLhs, mRhs.eval(e));
    }
}