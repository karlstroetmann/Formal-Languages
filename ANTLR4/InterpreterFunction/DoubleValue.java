public class DoubleValue extends Value {
    Double mValue;
    
    public DoubleValue(Double value) {
        mValue = value;
    }
    public Value add(Value rhs) {
        return new DoubleValue(mValue + rhs.toDouble());
    }
    public Value subtract(Value rhs) {
        return new DoubleValue(mValue - rhs.toDouble());
    }
    public Value multiply(Value rhs) {
        return new DoubleValue(mValue * rhs.toDouble());
    }
    public Value divide(Value rhs) {
        return new DoubleValue(mValue / rhs.toDouble());
    }
    public Value modulo(Value rhs) {
        return new DoubleValue(mValue % rhs.toDouble());
    }
    public Boolean greaterOrEqual(Value rhs) {
        return mValue >= rhs.toDouble();
    }
    public Boolean greaterThan(Value rhs) {
        return mValue > rhs.toDouble();
    }
    public Boolean lessOrEqual(Value rhs) {
        return mValue <= rhs.toDouble();
    }
    public Boolean lessThan(Value rhs) {
        return mValue < rhs.toDouble();
    }
    public Boolean equals(Value rhs) {
        return (double) mValue == (double) rhs.toDouble();
    }
    public Boolean notEquals(Value rhs) {
        return (double) mValue != (double) rhs.toDouble();
    }

    public Double toDouble() {
        return mValue;
    }    
    public String toString() {
	return mValue + "";
    }
}
