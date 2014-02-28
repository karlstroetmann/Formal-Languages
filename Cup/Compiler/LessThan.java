import Assembler.*;
import java.util.*;

public class LessThan extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public LessThan(Expr lhs, Expr rhs) {
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
        return "LessThan(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
