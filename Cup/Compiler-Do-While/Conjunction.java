import java.util.*;

public class Conjunction extends BoolExpr {
    private BoolExpr mLhs;
    private BoolExpr mRhs;

    public Conjunction(BoolExpr lhs, BoolExpr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = mLhs.compile();
		result.addAll(mRhs.compile());
		AssemblerCmd iand = new IAND();
		result.add(iand);
		return result;
	}
    public BoolExpr getLhs() {
        return mLhs;
    }
    public BoolExpr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Conjunction(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
