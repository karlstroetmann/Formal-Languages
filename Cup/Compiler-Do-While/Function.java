import java.util.*;

public class Function {
    private String            mName;
    private List<String>      mParameterList;
    private List<Declaration> mDeclarations;
    private List<Statement>   mBody;

    public Function(String            name, 
                    List<String>      parameterList, 
                    List<Declaration> declarations, 
                    List<Statement>   body) 
    {
        mName          = name;
        mParameterList = parameterList;
        mDeclarations  = declarations;
        mBody          = body;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        AssemblerCmd nl = new NEWLINE();
        result.add(nl);
        if (mName.equals("main")) {
            AssemblerCmd main = new MAIN();
            AssemblerCmd var  = new VAR();
            result.add(main);
            result.add(var);
            for (Declaration decl: mDeclarations) {
                AssemblerCmd varDef = new VAR_DEF(decl.getVar());
                result.add(varDef);
            }
            AssemblerCmd endVar  = new END_VAR();
            result.add(endVar);
            for (Statement stmnt: mBody) {
                result.addAll(stmnt.compile());
            }
            AssemblerCmd halt    = new HALT();
            AssemblerCmd endMain = new END_MAIN();
            result.add(halt);
            result.add(endMain);
        } else {
            AssemblerCmd method = new METHOD(mName, mParameterList);
            AssemblerCmd var    = new VAR();
            result.add(method);
            result.add(var);
            for (Declaration decl: mDeclarations) {
                AssemblerCmd varDef = new VAR_DEF(decl.getVar());
                result.add(varDef);
            }
            AssemblerCmd endVar  = new END_VAR();
            result.add(endVar);
            for (Statement stmnt: mBody) {
                result.addAll(stmnt.compile());
            }
            AssemblerCmd endMethod = new END_METHOD();
            result.add(endMethod);
        }
        return result;
    }
    public String getName() {
        return mName;
    }
    public List<String> getParameterList() {
        return mParameterList;
    }
    public List<Statement> getBody() {
        return mBody;
    }
    public String toString() {
        return "Function(" + mName + ", " + mParameterList + ", " + mBody + ")";
    }
}
