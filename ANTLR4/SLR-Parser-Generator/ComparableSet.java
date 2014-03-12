import java.util.*;

public class ComparableSet<T extends Comparable<? super T>> 
    implements Comparable<ComparableSet<T>>, 
               Iterable<T>
{
    // The set that is represented.
    protected Set<T> mSet;

    public Set<T> getSet() {
        return mSet;
    }
    
    // Generate a new empty set.
    public ComparableSet() {
        mSet = new TreeSet<T>();
    }
    
    // Type conversion.  Transforms an ordinary Set into a ComparableSet.
    public ComparableSet(Set<T> set) {
        mSet = set; 
    }
    
    // Construct a new set containing the same elements as this set.
    public ComparableSet<T> deepCopy() {
        return new ComparableSet<T>(new TreeSet<T>(mSet));
    }

    // Tests if this set is empty.
    public boolean isEmpty() {
        return mSet.isEmpty();
    }

    // Add the given element to this set.
    public boolean add(T element) {
        return mSet.add(element);
    }
    
    public boolean equals(Object x) {
        if (x instanceof ComparableSet) {
            ComparableSet cmpSet = (ComparableSet) x;
            Set           set    = (cmpSet.mSet);
            return mSet.equals(set);
        }
        return false;
    }

    public Iterator<T> iterator() {
        return mSet.iterator();
    }

    // Return the number of elements of this set.
    public int size() {
        return mSet.size();
    }

    // Dispose all elements of this set.
    public void clear() {
        mSet.clear();
    }

    // Returns true if element is a member of this set.
    public boolean member(T element) {
        return mSet.contains(element);
    }

    // Returns true if mSet is a subset of the set given as argument.
    public boolean isSubset(ComparableSet<T> set) {
        return set.getSet().containsAll(mSet);
    }
    
    // Compare two sets.  Returns -1 if this set is less than the set given
    // as argument, +1 if its greater and 0 if both sets contain the same
    // elements.  Nonempty sets are compared by comparing the elements
    // lexicographically.
    public int compareTo(ComparableSet<T> comparableSet) {
        Set<T>  set        = comparableSet.getSet();
        Iterator<T> iterFirst  = mSet.iterator();
        Iterator<T> iterSecond =  set.iterator();
        while (iterFirst.hasNext() && iterSecond.hasNext()) {
            T   first  = iterFirst .next();
            T   second = iterSecond.next();
            int cmp    = first.compareTo(second);
            if (cmp != 0) {
                return cmp;
            }
        }
        if (iterFirst.hasNext()) {
            return 1;
        }       
        if (iterSecond.hasNext()) {
            return -1;
        }
        return 0;
    }

    // Returns the union of this set and the set given as argument.  Takes
    // care to leave both the set given as argument and mSet untouched.
    public ComparableSet<T> union(ComparableSet<T> comparableSet) {
        Set<T> union = new TreeSet<T>(mSet);
        union.addAll(comparableSet.getSet());
        return new ComparableSet<T>(union);
    }

    // Returns the intersection of this set and the set given as argument.
    // Takes care to leave both the set given as argument and mSet untouched.
    public ComparableSet<T> intersection(ComparableSet<T> comparableSet) {
        Set<T> intersection = new TreeSet<T>(mSet);
        intersection.retainAll(comparableSet.getSet());
        return new ComparableSet<T>(intersection);
    }

    // Returns the difference of this set and the set given as argument.
    // Takes care to leave both the set given as argument and mSet untouched.
    public ComparableSet<T> difference(ComparableSet<T> comparableSet) {
        Set<T> difference = new TreeSet<T>(mSet);
        difference.removeAll(comparableSet.getSet());
        return new ComparableSet<T>(difference);
    }

    // Create a deep copy of the given set.  It is important that the sets contained
    // in the given set are copied themselves.
    private Set<ComparableSet<T>> cloneSet(Set<ComparableSet<T>> set) {
        Set<ComparableSet<T>> result = new TreeSet<ComparableSet<T>>();
        for (ComparableSet<T> s: set) {
            result.add(s.deepCopy());
        }
        return result;
    }

    // Diese Funktion wandelt die Menge in einen String um.  Nach jedem Element erfolgt 
    // ein Zeilenumbruch. Das Argument indent gibt an, um wieviel die einzelnen Zeilen 
    // eingerueckt werden sollen
    public String toString(int indent) {
    Object[] elements = mSet.toArray();
    String result = "{ ";
    String indentation = "";
    for (int i = 0; i < indent; ++i) {
        indentation += " "; 
    }
    for (int i = 0; i < elements.length; ++i) {
        if (i > 0) {
        result += indentation + "  ";
        }
        result += elements[i];
        if (i < elements.length - 1) {
        result += ",\n";
        }
    }
    if (elements.length > 1) {
        result += "\n" + indentation + "}";
    } else if (elements.length == 1) {
        result += " }";
    } else {
        result += "}";
    }
        return result;
    }

    public String toString() {
        return mSet.toString();
    }

    // Creates a set containing the given element.
    public static <T extends Comparable<? super T>> ComparableSet<T> 
        singleton(T element) 
    {
        Set<T> set = new TreeSet<T>();
        set.add(element);
        return new ComparableSet<T>(set);
    }

    // This method computes the smallest set M such that
    //   1. s <= M
    //   2. +/ { p(x) : x in M } <= M
    public static <S> Set<S> fixpoint(Producer<S> p, Set<S> s) {
        Set<S> newElements = new TreeSet<S>();
        newElements.addAll(s);
        while (!newElements.isEmpty()) {
            Set<S> moreElements = new TreeSet<S>();
            for (S x: newElements) {
                Set<S> found = p.produce(x);
                for (S y: found) {
                    if (s.add(y)) {
                        moreElements.add(y);
                    }
                }
            }
            newElements = moreElements;
        }
        return s;
    }
}
    
    
