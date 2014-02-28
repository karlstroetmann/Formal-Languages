import java.util.*;

public class MyList extends Element {
    private List<Element> mListExpr;

    public MyList(List<Element> listExpr) {
        mListExpr = listExpr;
    }
    public Boolean equals(Element rhs) {
        if (!(rhs instanceof MyList)) {
            return false;
        }
        MyList r = (MyList) rhs;
        if(!mListExpr.equals(r.mListExpr)) {
            return false;
        }
        return true;
    }
    public List<Element> getListExpr() {
        return mListExpr;
    }
    public String toString() {
        return "MyList(" + mListExpr.toString() + ")";
    }
}
