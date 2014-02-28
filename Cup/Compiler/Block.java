import Assembler.*;
import java.util.*;

public class Block extends Statement {
    private List<Statement> mStatementList;

    public Block(List<Statement> statementList) {
        mStatementList = statementList;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        for (Statement stmnt: mStatementList) {
            result.addAll(stmnt.compile());
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
