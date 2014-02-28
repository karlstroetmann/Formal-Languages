import java.util.*; 

public class Body {
    private List<Item> mItemList;

    public Body(List<Item> items) {
        mItemList = items;
    }
    public List<Item> getItemList() {
        return mItemList;
    }

    public int compareTo(Object rhs) {
	Body       rhsBody = (Body) rhs;
	List<Item> rhsList = rhsBody.getItemList();
	int lhsSize = mItemList.size();
	int rhsSize =   rhsList.size();
	if (lhsSize != rhsSize) {
	    return lhsSize - rhsSize;
	}
	for (int i = 0; i < mItemList.size(); ++i) {
	    int result = mItemList.get(i).compareTo(rhsList.get(i));
	    if (result != 0) {
		return result;
	    }
	}
	return 0;
    }

    public String toString() {
	String result = "";
	if (mItemList.size() > 0) {
	    for (Item i: mItemList) {
		result += " " + i;
	    }
	} 
	return result;
    }
}
