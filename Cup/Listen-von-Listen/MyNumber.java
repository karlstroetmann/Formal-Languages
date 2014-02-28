public class MyNumber extends Element {
    private Integer mNumber;

    public MyNumber(Integer number) {
        mNumber = number;
    }
    public Boolean equals(Element rhs) {
        if (!(rhs instanceof MyNumber)) {
            return false;
        }
        MyNumber r = (MyNumber) rhs;
        if(!mNumber.equals(r.mNumber)) {
            return false;
        }
        return true;
    }
    public Integer getNumber() {
        return mNumber;
    }
    public String toString() {
        return "MyNumber(" + mNumber.toString() + ")";
    }
}
