import Assembler.*;
import java.util.*;

public class GreaterThan extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public GreaterThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public List<AssemblerCmd> compile() {
        return null;
    }

    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof GreaterThan)) {
            return false;
        }
        GreaterThan r = (GreaterThan) rhs;
        if(!mLhs.equals(r.mLhs)) {
            return false;
        }
        if(!mRhs.equals(r.mRhs)) {
            return false;
        }
        return true;
    }
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "GreaterThan(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
