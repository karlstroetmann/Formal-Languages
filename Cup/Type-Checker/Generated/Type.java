public abstract class Type {
    public abstract Type substitute(Parameter x1, Type x2);
    public abstract Boolean equals(Type rhs);
}
