public abstract class Value {
    public abstract Value add(      Value rhs );
    public abstract Value subtract( Value rhs );
    public abstract Value multiply( Value rhs );
    public abstract Value divide(   Value rhs );
    public abstract Value modulo(   Value rhs );

    public abstract Boolean greaterOrEqual( Value rhs );
    public abstract Boolean greaterThan(    Value rhs );
    public abstract Boolean lessOrEqual(    Value rhs );
    public abstract Boolean lessThan(       Value rhs );
    public abstract Boolean equals(         Value rhs );
    public abstract Boolean notEquals(      Value rhs );

    public abstract Double toDouble();
    public abstract String toString();
}
