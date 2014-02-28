import Assembler.*;
import java.util.*;

public class Function {
    private String            mName;
    private List<String>      mParameterList;
    private List<Declaration> mDeclarations;
    private List<Statement>   mBody;
    
    private Integer           mLocals; // number of local variables

    public Function(String            name, 
                    List<String>      parameterList, 
                    List<Declaration> declarations, 
                    List<Statement>   body) 
    {
        mName          = name;
        mParameterList = parameterList;
        mDeclarations  = declarations;
        mBody          = body;
        mLocals        = mParameterList.size() + mDeclarations.size();
    }
    public List<AssemblerCmd> compile() {
        Map<String, Integer> symbolTable = new TreeMap();
        Integer count = 0;
        for (String var: mParameterList) {
            symbolTable.put(var, count);
            ++count;
        }
        for (Declaration decl: mDeclarations) {
            symbolTable.put(decl.getVar(), count);
            ++count;
        }
        Integer stackSize = 0;
        for (Statement stmnt: mBody) {
            stackSize = Math.max(stackSize, stmnt.stackSize());
        }
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        AssemblerCmd nl = new NEWLINE();
        result.add(nl);
        if (mName.equals("main")) {
            AssemblerCmd main        = new MAIN();
            AssemblerCmd limitLocals = new LIMIT("locals", mLocals);
            AssemblerCmd limitStack  = new LIMIT("stack", stackSize);
            result.add(main);
            result.add(limitLocals);
            result.add(limitStack);
            for (Statement stmnt: mBody) {
                result.addAll(stmnt.compile(symbolTable));
            }
            AssemblerCmd myReturn = new RETURN();
            AssemblerCmd endMain  = new END_METHOD();
            result.add(myReturn);
            result.add(endMain);
        } else {
            AssemblerCmd method = new METHOD(mName, mParameterList.size());
            AssemblerCmd limitLocals = new LIMIT("locals", mLocals);
            AssemblerCmd limitStack  = new LIMIT("stack", stackSize);
            result.add(method);
            result.add(limitLocals);
            result.add(limitStack);
            for (Statement stmnt: mBody) {
                result.addAll(stmnt.compile(symbolTable));
            }
            AssemblerCmd endMethod = new END_METHOD();
            result.add(endMethod);
        }
        return result;
    }
    // size of stack needed
    public Integer stackSize() {
        Integer biggest = 0;
        for (Statement stmnt: mBody) {
            biggest = Math.max(biggest, stmnt.stackSize());
        }
        return biggest;
    }    
    public String toString() {
        return "Function(" + mName + ", " + mParameterList + ", " + mBody + ")";
    }
}
