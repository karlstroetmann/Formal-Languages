public class Main {
    public static void main(String[] args) {
		Expr x      = new Variable("x");
		Expr square = new Product(x, x);
		System.out.println(square.diff("x"));
    }
}