import assembler.*;
import java.util.*;

public class IfThen extends Statement {
    private BoolExpr  mBoolExpr;
    private Statement mStatement;

    public IfThen(BoolExpr boolExpr, Statement statement) {
        mBoolExpr = boolExpr;
        mStatement = statement;
    }
    public List<AssemblerCmd> compile(Map<String, Location> symbolTable) {
        //       mBoolExpr.compile()
        //       ifeq elseLabel, mBoolExpr.getReg(), R0
        //       mStatement.compile()
        // label elseLabel
        LABEL elseLabel = new LABEL();
        List<AssemblerCmd> result = mBoolExpr.compile(0, symbolTable);
        result.add(new IFEQ(elseLabel.getLabel(), mBoolExpr.getReg(), 0));
        result.addAll(mStatement.compile(symbolTable));
        result.add(elseLabel);
        return result;
    }
    protected int maxErshov() {
        int result = 1;
        result = Math.max(result, mBoolExpr .getErshov());
        result = Math.max(result, mStatement.maxErshov());
        return result;
    }
    public Boolean equals(Statement rhs) {
        if (!(rhs instanceof IfThen)) {
            return false;
        }
        IfThen r = (IfThen) rhs;
        if(!mBoolExpr.equals(r.mBoolExpr)) {
            return false;
        }
        if(!mStatement.equals(r.mStatement)) {
            return false;
        }
        return true;
    }
    public BoolExpr getBoolExpr() {
        return mBoolExpr;
    }
    public Statement getStatement() {
        return mStatement;
    }
    public String toString() {
        return "IfThen(" + mBoolExpr + ", " + mStatement + ")";
    }
}
