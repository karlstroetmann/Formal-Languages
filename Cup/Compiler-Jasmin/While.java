import Assembler.*;
import java.util.*;

public class While extends Statement {
    private BoolExpr  mCondition;
    private Statement mStatement;

    public While(BoolExpr condition, Statement statement) {
        mCondition = condition;
        mStatement = statement;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        LABEL        loopLabel = new LABEL();
        LABEL        nextLabel = new LABEL();
        AssemblerCmd ifeq      = new IFEQ(nextLabel.getLabel());
        AssemblerCmd gotoLoop  = new GOTO(loopLabel.getLabel());
        result.add(loopLabel);
        result.addAll(mCondition.compile(symbolTable));
        result.add(ifeq);
        result.addAll(mStatement.compile(symbolTable));
        result.add(gotoLoop);
        result.add(nextLabel);
        return result;
    }
    public Integer stackSize() {
        return Math.max(mCondition.stackSize(), mStatement.stackSize());
    }
    public String toString() {
        return "While(" + mCondition + ", " + mStatement + ")";
    }
}
