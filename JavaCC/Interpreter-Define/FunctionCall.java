import java.util.*;
import java.lang.reflect.*;

public class FunctionCall extends Expr {
    String     mName;       // name of the function
    List<Expr> mArgs;       // list of arguments
    Method     mMethod;     // corresponding method from java.lang.Math
    Definition mDefinition; // definition of this function
    
    public FunctionCall(String name, List<Expr> args) {
        mName = name;
        mArgs = args;
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

    public Double eval(Environment e) throws ReturnException {
        Double[] args = new Double[mArgs.size()];
        for (int i = 0; i < mArgs.size(); ++i) {
            args[i] = mArgs.get(i).eval(e);
        }
        if (mMethod != null) {
            try {
                return (Double) mMethod.invoke(Double.class, (java.lang.Object[]) args);
            } catch(Exception x) {
                System.err.println("Illegal access to Method " + mName);
                x.printStackTrace();
                System.exit(1);
                return 0.0;  // satisfy stupid compiler
            }
        }
        mDefinition = Statement.sFunctionTable.get(mName);
        if (mDefinition == null) {
            System.err.println("Undefined function: " + mName);
        }
        HashMap<String, Double> map        = new HashMap<String, Double>();
        List<String>            parameters = mDefinition.mParameters;
        for (int i = 0; i < mArgs.size(); ++i) {
            map.put(parameters.get(i), args[i]);
        }
        Environment newEnv = e.add(map);
        try {
            for (Statement stmnt: mDefinition.mBody) {
                stmnt.execute(newEnv);
            }
        } catch (ReturnException re) {
            return re.mResult;
        }
        System.out.println("Function: " + mName + " did not return a result!");
        return 0.0;
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
