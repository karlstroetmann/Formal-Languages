package output;
	public class Increment extends Statement {
	    Variable mLhs;
	    
	    public Increment(Variable lhs) {
	        mLhs = lhs;
	    }
	    public void execute() {
	    	Double value = Expr.sValueTable.get(mLhs.mName);
	    	Expr.sValueTable.put(mLhs.mName, ++value);
	    }
	    public String toString() {
	        return mLhs + "++;";
	    }
	}
