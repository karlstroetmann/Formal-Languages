import java.util.Map;

public class Accept extends Action {
    public Accept() {}

    public boolean equals(Action rhs) {
	if (!(rhs instanceof Accept)) {
	    return false;
	}
	return true;
    }

    public String toString() { return "<accept>"; }

    public String toString(Map<ComparableSet<MarkedRule>, Integer> m) {
	return this.toString();
    } 
}
