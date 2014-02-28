import assembler.*;
import java.util.*;

public class Program {
    private List<Function> mFunctionList;

    public Program(List<Function> functionList) {
        mFunctionList = functionList;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();        
        for (Function fct: mFunctionList) {
            result.addAll(fct.compile());
        }
        return result;
    }
    public List<Function> getFunctionList() {
        return mFunctionList;
    }
    public String toString() {
        return "Program(" + mFunctionList + ")";
    }
}
