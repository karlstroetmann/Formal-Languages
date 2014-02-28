import assembler.*;
import java.util.*;

public class Assign extends Statement {
    private String mVar;
    private Expr   mExpr;

    public Assign(String var, Expr expr) {
        mVar  = var;
        mExpr = expr;
    }
    public List<AssemblerCmd> 
	compile(Map<String, Location> symbolTable) {
	List<AssemblerCmd> result = mExpr.compile(0, symbolTable);
	Location l = symbolTable.get(mVar);
	if (l instanceof Memory) {
	    Integer offset = ((Memory) l).getOffset();
	    // istore mExpr.getReg(), SP + symbolTable.getOffset(mVar)
	    result.add(new STOREC(mExpr.getReg(), offset));
	} else {
	    Integer register = ((Register) l).getNumber();
	    // add register, mExpr.getReg(), R0
	    result.add(new ADD(register, mExpr.getReg(), 0));
	}
        return result;
    }
    protected int maxErshov() {
        return mExpr.getErshov();
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
