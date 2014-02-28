import java.util.Iterator;
import java.util.LinkedList;

//Klasse fuer die Comparable-Lists
@SuppressWarnings("serial")
public class ComparableList<T extends Comparable<? super T>> 
    extends LinkedList<T>
    implements Comparable<ComparableList<T>>
{
    // Compare two lists.  Returns -1 if this list is less than the list given
    // as argument, +1 if its greater and 0 if both lists contain the same
    // elements.  Nonempty lists are compared lexicographically.
    public int compareTo(ComparableList<T> comparableList) { 
        Iterator<T> iterFirst  = iterator();
        Iterator<T> iterSecond = comparableList.iterator();
        while (iterFirst.hasNext() && iterSecond.hasNext()) {
            T   first  = iterFirst .next();
            T   second = iterSecond.next();
            int cmp    = first.compareTo(second);
            if (cmp == 0) {
                continue;
            }
            return cmp;
        }
        if (iterFirst.hasNext()) {
            return 1;
        }       
        if (iterSecond.hasNext()) {
            return -1;
        }
        return 0;
    }
}
