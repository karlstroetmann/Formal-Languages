import java.util.ArrayList;
import java.util.Iterator;

public class IteratorAndBool extends SExpr {
    SetOrList             mSetOrList;
    BoolExpr              mBExpr;
    ArrayList<MyIterator> mItList;
    ComparableList<Value> mList;

    public IteratorAndBool(ArrayList<MyIterator> itList, BoolExpr bExpr) {
        mItList = itList;
        mBExpr  = bExpr;
    }

    public Value eval() {
        mList = new ComparableList<Value>();
        MyList result = new MyList(this.execute(null, mItList, mBExpr));
        return result;

    }

    public ComparableList<Value> 
		execute(Expr expr, ArrayList<MyIterator> iterators, BoolExpr bool) 
	{
        mList = new ComparableList<Value>();
        if (iterators.isEmpty()) {
            if (bool == null || bool.eval()) {
                mList.add(expr.eval()); //TODO auswerten
            }
            return mList;
        }
        MyIterator myIt = iterators.get(0);
        Value val = myIt.getExpr().eval();
        iterators.remove(0);
        if (val instanceof SetOrList) {
            SetOrList sol = (SetOrList) val;
            Iterator<Value> it = sol.iterator();
            while (it.hasNext()) {
                Environment.putValue(myIt.getVariable(), it.next());
                mList.addAll(execute(expr, iterators, bool));
            }
            return mList;
        } else {
            throw new RuntimeException();
        }

    }

    public String toString() {
        String result = "";
        if (mList.size() == 1) {
            result = mList.getFirst().toString();
        }
        if (mList.size() > 1) {
            for (int i = 0; i < mList.size(); i++) {
                if (i == 0) {
                    result += mList.get(i).toString();
                } else {
                    result += ", " + mList.get(i).toString();
                }
            }
        }
        return result;
    }
}
