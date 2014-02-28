public class Literal extends Item {
    private String mName;

    public Literal(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "<tt>" + mName + "</tt>";
    }
}
