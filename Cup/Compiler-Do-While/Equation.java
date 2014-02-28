import java.util.*;

public class Equation extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public Equation(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = mLhs.compile();
		result.addAll(mRhs.compile());
		LABEL        trueLabel = new LABEL();
		LABEL        nextLabel = new LABEL();
		AssemblerCmd isub      = new ISUB();
		AssemblerCmd ifeq      = new IFEQ(trueLabel.getLabel());
		AssemblerCmd bipush0   = new BIPUSH(0);
		AssemblerCmd gotoNext  = new GOTO(nextLabel.getLabel());
		AssemblerCmd bipush1   = new BIPUSH(1);
		result.add(isub);
		result.add(ifeq);
		result.add(bipush0);
		result.add(gotoNext);
		result.add(trueLabel);
		result.add(bipush1);
		result.add(nextLabel);
		return result;
	}
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Equation(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
