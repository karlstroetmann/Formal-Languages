import assembler.*;
import java.util.*;

public class Variable extends Expr {
    private String mName;

    public Variable(String name) {
        mName   = name;
        mErshov = 1;
    }
    public List<AssemblerCmd> compile(Integer base, Map<String, Location> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        Location l = symbolTable.get(mName);
        if (l instanceof Memory) {
            Integer offset = ((Memory) l).getOffset();
            mRegister = base + 1;
            // load  mRegister, SP + offset
            result.add(new LOADC(mRegister, offset)); 
        } else {
            mRegister = ((Register) l).getNumber();
        }
        return result;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "Variable(" + mName.toString() + ")";
    }
}
