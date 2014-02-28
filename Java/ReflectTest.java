import java.util.*;
import java.lang.reflect.*;

public class ReflectTest {
   
    public static void main(String args[]) {
        try {
            Class   mathClass   = Class.forName("java.lang.Math");
            Class[] argsClasses = new Class[1];
            argsClasses[0] = double.class;
            Method method = mathClass.getDeclaredMethod(args[0], argsClasses);
            Double[] methodArgs = new Double[1];
            methodArgs[0] = new Double(args[1]);
            Double result = (Double) method.invoke(Double.class, (java.lang.Object[]) methodArgs);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
