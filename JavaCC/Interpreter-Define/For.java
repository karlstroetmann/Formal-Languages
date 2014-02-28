import java.util.*;

public class For extends Statement {
	Assignment      mInit;
	BoolExpr        mCond;
	Assignment      mUpdate;
	List<Statement> mStmntList;
	
	public For(Assignment init, BoolExpr cond, Assignment update, List<Statement> stmntList) {
		mInit      = init;
		mCond      = cond;
		mUpdate    = update;
		mStmntList = stmntList;
	}
	public void execute(Environment e) throws ReturnException {
		for (mInit.execute(e); mCond.eval(e); mUpdate.execute(e)) {
			for (Statement stmnt: mStmntList) {
				stmnt.execute(e);
			}
		}
	}
	public String toString() {
		String result = "for (" + mInit + "; " + mCond + "; " + mUpdate + ") {\n";
		for (Statement stmnt: mStmntList) {
			result += stmnt + "\n";
		}
		result += "}";
		return result;
	}
}
