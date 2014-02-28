package output;
import java.util.List;

public class ForLoop extends Statement {
	BoolExpr        mCond;
	List<Statement> mStmntList;
	Statement init;
	 List<Statement> loop;
	
	public ForLoop(Statement init, BoolExpr cond, List<Statement> loop, List<Statement> stmntList) {
		this.init = init;
		mCond      = cond;
		mStmntList = stmntList;
		this.loop = loop; 
		
	}
	private void executeLoop(){
		for ( int i=0; i< loop.size(); i++) {
				loop.get(i).execute();
		}
		
	}
	
	public void execute() {
		for ( init.execute(); mCond.eval(); executeLoop()) {
			for (Statement stmnt: mStmntList) {
				stmnt.execute();
			}
		}
	}
	public String toString() {
		String result = "for ("+ init + " "+ mCond + "; "+ loop.toString().substring(0, loop.toString().length()-1) +") {\n";
		for (Statement stmnt: mStmntList) {
			result += stmnt + "\n";
		}
		result += "}";
		return result;
	}
}
