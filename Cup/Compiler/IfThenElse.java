import Assembler.*;
import java.util.*;

public class IfThenElse extends Statement {
    private BoolExpr  mExpr;
    private Statement mThen;
    private Statement mElse;

    public IfThenElse(BoolExpr expr, Statement thenStmnt, Statement elseStmnt) {
        mExpr = expr;
        mThen = thenStmnt;
        mElse = elseStmnt;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = mExpr.compile();
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
    public BoolExpr getExpr() {
        return mExpr;
    }
    public Statement getThen() {
        return mThen;
    }
    public Statement getElse() {
        return mElse;
    }
    public String toString() {
        return "IfThenElse(" + mExpr.toString() + ", " + mThen.toString() + ", " + mElse.toString() + ")";
    }
}
