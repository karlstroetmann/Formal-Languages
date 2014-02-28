import java.util.*;

public interface Producer<T> { 
    TreeSet<T> produce(T x);
}