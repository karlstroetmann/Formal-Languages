package Interpreter;

public class Atom extends SymbolicExpression {
	String mAtom;

	public Atom(String atom) {
		mAtom = atom;
	}
    public String getAtom() { return mAtom; }
	public SymbolicExpression eval() {
		return this;
	}
	public String toString() { return mAtom; }
}