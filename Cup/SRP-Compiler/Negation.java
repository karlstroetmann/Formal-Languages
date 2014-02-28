import assembler.*;
import java.util.*;

public class Negation extends BoolExpr {
    private BoolExpr mExpr;

    public Negation(BoolExpr expr) {
        mExpr = expr;
        mErshov = mExpr.getErshov();
    }
    public List<AssemblerCmd> compile(Integer base, Map<String, Location> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        mRegister = base + mErshov;
        // const R2, 1
        // sub   mRegister, R2, mRegister
        result.add(new CONST(2, 1));
        result.add(new SUB(mRegister, 2, mRegister));
        return result;
    }
    public BoolExpr getExpr() {
        return mExpr;
    }
    public String toString() {
        return "Negation(" + mExpr.toString() + ")";
    }
}
