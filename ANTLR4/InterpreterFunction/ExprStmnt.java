public class ExprStmnt extends Statement {
    Expr mExpr;
    
    public ExprStmnt(Expr expr) {
        mExpr = expr;
    }
    public void execute(Environment e) throws ReturnException {
        mExpr.eval(e);
    }
}