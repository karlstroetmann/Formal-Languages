public abstract class Expr extends PrintExpr {
    public abstract Value eval(Environment e);

    public void print(Environment e) {
        System.out.print(eval(e));
    }
}


