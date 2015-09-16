public class InSet extends BoolExpr {

    Expr mSetOrList;
    Expr mExpr;

    public InSet(Expr setOrList, Expr expr) {
        mExpr = expr;
        mSetOrList = setOrList;
    }

    public Boolean eval(){

        if (mSetOrList.eval() instanceof MySet) {
            return ((MySet) mSetOrList.eval()).in(mExpr.eval());
        } else if (mSetOrList.eval() instanceof MyList) {
            return ((MyList) mSetOrList.eval()).in(mExpr.eval());
        } else {
            throw new RuntimeException();
        }
    }

    public String toString() {
        return mExpr.toString() + " in " + mSetOrList.toString();
    }

}
