import java.math.BigInteger;

public class MyCrossMul extends Expr {
	SetOrList mSetOrList;

	public MyCrossMul(SetOrList setOrList) {
		mSetOrList = setOrList;
	}

	public MyCrossMul(Expr expr) {
		if (expr.eval() instanceof MySet) {
			MySet set = (MySet) expr.eval();
			mSetOrList = set;
		}
	}

	// wenn alle Elemente denselben Typ haben:
	// multipliziert alle Elemente einer Menge miteinander, wenn sie Zahlen sind
	// oder
	// erzeugt eine Intersection aller Elemente, wenn diese Mengen sind
	//
	// wirft eine Exception wenn dies auf eine Liste angewendet wird
	public Value eval() {

		if (mSetOrList instanceof MySet) {
			MySet set = (MySet) mSetOrList;
			Value first = set.mSet.getSet().first();

			if (first instanceof MyNumber) {
				MyNumber mulResultNumber = new MyNumber(BigInteger.ONE);

				for (Value value : set.mSet.getSet()) {
					if (value instanceof MyNumber) {
						MyNumber number = (MyNumber) value;
						mulResultNumber = (MyNumber) mulResultNumber
								.mul(number);
					} else {
						throw new RuntimeException();
					}
				}
				return mulResultNumber;
			}
			if (first instanceof MySet) {
				MySet mulResultSet = new MySet();

				for (Value value : set.mSet.getSet()) {
					if (value instanceof MySet) {
						mulResultSet = (MySet) mulResultSet.mul(value);
					} else {
						throw new RuntimeException();
					}
				}
				return mulResultSet;
			}
			if (first instanceof MyList) {
				throw new RuntimeException();
			}

		} else {
			throw new RuntimeException();
		}
		return null;
	}

	public String toString() {
		return "*/" + mSetOrList.toString();
	}
}