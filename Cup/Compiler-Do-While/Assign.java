import java.util.*;

public class Assign extends Statement {
    private String mVar;
    private Expr   mExpr;

    public Assign(String var, Expr expr) {
        mVar  = var;
        mExpr = expr;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result   = mExpr.compile();
		AssemblerCmd       storeCmd = new ISTORE(mVar);
		result.add(storeCmd);
		return result;
	}
    public String getVar() {
        return mVar;
    }
    public Expr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "Assign(" + mVar + ", " + mExpr + ")";
    }
}
