import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {

    String mStr;
    Expr mExpr;

    public MyIterator(String str, Expr expr) {
        mStr = str;
        mExpr = expr;
    }

    public String getVariable(){
        return mStr;
    }
    
    public Expr getExpr(){
        return mExpr;
    }
    
    public String toString(){
        
        String result = mStr + " in " + mExpr.toString();
        
        return result;
    }
    
/*    public void execute(Expr expr, ArrayList<MyIterator> iterators, int index,
            BoolExpr bool, SetOrList list) {
        System.out.println("TEST");
        Value val = mExpr.eval();
        if (val instanceof SetOrList) {
            SetOrList sol = (SetOrList) val;
            Iterator<Value> it = sol.iterator();
            while (it.hasNext()) {
                Value res = it.next();
                Environment.putValue(mStr, res);
                System.out.println(res);
                if (iterators.size() >= index) {
                    if (bool == null || bool.eval()) {
                        list.add(expr.eval());
                    }
                } else {
                    (iterators.get(index + 1)).execute(expr, iterators, index + 1, bool, list);
                }
            }

        } else {
            System.err
                    .println("Fehler! In der Funktion execute der Klasse MyIterator muss Expr :'"
                            + mExpr.toString() + "' vom Typ SetOrList sein.");
            System.exit(1);
        }
    }

    public void execute(ArrayList<MyIterator> iterators, int index,
            BoolExpr bool, SetOrList list) {
        Value val = mExpr.eval();
        if (val instanceof SetOrList) {
            SetOrList sol = (SetOrList) val;
            Iterator<Value> it = sol.iterator();
            while (it.hasNext()) {
                Value res = it.next();
                Environment.putValue(mStr, res);
                if (iterators.size() <= index) {

                    if (bool == null || bool.eval()) {
                        Value value = Environment.findValue(mStr);
                    }
                } else {
                    iterators.get(index + 1).execute(iterators, index + 1,
                            bool, list);
                }
            }

        } else {
            System.err
                    .println("Fehler! In der Funktion execute der Klasse MyIterator muss Expr :'"
                            + mExpr.toString() + "' vom Typ SetOrList sein.");
            System.exit(1);
        }
    }
    
    
*/
}