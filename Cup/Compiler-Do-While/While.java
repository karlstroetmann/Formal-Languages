import java.util.*;

public class While extends Statement {
    private BoolExpr  mCondition;
    private Statement mStatement;

    public While(BoolExpr condition, Statement statement) {
        mCondition = condition;
        mStatement = statement;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        LABEL        loopLabel = new LABEL();
        LABEL        nextLabel = new LABEL();
        AssemblerCmd ifeq      = new IFEQ(nextLabel.getLabel());
        AssemblerCmd gotoLoop  = new GOTO(loopLabel.getLabel());
        result.add(loopLabel);
        result.addAll(mCondition.compile());
        result.add(ifeq);
        result.addAll(mStatement.compile());
        result.add(gotoLoop);
        result.add(nextLabel);
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
