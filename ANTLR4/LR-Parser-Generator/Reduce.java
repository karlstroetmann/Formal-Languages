import java.util.Map;

public class Reduce extends Action {
    private SimpleRule mRule;

    public Reduce(SimpleRule rule) {
	mRule = rule;
    }

    SimpleRule getRule() { return mRule; }

    public boolean equals(Action rhs) {
	if (!(rhs instanceof Reduce)) {
	    return false;
	}
	Reduce rhsReduce = (Reduce) rhs;
	return mRule.equals(rhsReduce.getRule());
    }

    public String toString() { return "<reduce, " + mRule + ">"; }

    public String toString(Map<ComparableSet<MarkedRule>, Integer> m) {
	return this.toString();
    } 
}
