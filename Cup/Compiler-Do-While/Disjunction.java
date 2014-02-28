import java.util.*;

public class Disjunction extends BoolExpr {
    private BoolExpr mLhs;
    private BoolExpr mRhs;

    public Disjunction(BoolExpr lhs, BoolExpr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = mLhs.compile();
		result.addAll(mRhs.compile());
		AssemblerCmd ior = new IOR();
		result.add(ior);
		return result;
	}
    public BoolExpr getLhs() {
        return mLhs;
    }
    public BoolExpr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Disjunction(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
