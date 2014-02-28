public class Odersky {
    public static void main(String[] args) {
        System.out.println("Compile this!");
    }
}

class F<T> {}

class C<X extends F<F<? super X>>> {
    C(X x) {
        F<? super X> f = x;
    }
}
