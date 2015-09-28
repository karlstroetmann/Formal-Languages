public class MyToken extends Item {
    private String mName;

    public MyToken(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "<TT>" + mName + "</TT>";
    }
}
