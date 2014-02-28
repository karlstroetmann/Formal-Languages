import java.util.*;

public class IfThen extends Statement {
    BoolExpr        mCond;
    List<Statement> mStmntList;
    
    public IfThen(BoolExpr cond, List<Statement> stmntList) {
        mCond      = cond;
        mStmntList = stmntList;
    }
    public void execute(Environment e) throws ReturnException {
        if (mCond.eval(e)) {
            for (Statement stmnt: mStmntList) {
                stmnt.execute(e);
            }
        }
    }
}