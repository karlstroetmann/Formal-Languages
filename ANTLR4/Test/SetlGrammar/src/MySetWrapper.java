
public class MySetWrapper extends Expr {
    int mParam = 0;
    Range mRange;
    ExprList mExprList;
    Value mValue;
    IteratorList mItList;
    ComparableSet<Value> mCompSet;
    MySet mCSet;
    SExpr mSExpr;
    MyList mList;
    IteratorAndBool mItAndBool;
    
    public MySetWrapper(){
        mParam = 1;
    }

    public MySetWrapper(Range range){
        mRange = range;
        mParam = 2;
    }
    
    public MySetWrapper(ExprList exprList){
        mExprList = exprList;
        mParam = 3;
    }
    
    public MySetWrapper (Value value) {
        mValue = value;
        mParam = 4;
    }
    
    public MySetWrapper(IteratorList itList){
        mItList = itList;
        mParam = 5;
    }

    public MySetWrapper(ComparableSet<Value> compSet){
        mCompSet = compSet;
        mParam = 6;
    }

    public MySetWrapper(MySet compSet){
        mCSet = compSet;
        mParam = 7;
    }
    
    public MySetWrapper(SExpr sExpr){
        mSExpr = sExpr;
        mParam = 8;
    }

    public MySetWrapper(MyList list){
        mList = list;
        mParam = 9;
    }
    
    public MySetWrapper(IteratorAndBool itAndBool) {
        mItAndBool = itAndBool;
        mParam = 10;
    }
    
    public Value eval() {
        if(mParam == 1){
            return new MySet();
        }else if(mParam == 2){
            return new MySet(mRange);
        }else if(mParam == 3){
            return new MySet(mExprList);
        }else if(mParam == 4){
            return new MySet(mValue);
        }else if(mParam == 5){
            return new MySet(mItList);
        }else if(mParam == 6){
            return new MySet(mCompSet);
        }else if(mParam == 7){
            return new MySet(mCSet);
        }else if(mParam == 8){
            return new MySet(mSExpr);
        }else if(mParam == 9){
            return new MySet(mList);
        }else if(mParam == 10){
            return new MySet(mItAndBool);
        }else{
            System.err.println("Fehler! Der verwendete Konstruktor existiert nicht!");
            System.exit(1);
        }
        
        return null;
    }
}
