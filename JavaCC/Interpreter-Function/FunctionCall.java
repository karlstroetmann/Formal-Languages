import java.util.*;
import java.lang.reflect.*;

public class FunctionCall extends Expr {
    String     mName;   // name of the function
    List<Expr> mArgs;   // list of arguments
    Method     mMethod; // corresponding method from java.lang.Math
    
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
            } catch (NoSuchMethodException e) {
                System.err.println("Method " + mName + "() does not exist!");
                System.exit(1);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Double eval() {
        Double[] args = new Double[mArgs.size()];
        for (int i = 0; i < mArgs.size(); ++i) {
            args[i] = mArgs.get(i).eval();
        }
        try {
            // Method must be static, therefore first arg is null.
            return (Double) mMethod.invoke(Double.class, (java.lang.Object[]) args);
        } catch(Exception e) {
            System.err.println("Illegal access to Method " + mName);
            e.printStackTrace();
            System.exit(1);
            return 0.0;  // satisfy stupid compiler
        }
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
