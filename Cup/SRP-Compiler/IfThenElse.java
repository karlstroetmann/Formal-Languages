import assembler.*;
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
    public List<AssemblerCmd> compile(Map<String, Location> symbolTable) {
        //       mBoolExpr.compile()
        //       ifeq elseLabel, mCondition.getReg(), R0
        //       mThen.compile()
        //       goto next
        // label elseLabel
        //       mElse.compile()
        // label next
        LABEL elseLabel = new LABEL();
        LABEL nextLabel = new LABEL();
        List<AssemblerCmd> result = mCondition.compile(0, symbolTable);
        result.add(new IFEQ(elseLabel.getLabel(), mCondition.getReg(), 0));
        result.addAll(mThen.compile(symbolTable));
        result.add(new GOTO(nextLabel.getLabel()));
        result.add(elseLabel);
        result.addAll(mElse.compile(symbolTable));
        result.add(nextLabel);
        return result;
    }
    protected int maxErshov() {
    int result = 1;
        result = Math.max(result, mCondition.getErshov());
        result = Math.max(result, mThen     .maxErshov());
        result = Math.max(result, mElse     .maxErshov());
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
