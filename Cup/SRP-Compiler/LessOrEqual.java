import assembler.*;
import java.util.*;

public class LessOrEqual extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public LessOrEqual(Expr lhs, Expr rhs) {
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
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "LessOrEqual(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
