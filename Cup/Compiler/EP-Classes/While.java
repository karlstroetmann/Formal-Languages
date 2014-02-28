public class While extends Statement {
    private BoolExpr mCondition;
    private Statement mStatement;

    public While(BoolExpr condition, Statement statement) {
        mCondition = condition;
        mStatement = statement;
    }
    public Boolean equals(Statement rhs) {
        if (!(rhs instanceof While)) {
            return false;
        }
        While r = (While) rhs;
        if(!mCondition.equals(r.mCondition)) {
            return false;
        }
        if(!mStatement.equals(r.mStatement)) {
            return false;
        }
        return true;
    }
    public BoolExpr getCondition() {
        return mCondition;
    }
    public Statement getStatement() {
        return mStatement;
    }
    public String toString() {
        return "While(" + mCondition.toString() + ", " + mStatement.toString() + ")";
    }
}
