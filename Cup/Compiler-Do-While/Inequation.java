import java.util.*;

public class Inequation extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public Inequation(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = mLhs.compile();
		result.addAll(mRhs.compile());
		LABEL        falseLabel = new LABEL();
		LABEL        nextLabel  = new LABEL();
		AssemblerCmd isub       = new ISUB();
		AssemblerCmd ifeq       = new IFEQ(falseLabel.getLabel());
		AssemblerCmd bipush1    = new BIPUSH(1);
		AssemblerCmd gotoNext   = new GOTO(nextLabel.getLabel());
		AssemblerCmd bipush0    = new BIPUSH(0);
		result.add(isub);
		result.add(ifeq);
		result.add(bipush1);
		result.add(gotoNext);
		result.add(falseLabel);
		result.add(bipush0);
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
        return "Inequation(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
