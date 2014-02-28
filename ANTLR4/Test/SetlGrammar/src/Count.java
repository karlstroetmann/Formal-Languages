public class Count extends Expr{
    Expr mSetOrList;

    public Count(Expr setOrList) {
        mSetOrList = setOrList;
    }  
    
    public Value eval() {
        Value value = mSetOrList.eval();
        
        if(value != null){
            if (value instanceof MyList) {
                MyList list  =  (MyList) mSetOrList.eval();
                return list.count();
            }else if (value instanceof MySet){
                MySet set  =  (MySet) mSetOrList.eval();
                return set.count();
            }
        }
        
        
        System.out.println("Wrong argumenttype #-Operator.");
        

        System.out.println(this.toString());
        System.out.println(value.toString());
        

        return null;
    }
    
    public String toString() {
        return "#(" + mSetOrList.toString() + ")";
    }
}
