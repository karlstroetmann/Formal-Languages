import java.util.*;

public class Negation extends BoolExpr {
    private BoolExpr mExpr;

    public Negation(BoolExpr expr) {
        mExpr = expr;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
		AssemblerCmd bipush1 = new BIPUSH(1);
		AssemblerCmd isub    = new ISUB();
		result.add(bipush1);
		result.addAll(mExpr.compile());
		result.add(isub);
		return result;
	}
    public BoolExpr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "Negation(" + mExpr.toString() + ")";
    }
}
