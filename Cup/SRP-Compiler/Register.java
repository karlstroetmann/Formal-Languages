public class Register extends Location {
    private Integer mNumber;

    public Register(Integer number) {
        mNumber = number;
    }
    public Boolean equals(Location rhs) {
        if (!(rhs instanceof Register)) {
            return false;
        }
        Register r = (Register) rhs;
        if(!mNumber.equals(r.mNumber)) {
            return false;
        }
        return true;
    }
    public Integer getNumber() {
        return mNumber;
    }
    public String toString() {
        return "Register(" + mNumber.toString() + ")";
    }
}
