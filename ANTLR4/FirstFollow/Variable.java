public class Variable extends Item implements Comparable<Item>
{
    private String mName;

    public Variable(String name) {
        mName = name;
    }
    public String toString() {
        return mName;
    }
    public int compareTo(Item rhs) {
        if (rhs instanceof MyToken) {
            return +1;
        }
        Variable rhsVar = (Variable) rhs;
        return mName.compareTo(rhsVar.mName);
    }
}
