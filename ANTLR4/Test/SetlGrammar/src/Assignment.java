public class Assignment extends Statement {
    Variable mLhs;
    Expr     mRhs;
    
    public Assignment(String lhs, Expr rhs) {
        mLhs = new Variable(lhs);
        mRhs = rhs;
    }
    public void execute() {
		Environment.putValue(mLhs.mName, mRhs.eval());
	}
    public String toString() {
        return mLhs + " := " + mRhs + ";";
    }
}