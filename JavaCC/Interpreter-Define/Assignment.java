public class Assignment extends Statement {
	Variable mLhs;
	Expr     mRhs;
	boolean  mSemicolon;

	// The flag semicolon is set to signal that toString should attach 
	// a ";" at the end.
	public Assignment(Variable lhs, Expr rhs, boolean semicolon) {
		mLhs       = lhs;
		mRhs       = rhs;
		mSemicolon = semicolon;
		
	}
	public void execute(Environment e) throws ReturnException {
		e.putValue(mLhs.mName, mRhs.eval(e));
	}
	public String toString() {
		return mLhs + " = " + mRhs + (mSemicolon ? ";" : "");
	}
}