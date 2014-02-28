public class Variable extends Expr {
    private String mName;

    public Variable(String name) {
        mName = name;
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
