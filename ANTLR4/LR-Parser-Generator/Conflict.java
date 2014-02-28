import java.util.Map;

public class Conflict extends Action {
    private String mName;
	
    public Conflict(String name) { mName = name; }

    public boolean equals(Action rhs) {
        if (rhs instanceof Conflict) {
            Conflict rhsConflict = (Conflict) rhs;
            return mName.equals(rhsConflict.mName);
        }
        return false;
    }

    public String toString() { return mName + " conflict"; }

    public String toString(Map<ComparableSet<MarkedRule>, Integer> m) {
	    return this.toString();
    } 
}
