import java.util.*;

public class For extends Statement {
    Assignment  mInit;
    BoolExpr    mCond;
    Assignment  mUpdate;
    List<Statement> mStmntList;
    
    public For(Assignment init, BoolExpr cond, Assignment update, List<Statement> stmntList) {
        mInit      = init;
        mCond      = cond;
        mUpdate    = update;
        mStmntList = stmntList;
    }
    public void execute() {
        for (mInit.execute(); mCond.eval(); mUpdate.execute()) {
            for (Statement stmnt: mStmntList) {
                stmnt.execute();
            }
        }
    }
    public String toString(int l) {
        String blanks     = nBlanks(4 * l);
        String moreBlanks = nBlanks(4 * l + 4);
        String result     = blanks;
        result += "for (" + mInit + " " + mCond + "; " + mUpdate + ") {\n";
        for (Statement stmnt: mStmntList) {
            result += moreBlanks + stmnt + "\n";
        }
        result += blanks + "}";
        return result;
    }
    public String toString() {
        String result = "for (" + mInit + " " + mCond + "; " +
			mUpdate.mLhs + " = " + mUpdate.mRhs + ") {\n";
        for (Statement stmnt: mStmntList) {
            result += stmnt + "\n";
        }
        result += "}";
        return result;
    }
}
