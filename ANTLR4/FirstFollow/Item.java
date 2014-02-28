import java.util.*;

// This is the superclass for tokens (class MyToken) and syntactical variables
// (class Variable)
public abstract class Item implements Comparable<Item>
{
    public int compareTo(Item rhs) {
        if (this instanceof MyToken) {
            MyToken thisToken = (MyToken) this;
            if (rhs instanceof MyToken) {
                MyToken rhsToken = (MyToken) rhs;
                return thisToken.compareTo(rhsToken);
            } else {
                return -1;
            }
        } else {
            Variable thisVar = (Variable) this;
            if (rhs instanceof Variable) {
                Variable rhsVar = (Variable) rhs;
                return thisVar.compareTo(rhsVar);
            } else {
                return +1;
            }
        }
    }
}

