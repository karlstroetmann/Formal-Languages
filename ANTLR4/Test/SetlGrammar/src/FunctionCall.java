import java.util.*;
import java.lang.reflect.*;
import java.math.BigInteger;

public class FunctionCall extends Expr {
    String     mName;       // name of the function
    List<Expr> mArgs;       // list of arguments
    Method     mMethod;     // corresponding method from java.lang.Math
    Definition mDefinition; // definition of this function
    
    @SuppressWarnings("unchecked")
	public FunctionCall(String name, List<Expr> args) {
        mName   = name;
        mArgs   = args;
        mMethod = null;
        try {
            Class   mathClass   = Class.forName("java.lang.Math");
            Class[] argsClasses = new Class[mArgs.size()];
            for (int i = 0; i < mArgs.size(); ++i) {
                argsClasses[i] = double.class;
            }
            try {
                mMethod = mathClass.getDeclaredMethod(mName, argsClasses);
            } catch (NoSuchMethodException e) {}  // it's a user defined function
        } catch (ClassNotFoundException e) {      // Impossible, since java.lang.Math exists!
            e.printStackTrace();  
        }
    }

    public Value eval() {
        Value[] args = new Value[mArgs.size()];
        // evaluate arguments
        for (int i = 0; i < mArgs.size(); ++i) {
            args[i] = mArgs.get(i).eval();
        }
        // function called is a method from java.lang.Math
        if (mMethod != null) {
            return evalPredefined(args);
        }
        // function called must be user defined, look it up 
        mDefinition = Environment.getFunction(mName);
        if (mDefinition == null) {
            System.err.println("Undefined function: " + mName);
            System.exit(1);
        }
        return evalUserDefined(args);
    }

    // evaluate a method defined in java.lang.Math
    private Value evalPredefined(Value[] args) {
        try {
            return (MyNumber) mMethod.invoke(Double.class, (java.lang.Object[]) args);
        } catch(Exception x) {
            System.err.println("Illegal access to Method " + mName);
            x.printStackTrace();
            System.exit(1);
            return new MyNumber(BigInteger.valueOf(0));  // satisfy stupid compiler
        }
    }

    // evaluate a user defined method 
    private Value evalUserDefined(Value[] args) {
        // save old environment
        Environment oldEnv = Environment.getEnv();
        // create new environment used for the function call
        Environment newEnv = new Environment();
        Environment.setEnv(newEnv);
        List<String> parameters = mDefinition.mParams;
        for (int i = 0; i < mArgs.size(); ++i) {
            Environment.putValue(parameters.get(i), args[i]);
        }
        try {
            for (Statement stmnt: mDefinition.mBody) {
                stmnt.execute();
            }
        } catch (ReturnException re) {
            // restore old environment
            Environment.setEnv(oldEnv);
            return re.mResult;
        }
        Environment.setEnv(oldEnv);
        return new MyNumber(BigInteger.valueOf(0));
    }
    public String toString() {
        String result = mName + "(";
        for (int i = 0; i < mArgs.size(); ++i) {
            if (i > 0) {
                result += ", ";
            }
            result += mArgs.get(i);
        }
        result += ")";
        return result;
    }
}
