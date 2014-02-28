import java.util.*; 

public class Body implements Comparable<Body>   
{
    private List<Item> mItemList;

    public Body() {
        mItemList = new ArrayList<Item>();
    }
    public Body(List<Item> items) {
        mItemList = items;
    }
    public List<Item> getItemList() {
        return mItemList;
    }
    public int size() {
	return mItemList.size();
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
    public boolean equals(Body rhs) {
        if (mItemList.size() != rhs.getItemList().size()) {
            return false;
        }
        for (int i = 0; i < mItemList.size() && i < rhs.getItemList().size(); ++ i) {
            if (!mItemList.get(i).equals(rhs.getItemList().get(i))) {
                return false;
            }
        }    
        return true;
    }
    public String toString() {
        String result = "";
        if (mItemList.size() > 0) {
            for (int i = 0; i < mItemList.size(); ++i) {
                result += mItemList.get(i);
		if (i < mItemList.size() - 1) {
		    result += " ";
		}
            }
        }
        return result;
    }
}
