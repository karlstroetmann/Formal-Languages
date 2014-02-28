import java.lang.reflect.*;

public class GetThem {

    public static void main(String args[]) {
        try {
            Class mathClass = Class.forName("java.lang.Math");
            Method[] methods = mathClass.getDeclaredMethods();
            for (Method method: methods) {
                System.out.println(method);
            }
            try {
                Method sin = mathClass.getDeclaredMethod("sin", double.class);
                System.out.println(sin);
            } catch (NoSuchMethodException e) {
                System.err.println("Method sin() does not exist!");
                System.exit(1);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}