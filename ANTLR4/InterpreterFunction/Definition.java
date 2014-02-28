import java.util.*;

// This class represents a function definition
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
        Environment.putFunction(mName, this);
    }
}