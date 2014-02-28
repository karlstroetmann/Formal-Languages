import assembler.*;
import java.util.*;

public class Function {
    private String            mName;
    private List<String>      mParameterList;
    private List<Declaration> mDeclarations;
    private List<Statement>   mBody;
    // the number of registers saved on the the stack by the function
    // currently translated
    private Integer           mNumberUsedRegs;
    // number of local vars on stack
    private Integer           mNumberVarsOnStack;
    // For a variable v that is not stored in a register, mSymbolTable.get(v) 
    // is the offset relative to the stack pointer where the variable is stored.
    // If v is stored in a register, mSymbolTable.get(v) returns the register
    // of the variable.
    private Map<String, Location> mSymbolTable;

    // the name of the function currently being parsed.
    public static String sName;

    public Function(String            name, 
                    List<String>      parameterList, 
                    List<Declaration> declarations, 
                    List<Statement>   body) 
    {
        mName          = name;
        mParameterList = parameterList;
        mDeclarations  = declarations;
        mBody          = body;
    }
    public List<AssemblerCmd> compile() {
        initTable();
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        result.add(new PROC(mName));
        result.addAll(saveRegisters());
        result.addAll(fillRegisters());
        for (Statement stmnt: mBody) {
            result.addAll(stmnt.compile(mSymbolTable));
        }
        result.add(new NEWLINE());
        return result;
    }
    /** save all those registers on the stack that are used
     */
    private List<AssemblerCmd> saveRegisters() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        for (int i = 1; i <= mNumberUsedRegs; ++i) {
            // storec Ri, SP + i
            result.add(new STOREC(i, mNumberVarsOnStack + i));
        }
        int nextFree = mNumberVarsOnStack + mNumberUsedRegs + 1;
        mSymbolTable.put("$free@"              + mName, new Memory(nextFree));
        mSymbolTable.put("$numberVarsOnStack@" + mName, new Memory(mNumberVarsOnStack));
        mSymbolTable.put("$numberUsedRegs@"    + mName, new Memory(mNumberUsedRegs   ));
        return result;
    }
    /** fill those registers that hold parameters
     */
    private List<AssemblerCmd> fillRegisters() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        for (int i = 0; i < mParameterList.size(); ++i) {
            String p = mParameterList.get(i);
            Location l = mSymbolTable.get(p);
            if (l instanceof Register) {
                Integer register = ((Register) l).getNumber();
                Integer offset   = mParameterList.size() - i;
                // load register, SP - offset 
                result.add(new LOADC(register, -offset));
            } else {
                return result;
            }
        }
        return result;
    }
    /** initialize the symbol table */
    private void initTable() {
        mSymbolTable = new TreeMap<String, Location>();
        // next available register
        int nextAvailable = maxErshov() + 1;
        for (int i = 0; i < mParameterList.size(); ++i) {
            String p = mParameterList.get(i);
            if (nextAvailable < 30) {
                mSymbolTable.put(p, new Register(nextAvailable));
                System.out.println(p + " |-> R" + nextAvailable);
                ++nextAvailable;
            } else {
                int offset = - mParameterList.size() + i;
                mSymbolTable.put(p, new Memory(offset));
            }
        }
        int offset = 0;    
        for (int i = 0; i < mDeclarations.size(); ++i) {
            String v = mDeclarations.get(i).getVar();
            if (nextAvailable < 30) {
                mSymbolTable.put(v, new Register(nextAvailable));
                System.out.println(v + " |-> R" + nextAvailable);
                ++nextAvailable;
            } else {
                ++offset;
                mSymbolTable.put(v, new Memory(offset));
            }
        }
        System.out.println("Used R1, ..., R" + (nextAvailable - 1) + 
                           " for function " + mName);
        mNumberVarsOnStack = offset;
        mNumberUsedRegs    = nextAvailable - 1;
    }
    private int maxErshov() {
        int result = 1;
        for (Statement stmnt: mBody) { 
            result = Math.max(result, stmnt.maxErshov());
        }
        return result;
    }
    public String getName() {
        return mName;
    }
    public List<String> getParameterList() {
        return mParameterList;
    }
    public List<Statement> getBody() {
        return mBody;
    }
    public String toString() {
        return "Function(" + mName + ", " + mParameterList + ", " + mBody + ")";
    }
}
