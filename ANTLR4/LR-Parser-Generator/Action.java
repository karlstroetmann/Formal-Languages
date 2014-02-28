import java.util.Map;

// This class encodes action.  There are 3 classes derived from this class:
//   1. Shift  represents shift actions.
//   2. Reduce represents reduce actions.
//   3. Accept represents the accept action.
public abstract class Action {
    public abstract boolean equals(Action rhs);
    public abstract String toString(Map<ComparableSet<MarkedRule>, Integer> m); 
}