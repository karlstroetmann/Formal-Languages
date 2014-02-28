public class Number extends Expr {
    private Double mValue;

    public Number(Double value) {
        mValue = value;
    }
    public Expr diff(String x) {
        return new Number(0.0);
    }
    public Boolean equals(Expr rhs) {
        if (!(rhs instanceof Number)) {
            return false;
        }
        Number r = (Number) rhs;
        if(!mValue.equals(r.mValue)) {
            return false;
        }
        return true;
    }
    public Double getValue() {
        return mValue;
    }
    public String toString() {
        return "Number(" + mValue.toString() + ")";
    }
}
