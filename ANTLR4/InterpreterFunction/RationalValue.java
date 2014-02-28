import java.math.BigInteger;

// This class represents rational numbers.  The value represented by an instance of this class
// is mN/mD
public class RationalValue extends Value {
    BigInteger mN; // nominator
    BigInteger mD; // denominator
    
    public RationalValue(BigInteger n, BigInteger d) {
        BigInteger ggt = n.gcd(d);
        mN = n.divide(ggt);
        mD = d.divide(ggt);        
    }
    public RationalValue(BigInteger n) {
        mN = n;
        mD = BigInteger.ONE;
    }
    public Value add(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // mN/mD + r.mN/r.mD = (mN * r.mD + mD * r.mN) / (mD * r.mD)
            return new RationalValue(mN.multiply(r.mD).add(mD.multiply(r.mN)), 
                                     mD.multiply(r.mD));
        }
        return new DoubleValue(this.toDouble() + rhs.toDouble());
    }
    public Value subtract(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // mN/mD - r.mN/r.mD = (mN * r.mD - mD * r.mN) / (mD * r.mD)
            return 
                new RationalValue(mN.multiply(r.mD).subtract(mD.multiply(r.mN)),
                                  mD.multiply(r.mD));
        }
        return new DoubleValue(this.toDouble() - rhs.toDouble());
    }
    public Value multiply(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // mN/mD * r.mN/r.mD = (mN * r.mN) / (mD * r.mD)
            return new RationalValue(mN.multiply(r.mN), mD.multiply(r.mD));
        }
        return new DoubleValue(this.toDouble() * rhs.toDouble());
    }
    public Value divide(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // (mN/mD) / (r.mN/r.mD) = (mN * r.mD) / (mD * r.mN)
            return new RationalValue(mN.multiply(r.mD), mD.multiply(r.mN));
        }
        return new DoubleValue(this.toDouble() / rhs.toDouble());
    }
    // The floor of a number x is defined as the biggest integer n such that n <= x.
    // The calculation is rather complicated because the integer division of negative
    // numbers in Java does not satisfy the mathematical specification that
    // a = (a/b) * b + r with 0 <= r < b.  Rather, Java always rounds to 0.
    private RationalValue floor() {
        if (mN.compareTo(BigInteger.ZERO) < 0 && 
            mD.compareTo(BigInteger.ONE) != 0) 
        {
            // For negative nominators, divison in Java is not implemented
            // according to its mathematical specification.  Therefore
            // negative nominators have to be dealt with separately.
            return new RationalValue(mN.divide(mD).subtract(BigInteger.ONE));
        }
        return new RationalValue(mN.divide(mD));
    }
    public Value modulo(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r  = (RationalValue) rhs;
            RationalValue ab = (RationalValue) this.divide(r);
            // a % b = a - floor(a/b) * b
            return this.subtract(ab.floor().multiply(r));
        }
        return new DoubleValue(this.toDouble() % rhs.toDouble());
    }
    public Boolean greaterOrEqual(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // (mN/mD >= r.mN/r.mD) <==> (mN * r.mD >= mD * r.mN)
            return mN.multiply(r.mD).compareTo(mD.multiply(r.mN)) >= 0;
        }
        return this.toDouble() >= rhs.toDouble();
    }
    public Boolean greaterThan(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // (mN/mD > r.mN/r.mD) <==> (mN * r.mD > mD * r.mN)
            return mN.multiply(r.mD).compareTo(mD.multiply(r.mN)) > 0;
        }
        return this.toDouble() > rhs.toDouble();
    }
    public Boolean lessOrEqual(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // (mN/mD <= r.mN/r.mD) <==> (mN * r.mD <= mD * r.mN)
            return mN.multiply(r.mD).compareTo(mD.multiply(r.mN)) <= 0;
        }
        return this.toDouble() <= rhs.toDouble();
    }
    public Boolean lessThan(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // (mN/mD < r.mN/r.mD) <==> (mN * r.mD < mD * r.mN)
            return mN.multiply(r.mD).compareTo(mD.multiply(r.mN)) < 0;
        }
        return this.toDouble() < rhs.toDouble();
    }
    public Boolean equals(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // (mN/mD == r.mN/r.mD) <==> (mN * r.mD == mD * r.mN)
            return mN.multiply(r.mD).compareTo(mD.multiply(r.mN)) == 0;
        }
        return (double) this.toDouble() == (double) rhs.toDouble();
    }
    public Boolean notEquals(Value rhs) {
        if (rhs instanceof RationalValue) {
            RationalValue r = (RationalValue) rhs;   
            // (mN/mD != r.mN/r.mD) <==> (mN * r.mD != mD * r.mN)
            return mN.multiply(r.mD).compareTo(mD.multiply(r.mN)) != 0;
        }
        return (double) this.toDouble() != (double) rhs.toDouble();
    }
    public Double toDouble() {
        BigInteger r = mN;
        BigInteger two = new BigInteger("2");
        int n = 128;
        r = r.shiftLeft(n);
        r = r.divide(mD);
        Double result = r.doubleValue();
        for (int i = 1; i <= n; ++i) {
            result *= 0.5;
        }
        return result;
        // return mN.doubleValue() / mD.doubleValue(); is too naive
    }
    public Integer toInteger() {
        BigInteger one = new BigInteger("1");
        if (!mD.equals(one)) {
            System.err.println("conversion to int failed");
            System.exit(1);
        }    
        return mN.intValue();
    }
    public String toString(Integer n) {
        BigInteger one = new BigInteger("1");
        if (mD.equals(one)) {
            return mN.toString();
        }    
        String     result = mN.divide(mD) + ".";
        BigInteger rest   = mN.mod(mD);
        BigInteger ten    = new BigInteger("10");
        for (int i = 1; i <= n; i = i + 1) {
            rest   = rest.multiply(ten);
            result = result + rest.divide(mD);
            rest   = rest.mod(mD);
        }    
        return result;
    }
    public String toString() {
        BigInteger one = new BigInteger("1");
        if (mD.equals(one)) {
            return mN.toString();
        }    
        return mN + "/" + mD;
    }
}
