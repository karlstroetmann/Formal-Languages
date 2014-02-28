import java.util.*;

/**
 * This class represents the difference mLhs - mRhs;
 */
public class Difference extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Difference(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
		result.addAll(mLhs.compile());
		result.addAll(mRhs.compile());
		result.add(new ISUB());
		return result;
	}
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Difference(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
