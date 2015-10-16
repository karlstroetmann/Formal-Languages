import java.util.*; 

public class Body {
    private List<Item> mItemList;

    public Body(List<Item> items) {
        mItemList = items;
    }
    public String toString() {
	String result = "";
	if (mItemList.size() > 0) {
	    for (Item i: mItemList) {
		result += i + " ";
	    }
	} else {
	    result += "<tt>/* empty */</tt>";
	}
	return result;
    }
}
