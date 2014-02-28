import assembler.*;
import java.util.*;

public class While extends Statement {
    private BoolExpr  mCondition;
    private Statement mStatement;

    public While(BoolExpr condition, Statement statement) {
        mCondition = condition;
        mStatement = statement;
    }
    public List<AssemblerCmd> compile(Map<String, Location> symbolTable) {
        // label loop
        //       mCondition.compile()
        //       ifeq next, mCondition.getReg(), R0
        //       mStatement.compile()
        //       goto loop
        // label next
        LABEL loop = new LABEL();
        LABEL next = new LABEL();
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        result.add(loop);
        result.addAll(mCondition.compile(0, symbolTable));
        result.add(new IFEQ(next.getLabel(), mCondition.getReg(), 0));
        result.addAll(mStatement.compile(symbolTable));
        result.add(new GOTO(loop.getLabel()));
        result.add(next);
        return result;
    }
    protected int maxErshov() {
        int result = 1;
        result = Math.max(result, mCondition.getErshov());
        result = Math.max(result, mStatement.maxErshov());
        return result;
    }
    public BoolExpr getCondition() {
        return mCondition;
    }
    public Statement getStatement() {
        return mStatement;
    }
    public String toString() {
        return "While(" + mCondition + ", " + mStatement + ")";
    }
}
