public class Equal extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public Equal(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() throws ReturnException {
    	
    	try{
    		return ((Value) mLhs.eval()).eq((Value) mRhs.eval());
        
    	}catch(Exception ex){
    		
    	}
    	
    	return null;
    }
    
    public String toString() {
        return mLhs + " == " + mRhs;
    }
}
        