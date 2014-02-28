public class Pair<A extends Comparable<A>, B extends Comparable<B>> 
	implements Comparable<Pair<A,B>> 
{
	A mA;
	B mB;
	
	public Pair(A a, B b) {
		mA = a;
		mB = b;
	}

	public int compareTo(Pair<A, B> p) {
		int first = mA.compareTo(p.mA);
		if (first != 0) {
			return first;
		}
		return mB.compareTo(p.mB);
	}
}
