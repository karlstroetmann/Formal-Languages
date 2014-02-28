import Assembler.*;
import java.util.*;

public class Inequation extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public Inequation(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = mLhs.compile(symbolTable);
        result.addAll(mRhs.compile(symbolTable));
        LABEL        trueLabel  = new LABEL();
        LABEL        nextLabel  = new LABEL();
        AssemblerCmd if_icmpne  = new IF_ICMPNE(trueLabel.getLabel());
        AssemblerCmd bipush1    = new BIPUSH(1);
        AssemblerCmd gotoNext   = new GOTO(nextLabel.getLabel());
        AssemblerCmd bipush0    = new BIPUSH(0);
        result.add(if_icmpne);
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
        return "Inequation(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
