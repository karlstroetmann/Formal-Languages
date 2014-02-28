import Assembler.*;
import java.util.*;

public class Conjunction extends BoolExpr {
    private BoolExpr mLhs;
    private BoolExpr mRhs;

    public Conjunction(BoolExpr lhs, BoolExpr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = mLhs.compile(symbolTable);
        result.addAll(mRhs.compile(symbolTable));
        AssemblerCmd iand = new IAND();
        result.add(iand);
        return result;
    }
    public Integer stackSize() {
        return Math.max(mLhs.stackSize(), mRhs.stackSize() + 1);
    }
    public String toString() {
        return "Conjunction(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
