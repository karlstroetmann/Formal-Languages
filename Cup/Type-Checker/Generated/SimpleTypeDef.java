public class SimpleTypeDef extends TypeDef {
    private String mName;
    private List<Type> mTypeSum;

    public SimpleTypeDef(String name, List<Type> typeSum) {
        mName = name;
        mTypeSum = typeSum;
    }
    public Boolean equals(TypeDef rhs) {
        if (!(rhs instanceof SimpleTypeDef)) {
            return false;
        }
        SimpleTypeDef r = (SimpleTypeDef) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        if(!mTypeSum.equals(r.mTypeSum)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<Type> getTypeSum() {
        return mTypeSum;
    }
    public String toString() {
        return "SimpleTypeDef(" + mName.toString() + ", " + mTypeSum.toString() + ")";
    }
}
