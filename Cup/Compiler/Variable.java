import Assembler.*;
import java.util.*;

public class Variable extends Expr {
    private String mName;

    public Variable(String name) {
        mName = name;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        AssemblerCmd iload = new ILOAD(mName);
        result.add(iload);
        return result;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "Variable(" + mName.toString() + ")";
    }
}
