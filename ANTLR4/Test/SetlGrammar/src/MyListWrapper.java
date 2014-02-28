public class MyListWrapper extends Expr{
    ComparableList<Value> mList;
    int mParam = 0;
    Range mRange;
    ExprList mExprList;
    IteratorList mItList;
    ComparableList<Value> mCompList;
    SExpr mSExpr;
    IteratorAndBool mItAndBool;
    
    public MyListWrapper(){
        mParam = 1;
    }

    public MyListWrapper(Range range){
        mRange = range;
        mParam = 2;
    }
    
    public MyListWrapper(ExprList exprList){
        mExprList = exprList;
        mParam = 3;
    }
    
    public MyListWrapper(IteratorList itList){
        mItList = itList;
        mParam = 5;
    }

    public MyListWrapper(ComparableList<Value> compList){
        mCompList = compList;
        mParam = 6;
    }

    public MyListWrapper(SExpr sExpr){
        mSExpr = sExpr;
        mParam = 7;
    }
    
    public MyListWrapper(IteratorAndBool itAndBool){
        mItAndBool = itAndBool;
        mParam = 8;
    }        
    
    public Value eval() {
        
        if(mParam == 1){
            return new MyList();
        }else if(mParam == 2){
            return new MyList(mRange);
        }else if(mParam == 3){
            return new MyList(mExprList);
        }else if(mParam == 5){
            return new MyList(mItList);
        }else if(mParam == 6){
            return new MyList(mCompList);
        }else if(mParam == 7){
            return new MyList(mSExpr);
        }else if(mParam == 8){
            return new MyList(mSExpr);
        }else{
            System.err.println("Fehler! Der verwendete Konstruktor existiert nicht!");
            System.exit(1);
        }
        
        return null;
    }

}
