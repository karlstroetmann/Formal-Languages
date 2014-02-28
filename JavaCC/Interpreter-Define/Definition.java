import java.util.*;

public class Definition extends Statement {
    String          mName;       // function name
    List<String>    mParameters; // parameter list
    List<Statement> mBody;       // statements in the body of the definition
    
    public Definition(String name, List<String> parameters, List<Statement> body) {
        mName       = name;
        mParameters = parameters;
        mBody       = body;
    }

    public void execute(Environment e) throws ReturnException {
        sFunctionTable.put(mName, this);
    }

    public String toString() {
        String result = "function ";
        result += mName + "(";
        for (int i = 0; i < mParameters.size(); ++i) {
            if (i > 0) {
                result += ", ";
            }
            result += mParameters.get(i);
        }
        result += ") {\n";
        for (Statement stmnt: mBody) {
            result += stmnt + "\n";
        }
        result += "}";
        return result;
    }
}