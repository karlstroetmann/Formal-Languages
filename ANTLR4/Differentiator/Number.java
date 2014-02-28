public class Number extends Expr {
    private Integer mValue;

    public Number(Integer value) {
        mValue = value;
    }
    public Number(String value) {
        mValue = new Integer(value);
    }
    public Expr diff(String x) {
        return new Number(0);
    }
    public String toString() {
        return mValue.toString();
    }
}
