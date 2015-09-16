import java.util.ArrayList;
import java.util.Iterator;

public class IteratorList extends SExpr {
    ArrayList<MyIterator> mItList;
    Expr mExpr;
    BoolExpr mBExpr;
    
    public IteratorList(Expr expr, ArrayList<MyIterator> itList, BoolExpr bExpr){
        mItList = itList;
        mExpr = expr;
        mBExpr = bExpr;
    }

    public Value eval() {        
        MyList result = new MyList(this.execute(mExpr, mItList, mBExpr));        
        return result;
        
    }
    
    public ComparableList<Value> execute(Expr expr, ArrayList<MyIterator> itList, BoolExpr bool) {
		ArrayList<MyIterator> iterators = new ArrayList<MyIterator>(itList);
		ComparableList<Value> list = new ComparableList<Value>();
        if(iterators.isEmpty()){
            if (bool==null || bool.eval()) {
                list.add(expr.eval());
            } 
            return list;
        }
        MyIterator myIt = iterators.get(0);
        Value val = myIt.getExpr().eval();
        iterators.remove(0);
        if (val instanceof SetOrList) {
            SetOrList sol = (SetOrList) val;
            for (int i = 0; i < sol.size();  ++i) {
				Value v = sol.get(i);
                Environment.putValue(myIt.getVariable(), v);
                list.addAll(this.execute(expr, iterators, bool));
            }
            return list;
        }
        else {
            throw new RuntimeException();
        }
        
    }    
    
}
