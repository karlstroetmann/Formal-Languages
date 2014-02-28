public class Product extends Expr {
	Expr mLhs;
	Expr mRhs;

	public Product(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}

	public Value eval() {
		if (mRhs == null) {
			return mLhs.eval();
		}

		if (mLhs.eval() instanceof MyNumber && mRhs.eval() instanceof MyNumber) {
			MyNumber evalLhs = (MyNumber) mLhs.eval();
			MyNumber evalRhs = (MyNumber) mRhs.eval();

			return evalLhs.mul(evalRhs);
		}

		if (mLhs.eval() instanceof MySet && mRhs.eval() instanceof MySet) {
			MySet evalLhs = (MySet) mLhs.eval();
			MySet evalRhs = (MySet) mRhs.eval();

			return evalLhs.mul(evalRhs);
		}

		throw new RuntimeException();
	}

	public String toString() {
		return "(" + mLhs.toString() + ") * (" + mRhs.toString() + ")";
	}
}
