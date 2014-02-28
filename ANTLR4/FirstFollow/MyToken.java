import java.util.*;

public class MyToken extends Item 
    implements Comparable<Item>
{
    private String mName;

    public MyToken(String name) {
        mName = name;
    }
    public String toString() {
        return mName;
    }
    public int compareTo(Item rhs) {
        if (rhs instanceof Variable) {
            return -1;
        }
        MyToken tokenRhs = (MyToken) rhs;
        return mName.compareTo(tokenRhs.mName);
    }
}
