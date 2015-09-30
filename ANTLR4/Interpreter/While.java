import java.util.*;

public class While extends Statement {
    BoolExpr        mCond;
    List<Statement> mStmntList;
    
    public While(BoolExpr cond, List<Statement> stmntList) {
        mCond      = cond;
        mStmntList = stmntList;
    }
    public void execute() {
        while (mCond.eval()) {
            for (Statement stmnt: mStmntList) {
                stmnt.execute();
            }
        }
    }
    public String toString(int l) {
	String blanks     = nBlanks(4 * l);
	String moreBlanks = nBlanks(4 * l + 4);
	String result     = blanks;
        result += "while (" + mCond + ") {\n";
        for (Statement stmnt: mStmntList) {
            result += stmnt.toString(l+1) + "\n";
        }
        result += blanks + "}";
        return result;
    }
}
