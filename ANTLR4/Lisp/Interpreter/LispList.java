package Interpreter;

import java.util.*;

public class LispList extends SymbolicExpression {
	List<SymbolicExpression> mList;

	public LispList(List<SymbolicExpression> list) {
		mList = list;
	}
    public List<SymbolicExpression> getList() { return mList; }

	public SymbolicExpression eval() {
		if (mList.isEmpty()) {
			return this;
		}
		List<SymbolicExpression> result = new LinkedList<SymbolicExpression>();
		for (SymbolicExpression element : mList) {
			result.add(element.eval());
		}
		if (mList.size() == 1) {
			return new LispList(result);
		}
		SymbolicExpression first = result.get(0);
		if (first instanceof Atom) {
			String fct = ((Atom) first).getAtom();
			if (fct.equals("car")) {
				result.remove(0);
				assert result.size() == 1 : "car: wrong number of arguments";
				LispList l = (LispList) result.get(0);
				return l.getList().get(0);
			}
			if (fct.equals("cdr")) {
				result.remove(0);
				assert result.size() == 1 : "cdr: wrong number of arguments";
				List<SymbolicExpression> l = ((LispList) result.get(0)).getList();
				l.remove(0);
				return new LispList(l);
			}
			if (fct.equals("+")) {
				result.remove(0);
				double sum = 0;
				for (SymbolicExpression x: result) {
					sum += ((Number) x).getNumber();
				}
				return new Number(sum);
			}
		}
		return new LispList(result);	
	}
	public String toString() {
		int i = 0;
		String result = "(";
		for (SymbolicExpression symExp: mList) {
			result += symExp;
			++i;
			if (i < mList.size()) {
				result += " ";
			}
		}
		result += ")";
		return result;
	}
}
