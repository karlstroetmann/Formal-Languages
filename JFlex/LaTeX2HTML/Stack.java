public abstract class Stack<Element> implements Cloneable
{
    public abstract void    push(Element e);
    public abstract void    pop();
    public abstract Element top();
    public abstract boolean isEmpty();

    public Stack<Element> clone() throws CloneNotSupportedException {
        return (Stack<Element>) super.clone();
    }

    public final String toString() {
        Stack<Element> copy;
        try {
            copy = clone();
        } catch (CloneNotSupportedException e) {
            return "*** ERROR ***";
        }       
        String result = copy.convert();
        String dashes = "\n";
        for (int i = 0; i < result.length(); ++i) {
            dashes = dashes + "-";
        }
        return dashes + "\n" + result + dashes + "\n";
    }

    private String convert() {
        if (isEmpty()) {
            return "|";
        } else {
            Element top = top();
            pop();
            return convert() + " " + top + " |";
        }
    }
}


    
