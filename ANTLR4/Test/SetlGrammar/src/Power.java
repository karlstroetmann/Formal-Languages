public class Power extends Expr {

	Expr mLhs;
	Expr mRhs;

	public Power(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}

	public Value eval() {
		if (mRhs == null) {
			return mLhs.eval();
		} else {
			MyNumber evalLhs = (MyNumber) mLhs.eval();
			MyNumber evalRhs = (MyNumber) mRhs.eval();

			return evalLhs.power(evalRhs);
		}
	}

	public String toString() {
		if (mRhs == null) {
			return "(" + mLhs.toString() + ")";
		}
		return "(" + mLhs.toString() + ") ** (" + mRhs.toString() + ")";
	}
}