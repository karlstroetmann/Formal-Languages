import java.util.Map;

public class Accept extends Action {
    public Accept() {}

    public String toString() { return "<accept>"; }

    public String toString(Map<ComparableSet<MarkedRule>, Integer> m) {
	return this.toString();
    } 
}
