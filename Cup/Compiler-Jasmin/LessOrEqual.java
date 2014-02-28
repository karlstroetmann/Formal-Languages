import Assembler.*;
import java.util.*;

public class LessOrEqual extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public LessOrEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = mLhs.compile(symbolTable);
        result.addAll(mRhs.compile(symbolTable));
        LABEL        trueLabel = new LABEL();
        LABEL        nextLabel = new LABEL();
        AssemblerCmd if_icmple = new IF_ICMPLE(trueLabel.getLabel());
        AssemblerCmd bipush0   = new BIPUSH(0);
        AssemblerCmd gotoNext  = new GOTO(nextLabel.getLabel());
        AssemblerCmd bipush1   = new BIPUSH(1);
        result.add(if_icmple);
        result.add(bipush0);
        result.add(gotoNext);
        result.add(trueLabel);
        result.add(bipush1);
        result.add(nextLabel);
        return result;
    }
    public Integer stackSize() {
        return Math.max(mLhs.stackSize(), mRhs.stackSize() + 1);
    }
    public String toString() {
        return "LessOrEqual(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
