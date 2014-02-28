import java.util.*; 

public class Body implements Comparable<Body>   
{
    private List<Item> mItemList;

    public Body(List<Item> items) {
        mItemList = items;
    }
    public List<Item> getItemList() {
        return mItemList;
    }
    public int compareTo(Body rhs) {
        for (int i = 0; i < mItemList.size() && i < rhs.getItemList().size(); ++ i) {
            int cmp = mItemList.get(i).compareTo(rhs.getItemList().get(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        if (mItemList.size() < rhs.getItemList().size()) {
            return -1;
        }
        if (mItemList.size() > rhs.getItemList().size()) {
            return +1;
        }
        return 0;
    }
    public String toString() {
        String result = "";
        if (mItemList.size() > 0) {
            for (Item i: mItemList) {
                result += i + " ";
            }
        } else {
            result += "/* empty */";
        }
        return result;
    }
}
