import assembler.*;
import java.util.*;

/**
 * This class represents the difference mLhs - mRhs;
 */
public class Difference extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Difference(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
        if (mLhs.getErshov() < mRhs.getErshov()) {
            mErshov = mRhs.getErshov();
        } else if (mLhs.getErshov() > mRhs.getErshov()) {
            mErshov = mLhs.getErshov();
        } else {
            mErshov = mLhs.getErshov() + 1;
        }
    }
    public List<AssemblerCmd> compile(Integer base, Map<String, Location> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        if (mLhs.getErshov() < mRhs.getErshov()) {
            List<AssemblerCmd> rhsCmds = mRhs.compile(base, symbolTable);
            List<AssemblerCmd> lhsCmds = mLhs.compile(base, symbolTable);
            result.addAll(rhsCmds);
            result.addAll(lhsCmds);
        } else if (mLhs.getErshov() > mRhs.getErshov()) {
            List<AssemblerCmd> lhsCmds = mLhs.compile(base, symbolTable);
            List<AssemblerCmd> rhsCmds = mRhs.compile(base, symbolTable);
            result.addAll(lhsCmds);
            result.addAll(rhsCmds);
        } else {
            List<AssemblerCmd> lhsCmds = mLhs.compile(base + 1, symbolTable);
            List<AssemblerCmd> rhsCmds = mRhs.compile(base    , symbolTable);
            result.addAll(lhsCmds);
            result.addAll(rhsCmds);
        }
        mRegister = base + mErshov;
        if (mRegister < 30) {
            result.add(new SUB(mRegister, mLhs.getReg(), mRhs.getReg()));
        } else {
            System.err.println("insufficient registers to compile:");
            System.err.println(this.toString());
        }
        return result;
    }
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Difference(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
