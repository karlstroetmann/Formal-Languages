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
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        if (mName.equals("getchar")) {
            AssemblerCmd in = new IN();
            result.add(in);
        } else if (mName.equals("putchar")) {
            for (Expr arg: mArgs) {
                result.addAll(arg.compile());
            }
            AssemblerCmd out    = new OUT();
            AssemblerCmd bipush = new BIPUSH(1);
            result.add(out);
            result.add(bipush);
        } else {
            AssemblerCmd ldcObjref = new LDC_W("OBJREF");
            result.add(ldcObjref);
            for (Expr arg: mArgs) {
                result.addAll(arg.compile());
            }
            AssemblerCmd invoke = new INVOKE(mName);
            result.add(invoke);
        }
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
