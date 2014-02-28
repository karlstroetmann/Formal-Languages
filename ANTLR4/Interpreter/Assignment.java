public class Assignment extends Statement {
    Variable mLhs;
    Expr     mRhs;
    
    public Assignment(Variable lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public void execute() {
        Expr.sValueTable.put(mLhs.mName, mRhs.eval());
    }
    public String toString(int indent) {
        return nBlanks(indent * 4) + this;
    }
    public String toString() {
        return mLhs + " = " + mRhs + ";";
    }
}