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
    public String toString(int l) {
        String blanks     = nBlanks(4 * l);
        String moreBlanks = nBlanks(4 * l + 4);
        String result     = blanks;
        result += "if (" + mCond + ") {\n";
        for (Statement stmnt: mStmntList) {
            result += moreBlanks + stmnt + "\n";
        }
        result += blanks + "}";
        return result;
    }
}