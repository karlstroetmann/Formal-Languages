import java.util.*;

public class While extends Statement {
	BoolExpr        mCond;
	List<Statement> mStmntList;
	
	public While(BoolExpr cond, List<Statement> stmntList) {
		mCond      = cond;
		mStmntList = stmntList;
	}
	public void execute(Environment e) throws ReturnException {
		while (mCond.eval(e)) {
			for (Statement stmnt: mStmntList) {
				stmnt.execute(e);
			}
		}
	}
	public String toString() {
		String result = "while (" + mCond + ") {\n";
		for (Statement stmnt: mStmntList) {
			result += stmnt + "\n";
		}
		result += "}";
		return result;
	}
}
