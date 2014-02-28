import java.util.*; 

public class Rule {
    private String mHead;
    private Expr   mExpr;

    public Rule(String head, Expr expr) {
        mHead = head;
        mExpr = expr;
    }
    public String getHead() {
        return mHead;
    }
    public Expr getExpr() {
        return mExpr;
    }
    public String toString(Boolean indent) {
        if (!indent) {
            return mHead + " : " + mExpr.toString(false) + ";\n";
        }
        return mHead + "\n    : " + mExpr.toString(true) + "\n    ;\n\n";
    }
}
