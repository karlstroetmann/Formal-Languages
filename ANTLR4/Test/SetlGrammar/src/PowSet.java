public class PowSet extends Expr {

	Expr mExpr;

	public PowSet(Expr setOrLsit) {
		mExpr = setOrLsit;
	}

	public Value eval() {
		if (mExpr.eval() instanceof MySet) {
			MySet set = (MySet) mExpr.eval();
			
			return set.power();
		}else if (mExpr.eval() instanceof MyList) {
			MyList list = (MyList) mExpr.eval();
			
			return list.power();
		} else {
			throw new RuntimeException();
		}
	}

	public String toString() {
		return "pow(" + mExpr.toString() + ")";
	}
}