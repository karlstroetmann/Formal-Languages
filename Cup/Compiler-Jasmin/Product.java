import Assembler.*;
import java.util.*;

public class Product extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Product(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        result.addAll(mLhs.compile(symbolTable));
        result.addAll(mRhs.compile(symbolTable));
        result.add(new IMUL());
        return result;
    }
    public Integer stackSize() {
        return Math.max(mLhs.stackSize(), mRhs.stackSize() + 1);
    }
    public String toString() {
        return "Product(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
