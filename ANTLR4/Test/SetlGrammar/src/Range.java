import java.math.BigInteger;

public class Range extends SExpr {
    ComparableList<Value> mList;
    Expr mLhs;
    Expr mRhs;

    public Range(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
        //System.out.println(mLhs.toString() + " LHS : RHS " + mLhs.toString());
    }

    public Value eval() {

        BigInteger low = ((MyNumber) mLhs.eval()).getValue();
        BigInteger high = ((MyNumber) mRhs.eval()).getValue();

        mList = new ComparableList<Value>();

        int start = low.intValue();
        for (int i = start; low.intValue() <= high.intValue(); i++) {
            mList.add(new MyNumber(low));
            low = low.add(BigInteger.ONE);
        }
        
        return new MyList(mList);
    }

    public String toString() {
        return mLhs + " .. " + mRhs;
    }
}