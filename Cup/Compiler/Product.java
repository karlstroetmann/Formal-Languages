import Assembler.*;
import java.util.*;

public class Product extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Product(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
		result.addAll(mLhs.compile());
		result.addAll(mRhs.compile());
		result.add(new IMUL());
		return result;
	}
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Product(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
