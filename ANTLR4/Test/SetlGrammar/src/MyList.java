import java.math.BigInteger;
import java.util.*;

public class MyList extends SetOrList {

    ComparableList<Value> mList;

    public int size() {
		return mList.size();
	}

    public Value get(int i) {
		return mList.get(i);
	}
    
    public MyList() {
        mList = new ComparableList<Value>();
    }

    public MyList(SExpr sExpr) {
        mList = new ComparableList<Value>();

        if (sExpr instanceof Range) {
            MyList list = (MyList) ((Range) sExpr).eval();
            for (int i = 0; i < list.mList.size(); i++) {
                mList.add(((Range) sExpr).mList.get(i));
            }
        } else if (sExpr instanceof ExprList) {
            for (int i = 0; i < ((ExprList) sExpr).mList.size(); i++) {
                mList.add(((ExprList) sExpr).get(i).eval());
            }
        } else if (sExpr instanceof IteratorList) {
            mList = new ComparableList<Value>();
            MyList list = ((MyList) sExpr.eval());

            for (int i = 0; i < list.mList.size(); i++) {
                mList.add(list.get(i));
            }
        }

    }

    public MyList(Range range) {
        mList = new ComparableList<Value>();

        MyList list = (MyList) range.eval();
        for (int i = 0; i < list.mList.size(); i++) {
            mList.add(range.mList.get(i));
        }
    }

    public MyList(ExprList exprList) {
        mList = new ComparableList<Value>();

        for (int i = 0; i < exprList.mList.size(); i++) {
            mList.add(exprList.get(i).eval());
        }
    }

    public MyList(IteratorList itList) {
        mList = new ComparableList<Value>();
        MyList list = (MyList) itList.eval();

        for (int i = 0; i < list.mList.size(); i++) {
            mList.add(list.get(i));
        }
    }

    public MyList(Value value) {
        mList = new ComparableList<Value>();
        mList.add(value);
    }

    public MyList(ComparableList<Value> compList) {
        mList = compList;
    }

    public MyList(IteratorAndBool itAndBool) {
        mList = new ComparableList<Value>();
        mList.addAll(itAndBool.mList);
    }

    public Iterator<Value> iterator() {
        return mList.iterator();
    }

    public Value add(Value value) {
        if (value instanceof MyList) {
            mList.addAll(((MyList) value).mList);
            return new MyList(mList);
        }
        mList.add(value);
        return new MyList(mList);
    }

    public Value sub(Value val) {
        if (val instanceof MyList) {
            mList.remove(val);
            return new MyList(mList);
        } else {
            throw new RuntimeException();
        }
    }

    public Value mul(Value val) {
        throw new RuntimeException();
    }

    public Value div(Value val) {
        throw new RuntimeException();
    }

    public Value power() {
        throw new RuntimeException();
    }

    public Value arb() {
        return mList.getFirst();
    }

    public Value count() {
        return new MyNumber(BigInteger.valueOf(mList.size()));
    }

     public Value get(Expr expr) {
          if (expr.eval() instanceof MyNumber) {
           MyNumber number = (MyNumber) expr.eval();
           return mList.get(number.mValue.intValue());
          }

          return new MyList(expr.eval());
    }

    public int compareTo(Value comp) {
        if (comp instanceof MyList) {
            MyList second = (MyList) comp;
            return mList.compareTo(second.mList);
        } else {
            throw new RuntimeException();
        }
    }

    public Boolean eq(SetOrList rhs) {
        if (rhs instanceof MyList) {
            if (mList.compareTo(((MyList) rhs).mList) == 0) {
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    public Boolean gt(SetOrList rhs) {
        if (rhs instanceof MyList) {
            if (mList.compareTo(((MyList) rhs).mList) == -1) {
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
        if (rhs instanceof MyList) {
            if (mList.compareTo(((MyList) rhs).mList) == -1) {
                return true;
            }
            return false;
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

    public Boolean in(Value value) {
        return mList.contains(value);
    }

    public Boolean eq(Value rhs) {
        if (rhs instanceof SetOrList) {
            SetOrList setOrList = (SetOrList) rhs;
            return eq(setOrList);
        }
        throw new RuntimeException();
    }

    public Value mod(Value rhs) {
        throw new RuntimeException();
    }

    public Value power(Value rhs) {
          throw new RuntimeException();
    }
    
    public String toString() {
        String result = "[ ";

        if (mList.size() == 1) {
            result += mList.getFirst().toString();
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

        return result + " ]";
    }
}