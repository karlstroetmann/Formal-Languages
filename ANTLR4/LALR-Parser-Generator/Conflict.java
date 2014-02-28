import java.util.Map;

public class Conflict extends Action {
    private String mName;
	
    public Conflict(String name) { mName = name; }

    public boolean equals(Action rhs) {
    	if (!(rhs instanceof Conflict)) {
	        return false;
    	}
        Conflict conflict = (Conflict) rhs;
	    return mName.equals(conflict.mName);
    }

    public String toString() { return mName + " conflict"; }

    public String toString(Map<ComparableSet<MarkedRule>, Integer> m) {
	    return this.toString();
    } 
}
