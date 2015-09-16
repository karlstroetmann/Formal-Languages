import java.util.*;

public class For extends Statement {
    String       mVar;
    Expr        	mExpr;
    List<Statement> mStmntList;
    
    public For(String var, Expr expr, List<Statement> stmntList) {
        mVar      = var;
        mExpr      = expr;
        mStmntList = stmntList;
    }	
    
    @SuppressWarnings("unchecked")
	public void execute() throws ReturnException {
    	
    	SetOrList sOLExpr = (SetOrList) mExpr.eval();
    	
    	Iterator it = sOLExpr.iterator();
    	
    	while(it.hasNext()){
    		Value val = (Value) it.next();
    		
    		Environment.putValue(mVar, val);
    		
    		for (Statement stmnt: mStmntList) {
                stmnt.execute();
            }		
    	}
    }
    
    public String toString() {
    	
        String result = "for " + mVar + "in " + mExpr + " loop\n";
        
        for (Statement stmnt: mStmntList) {
            result += stmnt + "\n";
        }
        
        result += "end loop;";
        
        return result;
    }
}