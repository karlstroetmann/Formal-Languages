public class ArrayStack<Element> extends Stack<Element>
{
    Element[] mArray;
    int       mIndex;

    public ArrayStack() {
        mArray = (Element[]) new Object[1];
        mIndex = 0;
    }
    
    public void push(Element e) {
        int size = mArray.length;
        if (mIndex == size) {
            Element[] newArray = (Element[]) new Object[2 * size];
            for (int i = 0; i < size; ++i) {
                newArray[i] = mArray[i];
            }
            mArray = newArray;
        }
        mArray[mIndex] = e;
        ++mIndex;
    }
    
    public void pop() {
        assert mIndex > 0 : "Stack underflow!";
        --mIndex;
    }

    public Element top() {
        assert mIndex > 0 : "Stack is empty!";
        return mArray[mIndex - 1];
    }
    
    public boolean isEmpty() {
        return mIndex == 0;
    }
}
