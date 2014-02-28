import Assembler.*;
import java.util.*;

public class ExprStatement extends Statement {
    private Expr mExpr;

    public ExprStatement(Expr expr) {
        mExpr = expr;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = mExpr.compile();
        AssemblerCmd       popCmd = new POP();
        result.add(popCmd);
        return result;
    }    
    public Expr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "ExprStatement(" + mExpr + ")";
    }
}
