import java.util.*;

public class Shift extends Action {
    private ComparableSet<ExtendedRule> mState;

    public Shift(TreeSet<ExtendedRule> state) {
        mState = new ComparableSet<ExtendedRule>(state);
    }

    ComparableSet<ExtendedRule> getState() { return mState; }

    public boolean equals(Action rhs) {
        if (!(rhs instanceof Shift)) {
            return false;
        }
        Shift rhsShift = (Shift) rhs;
        return mState.equals(rhsShift.getState());
    }

    public String toString() { 
        return "<shift, " + mState + ">"; 
    }

    public String toString(Map<ComparableSet<MarkedRule>, Integer> m) { 
        ComparableSet<MarkedRule> state = ExtendedRule.stripSet(mState);
        return "<shift, s" + m.get(state) + ">";
    }
}
