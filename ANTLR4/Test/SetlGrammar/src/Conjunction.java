import java.util.List;

public class Conjunction extends BoolExpr {
    BoolExpr mLhs;
    List<BoolExpr> mRhs;

    public Conjunction(BoolExpr lhs, List<BoolExpr> rhs) {
        mLhs = lhs;
        if (rhs != null) {
            mRhs = rhs;
		}
    }
    
    public Boolean eval() throws ReturnException {
    	if (mRhs == null) {
			return mLhs.eval();
		}
    	
    	Boolean result = mLhs.eval();
    	for (BoolExpr bExpr : mRhs) {
    		result = result && bExpr.eval();
		}
    	
        return result;
    }
    
    public String toString() {
    	
    	String result;
    	
    	result = "(" + mLhs.toString() + ")";
    	
    	for (BoolExpr bExpr : mRhs) {
    		result += " && (" + bExpr.toString() + ")";
		}
    	
        return result;
    }
}