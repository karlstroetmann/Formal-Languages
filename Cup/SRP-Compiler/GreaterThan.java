import assembler.*;
import java.util.*;

public class GreaterThan extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public GreaterThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
        if (mLhs.getErshov() < mRhs.getErshov()) {
            mErshov = mRhs.getErshov();
        } else if (mLhs.getErshov() > mRhs.getErshov()) {
            mErshov = mLhs.getErshov();
        } else {
            mErshov = mLhs.getErshov() + 1;
        }
    }
    public List<AssemblerCmd> compile(Integer base, Map<String, Location> symbolTable) {
        // to be implemented
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
