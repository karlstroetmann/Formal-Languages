import Assembler.*;
import java.util.*;

public class ExprStatement extends Statement {
    private Expr mExpr;

    public ExprStatement(Expr expr) {
        mExpr = expr;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = mExpr.compile(symbolTable);
        AssemblerCmd       popCmd = new POP();
        result.add(popCmd);
        return result;
    }    
    public Integer stackSize() {
        return mExpr.stackSize();
    }
    public String toString() {
        return "ExprStatement(" + mExpr + ")";
    }
}
