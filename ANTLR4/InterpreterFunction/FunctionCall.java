import java.util.*;
import java.lang.reflect.*;

public class FunctionCall extends Expr {
    String     mName;       // name of the function
    List<Expr> mArgs;       // list of arguments
    Method     mMethod;     // corresponding method from java.lang.Math
    Definition mDefinition; // definition of this function
    
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
            } catch (NoSuchMethodException e) {}  // lets hope it's a user defined function
        } catch (ClassNotFoundException e) {      // Impossible, since java.lang.Math exists!
            e.printStackTrace();  
        }
    }
    public Value eval(Environment e) {
        Value[] args = new Value[mArgs.size()];
        // evaluate arguments
        for (int i = 0; i < mArgs.size(); ++i) {
            args[i] = mArgs.get(i).eval(e);
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
    private DoubleValue evalPredefined(Value[] args) {
        try {
            Object[] doubleArgs = new Object[mArgs.size()];
            for (int i = 0; i < mArgs.size(); ++i) {
                doubleArgs[i] = args[i].toDouble();
            }
            return new DoubleValue((Double) mMethod.invoke(null, doubleArgs));
        } catch(Exception x) {
            System.err.println("Illegal access to Method " + mName);
            x.printStackTrace();
            System.exit(1);
            return null;  // satisfy stupid compiler
        }
    }
    // evaluate a user defined method 
    private Value evalUserDefined(Value[] args) {
        // create new environment used for the function call
        Environment newEnv = new Environment();
        List<String> parameters = mDefinition.mParameters;
        for (int i = 0; i < mArgs.size(); ++i) {
            newEnv.putValue(parameters.get(i), args[i]);
        }
        try {
            for (Statement stmnt: mDefinition.mBody) {
                stmnt.execute(newEnv);
            }
        } catch (ReturnException re) {
            return re.mResult;
        }
        return null;
    }
}
