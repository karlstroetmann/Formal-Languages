import java.util.*;

public class Sum extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Sum(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
		result.addAll(mLhs.compile());
		result.addAll(mRhs.compile());
		result.add(new IADD());
		return result;
	}
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Sum(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
