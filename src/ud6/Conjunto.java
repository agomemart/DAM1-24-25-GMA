package ud6;

import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> union = new TreeSet<>(conjunto1);
        union.addAll(conjunto2);
        return union;
    }
    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> union = new TreeSet<>(conjunto1);
        union.retainAll(conjunto2);
        return union;
    }
    static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> union = new TreeSet<>(conjunto1);
        union.removeAll(conjunto2);
        return union;
    }
}
