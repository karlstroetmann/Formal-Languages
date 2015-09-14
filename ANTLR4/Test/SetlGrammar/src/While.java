import java.util.*;

public class While extends Statement {
    BoolExpr        mCond;
    List<Statement> mStmntList;
    
    public While(BoolExpr cond, List<Statement> stmntList) {
        mCond      = cond;
        mStmntList = stmntList;
    }
    
    public void execute() throws ReturnException {
        while (mCond.eval()) {
            for (Statement stmnt: mStmntList) {
                stmnt.execute();
            }
        }
    }
    
    public String toString() {
        String result = "while " + mCond + " loop\n";
        for (Statement stmnt: mStmntList) {
            result += stmnt + "\n";
        }
        result += "\nend loop";
        return result;
    }
}
