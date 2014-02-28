public interface Transformer<S extends Comparable<? super S>, 
                             T extends Comparable<? super T>> 
{
    // Transforms elements of class T into elements of type S.
    public S transform(T x);
}
