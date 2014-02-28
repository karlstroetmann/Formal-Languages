import Assembler.*;
import java.util.*;

public class Assign extends Statement {
    private String mVar;
    private Expr   mExpr;

    public Assign(String var, Expr expr) {
        mVar  = var;
        mExpr = expr;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result   = mExpr.compile(symbolTable);
        AssemblerCmd       storeCmd = new ISTORE(symbolTable.get(mVar));
        result.add(storeCmd);
        return result;
    }
    public Integer stackSize() {
        return mExpr.stackSize();
    }    
    public String toString() {
        return "Assign(" + mVar + ", " + mExpr + ")";
    }
}
