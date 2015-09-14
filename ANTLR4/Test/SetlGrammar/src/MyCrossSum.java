import java.math.BigInteger;

public class MyCrossSum extends Expr {
	SetOrList mSetOrList;
	Expr mSol;

	public MyCrossSum(SetOrList setOrList) {
		mSetOrList = setOrList;
	}

	public MyCrossSum(Expr sol) {
		mSol = sol;

		if (mSol.eval() instanceof MySet) {
			mSetOrList = (MySet) mSol.eval();
		} else if (mSol.eval() instanceof MyList) {
			mSetOrList = (MyList) mSol.eval();
		}
	}

	// wenn alle Elemente denselben Typ haben:
	// addiert alle Elemente einer Menge miteinander, wenn sie Zahlen sind oder
	// bildet die Vereinigungsmenge aller Elemente, wenn diese Mengen sind
	//
	// wirft eine Exception wenn dies auf eine Liste angewendet wird
	public Value eval() {
		// start MySet
		if (mSol.eval() instanceof MySet || mSetOrList instanceof MySet) {

			MySet set;

			if (mSol != null) {
				set = (MySet) mSol.eval();
			} else {
				set = (MySet) mSetOrList;
			}
			Value first = set.mSet.getSet().first();

			if (first instanceof MyNumber) {
				MyNumber sum = new MyNumber(BigInteger.ZERO);

				for (Value value : set.mSet.getSet()) {
					if (value instanceof MyNumber) {
						MyNumber number = (MyNumber) value;
						sum = (MyNumber) sum.add(number);
					} else {
						throw new RuntimeException();
					}

				}

				return sum;
			}
			if (first instanceof MySet) {
				MySet sumSet = new MySet();

				for (Value value : set.mSet.getSet()) {
					if (value instanceof MySet) {
						sumSet = (MySet) sumSet.add(value);
					} else {
						throw new RuntimeException();
					}
				}

				return sumSet;
			}
			if (first instanceof MyList) {
				MyList sumList = new MyList();

				for (Value value : set.mSet.getSet()) {
					if (value instanceof MyList) {
						sumList = (MyList) sumList.add(value);
					} else {
						throw new RuntimeException();
					}
				}

				return sumList;
			}
			// end MySet

		} else {
			throw new RuntimeException();
		}
		return null;
	}

	public String toString() {
		return "+/" + mSetOrList.toString();
	}
}
