import java.util.*;

public class For extends Statement {
    Statement       mInit;
    BoolExpr        mCond;
    Statement       mUpdate;
    List<Statement> mStmntList;
    
    public For(Statement init, BoolExpr cond, Statement update, List<Statement> stmntList) {
        mInit      = init;
        mCond      = cond;
        mUpdate    = update;
        mStmntList = stmntList;
    }
    public void execute(Environment e) throws ReturnException {
        for (mInit.execute(e); mCond.eval(e); mUpdate.execute(e)) {
            for (Statement stmnt: mStmntList) {
                stmnt.execute(e);
            }
        }
    }
}
