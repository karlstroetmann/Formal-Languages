public interface Combinator<T, X, Y>
{
    // Combine two elements to produce a new element.
    public T combine(X x, Y y);
}
