import Assembler.*;
import java.util.*;

public class Return extends Statement {
    private Expr mExpr;

    public Return(Expr expr) {
        mExpr = expr;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result    = mExpr.compile();
		AssemblerCmd       returnCmd = new IRETURN();
		result.add(returnCmd);
		return result;
	}
    public Expr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "Return(" + mExpr.toString() + ")";
    }
}
