import Assembler.*;
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
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        if (mName.equals("println")) { 
            AssemblerCmd getStatic = 
                new GETSTATIC("java/lang/System/out Ljava/io/PrintStream;");
            result.add(getStatic);
            for (Expr arg: mArgs) {
                result.addAll(arg.compile(symbolTable));
            }
            AssemblerCmd println = new PRINTLN();
            AssemblerCmd bipush  = new BIPUSH(42);
            result.add(println);
            result.add(bipush);
            return result;
        }
        for (Expr arg: mArgs) {
            result.addAll(arg.compile(symbolTable));
        }
        String descr = Compiler.sClassName + "/" + mName + "(";
        for (int i = 0; i < mArgs.size(); ++i) {
            descr += "I";
        }
        descr += ")I";
        AssemblerCmd invoke = new INVOKE(descr);
        result.add(invoke);
        return result;
    }
    public Integer stackSize() {
        Integer biggest = 0;
        for (int i = 0; i < mArgs.size(); ++i) {
            biggest = Math.max(biggest, i + mArgs.get(i).stackSize());
        }
        if (mName.equals("println")) {
            ++biggest;
        }
        return Math.max(biggest, 1);
    }
    public String toString() {
        return "FunctionCall(" + mName + ", " + mArgs.toString() + ")";
    }
}
