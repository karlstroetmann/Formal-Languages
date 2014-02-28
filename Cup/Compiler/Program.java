import Assembler.*;
import java.util.*;

public class Program {
    private List<Function> mFunctionList;

    public Program(List<Function> functionList) {
        mFunctionList = functionList;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> fctList = new LinkedList<AssemblerCmd>();
		int indexMain = mFunctionList.size() - 1;
		Function main = mFunctionList.get(indexMain);
		fctList.addAll(main.compile());
		for (int i = 0; i < indexMain; ++i) {
			Function f = mFunctionList.get(i);
			fctList.addAll(f.compile());
		}
		AssemblerCmd constant    = new CONSTANT();
		AssemblerCmd endConstant = new END_CONSTANT();
		List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
		result.add(constant);
		result.add(new CONSTANT_DEF("OBJREF", 64));
		for (Integer c: MyNumber.sConstants) {
			result.add(new CONSTANT_DEF("c" + c, c));
		}
		result.add(endConstant);
		result.addAll(fctList);
		return result;
	}
    public List<Function> getFunctionList() {
        return mFunctionList;
    }
    public String toString() {
        return "Program(" + mFunctionList + ")";
    }
}
