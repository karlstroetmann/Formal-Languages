import assembler.*;
import java.util.*;

public class Disjunction extends BoolExpr {
    private BoolExpr mLhs;
    private BoolExpr mRhs;

    public Disjunction(BoolExpr lhs, BoolExpr rhs) {
        mLhs = lhs;
        mRhs = rhs;
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
            result.add(new OR(mRegister, mLhs.getReg(), mRhs.getReg()));
        } else {
            System.err.println("insufficient registers to compile:");
            System.err.println(this.toString());
        }
        return result;
    }
    public BoolExpr getLhs() {
        return mLhs;
    }
    public BoolExpr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Disjunction(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
