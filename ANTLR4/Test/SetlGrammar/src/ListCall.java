public class ListCall extends Expr {

	String mVariable;
	Expr mElement;
	MyList mList;
	Expr mVar;

	public ListCall(Expr var, Expr element) {
		mVar = var;
		mElement = element;

		Variable variable;

		if (mVar instanceof Variable) {
			variable = (Variable) mVar;
			mVariable = variable.mName;
		}
	}

	public ListCall(String var, Expr element) {
		mVariable = var;
		mElement = element;
	}

	public Value eval() {
		try {
			Object val = Environment.findValue(mVariable);

			if (val instanceof MyList)
				mList = (MyList) val;

			MyNumber myNumberElement = (MyNumber) mElement.eval();

			return mList.mList.get(myNumberElement.mValue.intValue());

		} catch (Exception ex) {
			return new MyString(ex.getMessage());
		}
	}

	public String toString() {
		return mVariable + "[" + mElement + "]";
	}

}