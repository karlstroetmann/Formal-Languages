public class Variable extends Item {
    private String mName;

    public Variable(String name) {
        mName = name;
    }
    public boolean equals(Variable v) {
	return v.getName().equals(mName);
    }
    public int compareTo(Object rhs) {
        if (rhs instanceof Literal) {
            return 1;
        }
        if (rhs instanceof MyToken) {
            return 1;
        }
        if (rhs instanceof Variable) {
            Variable variableRhs = (Variable) rhs;
            return mName.compareTo(rhs.toString());
        }
        assert(false);
        return 1;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return mName;
    }
}
