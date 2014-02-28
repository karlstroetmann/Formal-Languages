import assembler.*;
import java.util.*;

public class LessThan extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public LessThan(Expr lhs, Expr rhs) {
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
            //       iflt trueLabel, lhsReg, rhsReg
            //       const mRegister, 0
            //       goto next
            // label trueLabel
            //       const mRegister, 1
            // label next
            LABEL trueLabel = new LABEL();
            LABEL nextLabel = new LABEL();
            result.add(new IFEQ(  trueLabel.getLabel(), mLhs.getReg(), mRhs.getReg()) );
            result.add(new CONST( mRegister, 0)                                       );
            result.add(new GOTO(  nextLabel.getLabel())                               );
            result.add(           trueLabel                                           );
            result.add(new CONST( mRegister, 1)                                       );
            result.add(           nextLabel                                           );
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
        return "LessThan(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
