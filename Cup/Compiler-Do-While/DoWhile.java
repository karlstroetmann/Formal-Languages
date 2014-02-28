import java.util.*;

public class DoWhile extends Statement {
    private Statement mStmnt;
    private BoolExpr mCond;

    public DoWhile(Statement stmnt, BoolExpr cond) {
        mStmnt = stmnt;
        mCond = cond;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        LABEL        loopLabel = new LABEL();
        LABEL        nextLabel = new LABEL();
        AssemblerCmd ifeq      = new IFEQ(nextLabel.getLabel());
        AssemblerCmd gotoLoop  = new GOTO(loopLabel.getLabel());
        result.add(loopLabel);
        result.addAll(mStmnt.compile());
        result.addAll(mCond.compile());
        result.add(ifeq);
        result.add(gotoLoop);
        result.add(nextLabel);
        return result;
    }
    public Boolean equals(Statement rhs) {
        if (!(rhs instanceof DoWhile)) {
            return false;
        }
        DoWhile r = (DoWhile) rhs;
        if(!mStmnt.equals(r.mStmnt)) {
            return false;
        }
        if(!mCond.equals(r.mCond)) {
            return false;
        }
        return true;
    }
    public Statement getStmnt() {
        return mStmnt;
    }
    public BoolExpr getCond() {
        return mCond;
    }
    public String toString() {
        return "DoWhile(" + mStmnt.toString() + ", " + mCond.toString() + ")";
    }
}
