import Assembler.*;
import java.util.*;

public class Return extends Statement {
    private Expr mExpr;

    public Return(Expr expr) {
        mExpr = expr;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result    = mExpr.compile(symbolTable);
        AssemblerCmd       returnCmd = new IRETURN();
        result.add(returnCmd);
        return result;
    }
    public Integer stackSize() {
        return mExpr.stackSize();
    }
    public String toString() {
        return "Return(" + mExpr.toString() + ")";
    }
}
