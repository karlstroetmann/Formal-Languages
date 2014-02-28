public abstract class Type {
    public abstract Boolean equals(Type rhs);
	public abstract Type    substitute(Parameter var, Type tau);
	public abstract String  myString();
}
