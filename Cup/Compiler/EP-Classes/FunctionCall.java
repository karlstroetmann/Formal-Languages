public class FunctionCall extends Expr {
    private String mName;
    private List<Expr> mArgs;

    public FunctionCall(String name, List<Expr> args) {
        mName = name;
        mArgs = args;
    }
    public Boolean equals(Expr rhs) {
        if (!(rhs instanceof FunctionCall)) {
            return false;
        }
        FunctionCall r = (FunctionCall) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        if(!mArgs.equals(r.mArgs)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<Expr> getArgs() {
        return mArgs;
    }
    public String toString() {
        return "FunctionCall(" + mName.toString() + ", " + mArgs.toString() + ")";
    }
}
