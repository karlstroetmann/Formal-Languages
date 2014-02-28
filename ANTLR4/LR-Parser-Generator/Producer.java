import java.util.*;

public interface Producer<T> { 
    Set<T> produce(T x);
}