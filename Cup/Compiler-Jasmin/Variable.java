import Assembler.*;
import java.util.*;

public class Variable extends Expr {
    private String mName;

    public Variable(String name) {
        mName = name;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        AssemblerCmd iload = new ILOAD(symbolTable.get(mName));
        result.add(iload);
        return result;
    }
    public Integer stackSize() {
        return 1;
    }
    public String toString() {
        return "Variable(" + mName.toString() + ")";
    }
}
