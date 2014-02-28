public class Number extends Expr {
    private int mValue;

    public Number(int value) {
        mValue = value;
    }
    public Expr diff(String x) {
        return new Number(0);
    }
    public String toString() {
        return mValue + "";
    }
}
