public class TypeSurprise {

    public static void main(String[] args) {
        String[] x = { "a", "b", "c" };
        Object[] y = x;
        y[1] = new Integer(2);
        System.out.println(x[1]);
    }
}