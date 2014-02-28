import Assembler.*;
import java.util.*;

public class Block extends Statement {
    private List<Statement> mStatementList;

    public Block(List<Statement> statementList) {
        mStatementList = statementList;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        for (Statement stmnt: mStatementList) {
            result.addAll(stmnt.compile(symbolTable));
        }
        return result;
    }
    public Integer stackSize() {
        Integer biggest = 0;
        for (Statement stmnt: mStatementList) {
            biggest = Math.max(biggest, stmnt.stackSize());
        }
        return biggest;
    }
    public String toString() {
        return "Block(" + mStatementList + ")";
    }
}
