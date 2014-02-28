import Assembler.*;
import java.util.*;

public class IfThen extends Statement {
    private BoolExpr  mBoolExpr;
    private Statement mStatement;

    public IfThen(BoolExpr boolExpr, Statement statement) {
        mBoolExpr = boolExpr;
        mStatement = statement;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = mBoolExpr.compile();
        LABEL        elseLabel = new LABEL();
        AssemblerCmd ifeq      = new IFEQ(elseLabel.getLabel());
        result.add(ifeq);
        result.addAll(mStatement.compile());
        result.add(elseLabel);
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
