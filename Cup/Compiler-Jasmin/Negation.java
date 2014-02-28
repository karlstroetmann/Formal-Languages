import Assembler.*;
import java.util.*;

public class Negation extends BoolExpr {
    private BoolExpr mExpr;

    public Negation(BoolExpr expr) {
        mExpr = expr;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        AssemblerCmd bipush1 = new BIPUSH(1);
        AssemblerCmd isub    = new ISUB();
        result.add(bipush1);
        result.addAll(mExpr.compile(symbolTable));
        result.add(isub);
        return result;
    }
    public Integer stackSize() {
        return mExpr.stackSize() + 1;
    }    
    public String toString() {
        return "Negation(" + mExpr.toString() + ")";
    }
}
