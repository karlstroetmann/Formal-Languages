import assembler.*;
import java.util.*;

public class ReturnStmnt extends Statement {
    private Expr   mExpr;
    private String mName;

    public ReturnStmnt(Expr expr, String name) {
        mExpr = expr;
        mName = name;
    }
    public List<AssemblerCmd> compile(Map<String, Location> symbolTable) {
        int numVarsOnStack = ((Memory) symbolTable.get("$numberVarsOnStack@" + mName)).getOffset();
        int numUsedRegs    = ((Memory) symbolTable.get("$numberUsedRegs@"    + mName)).getOffset();
        List<AssemblerCmd> result = mExpr.compile(0, symbolTable);
        result.add(new STOREC(mExpr.getReg(), 1));
        result.addAll(restoreRegisters(numVarsOnStack, numUsedRegs));
        result.add(new RETURN());
        return result;
    }
    private List<AssemblerCmd> restoreRegisters(int numVarsOnStack, int numUsedRegs) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        for (int i = 1; i <= numUsedRegs; ++i) {
            result.add(new LOADC(i, numVarsOnStack + i));
        }
        return result;
    }
    protected int maxErshov() {
        return mExpr.getErshov();
    }
    public Expr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "ReturnStmnt(" + mExpr.toString() + ")";
    }
}
