public class Variable extends Item {
    private String mName;

    public Variable(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "<A HREF=\"#" + mName + "\"><EM>" + mName + "</EM></A>" ;
    }
}
