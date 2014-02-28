package output;
import java.util.*;

public class IfThen extends Statement {
    BoolExpr        mCond;
    List<Statement> mStmntList;
    
    public IfThen(BoolExpr cond, List<Statement> stmntList) {
        mCond      = cond;
        mStmntList = stmntList;
    }
    public void execute() {
        if (mCond.eval()) {
            for (Statement stmnt: mStmntList) {
                stmnt.execute();
            }
        }
    }
    public String toString() {
        String result = "if (" + mCond + ") {\n";
        for (Statement stmnt: mStmntList) {
            result += stmnt + "\n";
        }
        result += "}";
        return result;
    }
}