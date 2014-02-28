import java.util.Set;
import java.util.Map;
import java.util.TreeSet;
import java.util.TreeMap;

public class Alternative extends Expr {
    Expr mLhs;
    Expr mRhs;

    public Alternative(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }    
	
    public String toString(Boolean indent) {
        if (indent) {
            return mLhs.toString(indent) + "\n    | " + mRhs.toString(false);
        }
        return mLhs.toString(false) + " | " + mRhs.toString(false);
    }	
}
