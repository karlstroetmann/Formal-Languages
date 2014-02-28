import Assembler.*;
import java.util.*;

public class Quotient extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Quotient(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
		result.addAll(mLhs.compile());
		result.addAll(mRhs.compile());
		result.add(new IDIV());
		return result;
	}
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Quotient(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
