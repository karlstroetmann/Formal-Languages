import java.util.ArrayList;


public class ExprList extends SExpr {

	ArrayList<Expr> mList;
	
	public ExprList(ArrayList<Expr> list){
		mList = list;
	}
	
	public Expr get(int i) {
		  return mList.get(i);
	}
	
	public Value eval() {
		return null;
	}
	
	public String toString(){
		
		String result = "";
		
		for (int i = 0; i < mList.size(); i++) {
			result += mList.get(i).toString();
			
			if(i < (mList.size()-1)){
				result += ",";
			}
		}
		
		return result;
	}

}
