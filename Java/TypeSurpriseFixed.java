import java.util.*;


public class TypeSurpriseFixed {

    public static void main(String[] args) {
		List<String> x = new ArrayList<String>();
		x.add("a");
		x.add("b");
		x.add("c");
		List<Object> y = x;
		y.put(1, new Integer(2));
    }
}