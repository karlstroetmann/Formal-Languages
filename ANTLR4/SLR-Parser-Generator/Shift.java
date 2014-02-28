import java.util.*;

public class Shift extends Action {
    private ComparableSet<MarkedRule> mState;

    public Shift(Set<MarkedRule> state) {
	mState = new ComparableSet<MarkedRule>(state);
    }

    ComparableSet<MarkedRule> getState() { return mState; }

    public String toString() { 
	return "<shift, " + mState + ">"; 
    }

    public String toString(Map<ComparableSet<MarkedRule>, Integer> m) { 
	return "<shift, s" + m.get(mState) + ">"; 

    }
}
