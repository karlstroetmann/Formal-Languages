import java.util.*;

public class IfThenElse extends Statement {
    private BoolExpr  mCondition;
    private Statement mThen;
    private Statement mElse;

    public IfThenElse(BoolExpr condition, Statement thenStmnt, Statement elseStmnt) {
        mCondition = condition;
        mThen      = thenStmnt;
        mElse      = elseStmnt;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = mCondition.compile();
		LABEL        elseLabel = new LABEL();
		LABEL        nextLabel = new LABEL();
		AssemblerCmd ifeq      = new IFEQ(elseLabel.getLabel());
		AssemblerCmd gotoNext  = new GOTO(nextLabel.getLabel());
		result.add(ifeq);
		result.addAll(mThen.compile());
		result.add(gotoNext);
		result.add(elseLabel);
		result.addAll(mElse.compile());
		result.add(nextLabel);
		return result;
	}
    public BoolExpr getCondition() {
        return mCondition;
    }
    public Statement getThen() {
        return mThen;
    }
    public Statement getElse() {
        return mElse;
    }
    public String toString() {
        return "IfThenElse(" + mCondition.toString() + ", " + mThen.toString() + ", " + mElse.toString() + ")";
    }
}
