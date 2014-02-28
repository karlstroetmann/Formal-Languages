public class IfThenElse extends Statement {
    private BoolExpr mCondition;
    private Statement mThen;
    private Statement mElse;

    public IfThenElse(BoolExpr condition, Statement then, Statement else) {
        mCondition = condition;
        mThen = then;
        mElse = else;
    }
    public Boolean equals(Statement rhs) {
        if (!(rhs instanceof IfThenElse)) {
            return false;
        }
        IfThenElse r = (IfThenElse) rhs;
        if(!mCondition.equals(r.mCondition)) {
            return false;
        }
        if(!mThen.equals(r.mThen)) {
            return false;
        }
        if(!mElse.equals(r.mElse)) {
            return false;
        }
        return true;
    }
    public BoolExpr getCondition() {
        return mCondition;
    }
    public Statement getThen() {
        return mThen;
    }
    public Statement getElse() {
        return mElse;
    }
    public String toString() {
        return "IfThenElse(" + mCondition.toString() + ", " + mThen.toString() + ", " + mElse.toString() + ")";
    }
}
