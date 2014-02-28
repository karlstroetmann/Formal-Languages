import java.util.*;

public class IfThen extends Statement {
    BoolExpr        mCond;
    List<Statement> mStmntListOne;
    List<Statement> mStmntListTwo;
    
    public IfThen(BoolExpr cond, List<Statement> stmntListOne, List<Statement> stmntListTwo) {
        mCond         = cond;
        mStmntListOne = stmntListOne;
        mStmntListTwo = stmntListTwo;
    }
    
    public void execute() throws ReturnException {
    	if (mCond.eval()) {
            for (Statement stmnt: mStmntListOne) {
                stmnt.execute();
            }
        }else {
            for (Statement stmnt: mStmntListTwo) {
                stmnt.execute();
            }
        }
    }
    public String toString() {
        String result = "if (" + mCond + ") {\n";
        for (Statement stmnt: mStmntListOne) {
            result += stmnt + "\n";
        }
        result += "}";
        
        if(mStmntListTwo != null){
        	result += "else {\n";
            for (Statement stmnt: mStmntListTwo) {
                result += stmnt + "\n";
            }
            result += "}";
        }
        
        return result;
    }
}