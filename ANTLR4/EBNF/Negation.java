public class Negation extends Expr {
    Expr mExpr;
	
    public Negation(Expr expr) {
        mExpr = expr;
    }    
    public String toString(Boolean indent) {
        return "~(" + mExpr.toString(false) + ")";
    }
}

