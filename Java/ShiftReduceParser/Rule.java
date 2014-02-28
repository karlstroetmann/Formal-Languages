import java.util.*;

public class Rule {
    private Symbol       mHead;
    private List<Symbol> mBody;
    
    Rule(Symbol head, List<Symbol> body) {
        mHead = head;
        mBody = body;
    }
    public Symbol getHead() { 
        return mHead;
    }
    public List<Symbol> getBody() {
        return mBody;
    }
    public String toString() {
        String result = mHead + " -> ";
        for (Symbol symbol: mBody) {
            result += symbol + " ";
        }
        return result;
    }
}