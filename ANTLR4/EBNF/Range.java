public class Range extends Expr { 
    String mLhs;
    String mRhs;

    public Range(String lhs, String rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }

    public String toString(Boolean indent) {
        return mLhs + ".." + mRhs;
    }
}
		
	