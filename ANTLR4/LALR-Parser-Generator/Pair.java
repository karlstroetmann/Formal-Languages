public class Pair<S extends Comparable<? super S>, 
                  T extends Comparable<? super T>> 
    implements Comparable<Pair<S,T>>
{
    S mFirst;
    T mSecond;
    
    public Pair(S first, T second) {
        mFirst  = first;
        mSecond = second;
    }

    public int compareTo(Pair<S, T> pair) {
        int cmpFirst = mFirst.compareTo(pair.getFirst());
        if (cmpFirst < 0 || cmpFirst > 0) {
            return cmpFirst;
        }
        return mSecond.compareTo(pair.getSecond());
    }

    public String toString() {
        return "<" + mFirst + ", " + mSecond + ">";
    }

    public S getFirst()  { return mFirst;  }
    public T getSecond() { return mSecond; }

    public void setFirst(S first) { 
        mFirst = first; 
    }
    public void setSecond(T second) { 
        mSecond = second; 
    }
}
