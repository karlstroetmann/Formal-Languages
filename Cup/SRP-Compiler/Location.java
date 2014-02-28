/** A location specifies either a register or a memory location of the stack.
    Therefore, there are two classes derived form this class and the class has 
    been generated from the following equation:

       Location = Memory(Integer offset) + Register(Integer number);

 */
public abstract class Location {
    public abstract Boolean equals(Location rhs);
}
