import java.util.*;

public class ForBasic extends Statement {
    Variable mVar;
    Expr     mStart;
    Expr     mLast;
    Expr     mIncr;
    List<Statement> mStmntList;
    
    public ForBasic(Variable var, Expr start, Expr last, Expr incr, 
                    List<Statement> stmntList) 
    {
        mVar   = var;
        mStart = start;
        mLast  = last;
        mIncr  = incr;
        mStmntList = stmntList;
    }
    public void execute() {
        Expr.sValueTable.put(mVar.mName, mStart.eval());
        Double last = mLast.eval();
        while (mVar.eval() <= last) {
            for (Statement stmnt: mStmntList) {
                stmnt.execute();
            }
            Expr.sValueTable.put(mVar.mName, mVar.eval() + mIncr.eval());
        }
    }
    public String toString(int l) {
        String blanks     = nBlanks(4 * l);
        String moreBlanks = nBlanks(4 * l + 4);
        String result     = blanks;
        result += "for " + mVar + " from " + mStart + " to " + mLast + " step " + mIncr + " {\n";
        for (Statement stmnt: mStmntList) {
            result += moreBlanks + stmnt + "\n";
        }
        result += blanks + "}";
        return result;
    }
    public String toString() {
        String result = "";
        result += "for " + mVar + " from " + mStart + " to " + mLast + " step " + mIncr + " {\n";
        for (Statement stmnt: mStmntList) {
            result += stmnt + "\n";
        }
        result += "}";
        return result;
    }
}
