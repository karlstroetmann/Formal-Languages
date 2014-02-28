public class Variable extends Expr {
    private String mName;

    public Variable(String name) {
        mName = name;
    }
    public Expr diff(String x) {
        if (mName.equals(x)) {
            return new Number(1);
        }
        return new Number(0);
    }
    public Boolean equals(Expr rhs) {
        if (!(rhs instanceof Variable)) {
            return false;
        }
        Variable r = (Variable) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "Variable(" + mName.toString() + ")";
    }
}
