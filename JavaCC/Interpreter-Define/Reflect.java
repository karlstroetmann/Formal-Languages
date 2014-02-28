import java.lang.reflect.*;

public class Reflect {
    public static void main(String[] args) {
        try {
            String   function  = args[0];
            Double   arg       = new Double(args[1]);
            Class    mathClass = Class.forName("java.lang.Math");
            Class[]  types     = { double.class };
            Method   method    = mathClass.getDeclaredMethod(function, types);
            Double[] arguments = { arg };
            Double   result    = (Double) method.invoke(double.class, arguments);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}