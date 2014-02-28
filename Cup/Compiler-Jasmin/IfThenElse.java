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
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = mExpr.compile(symbolTable);
        LABEL        elseLabel = new LABEL();
        LABEL        nextLabel = new LABEL();
        AssemblerCmd ifeq      = new IFEQ(elseLabel.getLabel());
        AssemblerCmd gotoNext  = new GOTO(nextLabel.getLabel());
        result.add(ifeq);
        result.addAll(mThen.compile(symbolTable));
        result.add(gotoNext);
        result.add(elseLabel);
        result.addAll(mElse.compile(symbolTable));
        result.add(nextLabel);
        return result;
    }
    public Integer stackSize() {
        return Math.max(mExpr.stackSize(), Math.max(mThen.stackSize(), mElse.stackSize()));
    }
    public String toString() {
        return "IfThenElse(" + mExpr.toString() + ", " + mThen.toString() + ", " + mElse.toString() + ")";
    }
}
