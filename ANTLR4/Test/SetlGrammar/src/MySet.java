import java.math.BigInteger;
import java.util.*;

public class MySet extends SetOrList {

    public ComparableSet<Value> mSet;

    public MySet() {
        mSet = new ComparableSet<Value>();
    }

    public MySet(SExpr sExpr) {
        mSet = new ComparableSet<Value>();

        if (sExpr instanceof Range) {
            MyList list = (MyList) ((Range) sExpr).eval();
            for (int i = 0; i < list.mList.size(); i++) {
                mSet.add(((Range) sExpr).mList.get(i));
            }
        } else if (sExpr instanceof ExprList) {
            for (int i = 0; i < ((ExprList) sExpr).mList.size(); i++) {
                mSet.add(((ExprList) sExpr).get(i).eval());

            }
        } else if (sExpr instanceof IteratorList) {
            MyList list = (MyList) ((IteratorList) sExpr).eval();

            for (int i = 0; i < list.mList.size(); i++) {
                mSet.add(list.get(i));
            }
        }
    }

    public MySet(Range range) {
        mSet = new ComparableSet<Value>();

        MyList list = (MyList) range.eval();
        for (int i = 0; i < list.mList.size(); i++) {
            mSet.add(range.mList.get(i));
        }
    }

    public MySet(ExprList exprList) {
        mSet = new ComparableSet<Value>();

        for (int i = 0; i < exprList.mList.size(); i++) {
            mSet.add(exprList.get(i).eval());
        }
    }

    public MySet(IteratorList itList) {
        mSet = new ComparableSet<Value>();
        MyList list = (MyList) itList.eval();

        for (int i = 0; i < list.mList.size(); i++) {
            mSet.add(list.get(i));
        }
    }

    public MySet(MyList list) {
        mSet = new ComparableSet<Value>();
        mSet.mSet.addAll(list.mList);
    }

    public MySet(Value value) {
        mSet = ComparableSet.singleton(value);
    }

    public MySet(MySet compSet) {
        mSet = compSet.mSet;
    }

    public MySet(ComparableSet<Value> compSet) {
        mSet = compSet;
    }

    public MySet(IteratorAndBool iterAndBool) {
        mSet = new ComparableSet<Value>();
        mSet.mSet.addAll(iterAndBool.mList);
    }

    public int size() {
		return mSet.size();
	}
    
	public Value get(int i) {
		return mSet.get(i);
	}

    public Iterator<Value> iterator() {
        return mSet.iterator();
    }

    // fuegt value der menge hinzu
    public Value add(Value value) {
        if (value instanceof MySet) {
            return new MySet((ComparableSet<Value>) mSet
                    .union(((MySet) value).mSet));
        } else {
            throw new RuntimeException();
        }
    }

    public Value sub(Value val) {
        if (val instanceof MySet) {
            return new MySet(mSet.difference(((MySet) val).mSet));
        } else {
            throw new RuntimeException();
        }
    }

    public Value mul(Value val) {
        if (val instanceof MySet) {
            return new MySet(mSet.intersection(((MySet) val).mSet));
        } else {
            throw new RuntimeException();
        }
    }

    public Value div(Value val) {
        throw new RuntimeException();
    }

    public Value power() {
        ComparableSet<ComparableSet<Value>> set = mSet.powerSet();
        Iterator<ComparableSet<Value>> iterator = set.iterator();
        ComparableSet<Value> result = new ComparableSet<Value>();

        while (iterator.hasNext()) {
            result.add(new MySet(iterator.next()));
        }
        return new MySet(result);
    }

    public Value arb() {
        return mSet.any();
    }

    public Value count() {
        return new MyNumber(BigInteger.valueOf(mSet.size()));
    }

    public int compareTo(Value comp) {
        if (comp instanceof MySet) {
            MySet second = (MySet) comp;
            return mSet.compareTo(second.mSet);
        } else {
            throw new RuntimeException();
        }
    }

    public Boolean eq(SetOrList rhs) {
        if (rhs instanceof MySet) {
            if (mSet.compareTo(((MySet) rhs).mSet) == 0) {
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    public Boolean gt(SetOrList rhs) {
        if (rhs instanceof MySet) {
            if (mSet.compareTo(((MySet) rhs).mSet) == 1) {
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }
    
    public Boolean gt(Value rhs) {
        if (rhs instanceof SetOrList) {
            SetOrList setOrList = (SetOrList) rhs;
            return gt(setOrList);
        }
        throw new RuntimeException();
    }

    public Boolean lt(SetOrList rhs) {
        if (rhs instanceof MySet) {
            if (mSet.compareTo(((MySet) rhs).mSet) == -1) {
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    public Boolean in(Value value) {
        return mSet.member(value);
    }

    public Boolean eq(Value rhs) {
        if (rhs instanceof SetOrList) {
            SetOrList setOrList = (SetOrList) rhs;
            return eq(setOrList);
        }
        throw new RuntimeException();
    }

    public Boolean lt(Value rhs) {
        if (rhs instanceof SetOrList) {
            SetOrList setOrList = (SetOrList) rhs;
            return lt(setOrList);
        }
        throw new RuntimeException();
    }

    public Value mod(Value rhs) {
        throw new RuntimeException();
    }

    public Value eval() {
        return new MySet(mSet);
    }

    public Value power(Value rhs) {
        throw new RuntimeException();
    }

    public String toString() {
        String result = "{ ";

        if (mSet.size() == 1) {
            result += mSet.getSet().first().toString();
        }

        if (mSet.size() > 1) {
            for (Iterator<Value> setIter = mSet.iterator(); setIter.hasNext();) {
                Value val = (Value) setIter.next();

                if (val.equals(mSet.getSet().first())) {
                    result += val.toString();
                } else {
                    result += ", " + val.toString();
                }
            }
        }

        return result + " }";
    }
}