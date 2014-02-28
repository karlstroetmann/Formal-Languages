import assembler.*;
import java.util.*;

public class Block extends Statement {
    private List<Statement> mStatementList;

    public Block(List<Statement> statementList) {
        mStatementList = statementList;
    }
    public List<AssemblerCmd> compile(Map<String, Location> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        for (Statement stmnt: mStatementList) {
            result.addAll(stmnt.compile(symbolTable));
        }
        return result;
    }
    protected int maxErshov() {
	int result = 1;
	for (Statement stmnt: mStatementList) {
	    result = Math.max(result, stmnt.maxErshov());
	}
	return result;
    }
    public List<Statement> getStatementList() {
        return mStatementList;
    }
    public String toString() {
        return "Block(" + mStatementList + ")";
    }
}
