public interface Selector<T> 
{
    // This predicate is used to pick elements form a given set.
    public boolean select(T element);
}
