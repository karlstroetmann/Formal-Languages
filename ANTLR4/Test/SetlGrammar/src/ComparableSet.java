import java.util.*;

//Klasse fuer die Comparable Sets
public class ComparableSet<T extends Comparable<? super T>> 
    implements Comparable<ComparableSet<T>>, 
               Iterable<T>
{
    // The set that is represented.
    protected TreeSet<T> mSet;

    public TreeSet<T> getSet() {
        return mSet;
    }
    
    // Generate a new empty set.
    public ComparableSet() {
        mSet = new TreeSet<T>();
    }
    
    // Type conversion.  Transforms an ordinary TreeSet into a ComparableSet.
    public ComparableSet(TreeSet<T> set) {
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
    
	@SuppressWarnings("unchecked")
	public boolean equals(Object x) {
        if (x instanceof ComparableSet) {
            ComparableSet cmpSet = (ComparableSet) x;
            TreeSet       set    = (TreeSet) (cmpSet.mSet);
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

    // Return some element from this set.
    public T any() {
        return mSet.first();
    }

    // Returns true if element is a member of this set.
    public boolean member(T element) {
        return mSet.contains(element);
    }

    // Returns true if mSet is a subset of the set given as argument.
    public boolean isSubset(ComparableSet<T> set) {
        return set.getSet().containsAll(mSet);
    }
    
    public T get(int i) {
        Object[] array = mSet.toArray();

        return (T)array[i];
    }

    // Compare two sets.  Returns -1 if this set is less than the set given
    // as argument, +1 if its greater and 0 if both sets contain the same
    // elements.  Nonempty sets are compared by comparing the elements
    // lexicographically.
    public int compareTo(ComparableSet<T> comparableSet) {
        TreeSet<T>  set        = comparableSet.getSet();
        Iterator<T> iterFirst  = mSet.iterator();
        Iterator<T> iterSecond =  set.iterator();
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

    // Returns the union of this set and the set given as argument.  Takes
    // care to leave both the set given as argument and mSet untouched.
    public ComparableSet<T> union(ComparableSet<T> comparableSet) {
        TreeSet<T> union = new TreeSet<T>(mSet);
        union.addAll(comparableSet.getSet());
        return new ComparableSet<T>(union);
    }

    // Returns the intersection of this set and the set given as argument.
    // Takes care to leave both the set given as argument and mSet untouched.
    public ComparableSet<T> intersection(ComparableSet<T> comparableSet) {
        TreeSet<T> intersection = new TreeSet<T>(mSet);
        intersection.retainAll(comparableSet.getSet());
        return new ComparableSet<T>(intersection);
    }

    // Returns the difference of this set and the set given as argument.
    // Takes care to leave both the set given as argument and mSet untouched.
    public ComparableSet<T> difference(ComparableSet<T> comparableSet) {
        TreeSet<T> difference = new TreeSet<T>(mSet);
        difference.removeAll(comparableSet.getSet());
        return new ComparableSet<T>(difference);
    }

    // Returns the cartesian product of this set and the set given as argument.
    // Takes care to leave both the argument and mSet untouched.
    public <S extends Comparable<? super S>> ComparableSet<Pair<T, S>> product(
    		   ComparableSet<S> comparableSet) {
    		  TreeSet<Pair<T, S>> product = new TreeSet<Pair<T, S>>();
    		  for (T x : mSet) {
    		   for (S y : comparableSet.getSet()) {
    		    product.add(new Pair<T, S>(x, y));
    		   }
    		  }
    		  return new ComparableSet<Pair<T, S>>(product);
    }
    
    // Compute the power set of this set. 
    public ComparableSet<ComparableSet<T>> powerSet() {
        return new ComparableSet<ComparableSet<T>>(powerSet(mSet));
    }   
 
    // Compute the power set of the given argument according to the
    // following recursive equations:
    //     power({}) = { {} }
    //     power(A + {x}) = power(A) + { {x} + s : s in power(A) }
    private TreeSet<ComparableSet<T>> powerSet(TreeSet<T> set) {
        if (set.isEmpty()) {
            TreeSet<ComparableSet<T>> power = new TreeSet<ComparableSet<T>>();
            ComparableSet<T>          empty = new ComparableSet<T>();
            power.add(empty);
            return power;
        }
        T          last = set.last();
        TreeSet<T> rest = (TreeSet<T>) set.headSet(last);
        TreeSet<ComparableSet<T>> powerRest = powerSet(rest);
        TreeSet<ComparableSet<T>> powerSet  = cloneSet(powerRest);
        addElement(powerRest, last);
        powerSet.addAll(powerRest);
        return powerSet;
    }
    // Add the given element to all sets that are member of the set setOfSets.
    private void addElement(TreeSet<ComparableSet<T>> setOfSets, T element) 
    {
        for (ComparableSet<T> set: setOfSets) {
            set.add(element);
        }
    }
    // Create a deep copy of the given set.  It is important that the sets contained
    // in the given set are copied themselves.
    private TreeSet<ComparableSet<T>> cloneSet(TreeSet<ComparableSet<T>> set) {
        TreeSet<ComparableSet<T>> result = new TreeSet<ComparableSet<T>>();
        for (ComparableSet<T> s: set) {
            result.add(s.deepCopy());
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
        TreeSet<T> set = new TreeSet<T>();
        set.add(element);
        return new ComparableSet<T>(set);
    }

    // Creates a set containing the given elements.
    public static <T extends Comparable<? super T>> ComparableSet<T> 
        doubleton(T first, T second) 
    {
        TreeSet<T> set = new TreeSet<T>();
        set.add(first);
        set.add(second);
        return new ComparableSet<T>(set);
    }

    // Returns the set of all numbers between low and high inclusive.
    public static ComparableSet<Integer> range(int low, int high) {
        ComparableSet<Integer> result = new ComparableSet<Integer>();
        for (int i = low; i <= high; ++i) {
            result.add(i);
        }
        return result;
    }

    // Returns the relational product of R1 and R2.  The set theoretical
    // definition is:
    //     R1 * R2 = { [x,z] | exists y : [x,y] in R1, [y,z] in R2 }
    public static <U extends Comparable<? super U>, 
                   V extends Comparable<? super V>, 
                   W extends Comparable<? super W>> ComparableSet<Pair<U,W>> 
        compose(ComparableSet<Pair<U,V>> R1, ComparableSet<Pair<V,W>> R2) 
    {
        ComparableSet<Pair<U,W>> result = new ComparableSet<Pair<U,W>>();
        for (Pair<U,V> xy: R1) {
            for (Pair<V,W> yz: R2) {
                if (xy.getSecond().equals(yz.getFirst())) {
                    result.add(new Pair<U,W>(xy.getFirst(), yz.getSecond()));
                }
            }
        }    
        return result;
    }

    // Produces the set containing those elements for which selector yields
    // true, i.e. the set
    //     { x in mSet | selector.select(x) }
    public ComparableSet<T> select(Selector<T> selector) {
        TreeSet<T> result = new TreeSet<T>();
        for (T element: mSet) {
            if (selector.select(element)) {
                result.add(element);
            }
        }
        return new ComparableSet<T>(result);
    }

    // Produces the image set resulting from the application of the given
    // transformer to mSet, i.e. the set 
    //        { Transformer.transform(x) : x in mSet }
    public <S extends Comparable<? super S>> ComparableSet<S> 
        transform(Transformer<S, T> transformer) 
    {
        TreeSet<S> result = new TreeSet<S>();
        for (T element: mSet) {
            result.add(transformer.transform(element));
        }
        return new ComparableSet<S>(result);
    }

    // Combine two sets using a combinator.  This produces the set
    //    { combinator.combine(x, y) : x in s1, y in s2 }
    public static <T extends Comparable<? super T>, 
                   X extends Comparable<? super X>, 
                   Y extends Comparable<? super Y>> ComparableSet<T>
    combineSets(ComparableSet<X> S1, 
                ComparableSet<Y> S2, 
                Combinator<T,X,Y> combinator) 
    {
        TreeSet<T> result = new TreeSet<T>();
        for (X x: S1) {
            for (Y y: S2) {
                result.add(combinator.combine(x, y));
            }
        }
        return new ComparableSet<T>(result);
    }
}
    
    