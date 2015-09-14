public class AssignmentSub extends Statement {
    Variable mLhs;
    Expr     mRhs;
    
    public AssignmentSub(String lhs, Expr rhs) {
        mLhs = new Variable(lhs);
        mRhs = rhs;
    }

    public void execute() {
     Value lhsValue = Environment.findValue(mLhs.mName);
        Environment.putValue(mLhs.mName, lhsValue.sub(mRhs.eval()));
    }
    
    public String toString() {
        return mLhs + " -:= " + mRhs + ";";
    }
}