import assembler.*;
import java.util.*;
/**
 * This class represents the invocation of a function.
 */

public class FunctionCall extends Expr {
    private String     mName;
    private List<Expr> mArgs;

    public FunctionCall(String name, List<Expr> args) {
        mName = name;
        mArgs = args;
        mErshov = 1;
        for (Expr arg: mArgs) {
            mErshov = Math.max(arg.getErshov(), mErshov);
        }
    }
    public List<AssemblerCmd> 
         compile(Integer base, Map<String, Location> symbolTable) 
    {
        // compute next available position on stack
        Location l = symbolTable.get("$free@" + mName);
        Memory m = (Memory) l;
        Integer k = m.getOffset();
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        // place arguments on stack starting at SP + k
        for (Expr arg: mArgs) {
            result.addAll(arg.compile(base, symbolTable));
            result.add(new STOREC(arg.getReg(), k)); // store Rx, SP + k
            ++k;
        }
        mRegister = 1;
        result.add(new CONST(31, k + mArgs.size() - 1));
        result.add(new ADD(30, 30, 31));   // SP = SP + k + n - 1
        result.add(new CALL(mName));
        result.add(new LOADC(mRegister, 1));
        result.add(new CONST(31, - k - mArgs.size()));
        result.add(new ADD(30, 30, 31));   // SP = SP -(k + n)
        return result;
    }
    public String getName() {
        return mName;
    }
    public List<Expr> getArgs() {
        return mArgs;
    }
    public String toString() {
        return "FunctionCall(" + mName + ", " + mArgs.toString() + ")";
    }
}
