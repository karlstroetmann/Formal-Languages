import java.util.*;

public class GreaterOrEqual extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public GreaterOrEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public List<AssemblerCmd> compile() {
        return null;
    }
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "GreaterOrEqual(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
