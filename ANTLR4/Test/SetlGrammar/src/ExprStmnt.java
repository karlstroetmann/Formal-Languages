public class ExprStmnt extends Statement {
    Expr mExpr;
    
    public ExprStmnt(Expr expr) {
        mExpr = expr;
    }
    public void execute() throws ReturnException {
        mExpr.eval();
    }
    public String toString() {
        return mExpr.toString();
    }
}