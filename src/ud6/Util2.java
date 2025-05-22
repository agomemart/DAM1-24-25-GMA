package ud6;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Utilidades genéricas para trabajar con colecciones en Java.
 * Incluye métodos de ordenación, filtrado, transformación y combinaciones.
 */
public class Util2 {

    private Util2() {
        // Constructor privado para evitar instanciación
    }

    /**
     * Ordena una lista en orden ascendente según su orden natural.
     */
    public static <T extends Comparable<? super T>> void sortNatural(List<T> lista) {
        Collections.sort(lista);
    }

    /**
     * Ordena una lista en orden descendente según su orden natural.
     */
    public static <T extends Comparable<? super T>> void sortReversed(List<T> lista) {
        Collections.sort(lista, Collections.reverseOrder());
    }

    /**
     * Ordena una lista usando el comparador dado.
     */
    public static <T> void sort(List<T> lista, Comparator<? super T> cmp) {
        Collections.sort(lista, cmp);
    }

    /**
     * Ordena en orden descendente usando el comparador dado.
     */
    public static <T> void sortDescending(List<T> lista, Comparator<? super T> cmp) {
        Collections.sort(lista, cmp.reversed());
    }

    /**
     * Invierte el orden de la lista in-place.
     */
    public static void reverse(List<?> lista) {
        Collections.reverse(lista);
    }

    /**
     * Mezcla aleatoriamente los elementos de la lista.
     */
    public static void shuffle(List<?> lista) {
        Collections.shuffle(lista);
    }

    /**
     * Rota la lista desplazando los elementos por distancia.
     */
    public static <T> void rotate(List<T> lista, int distancia) {
        Collections.rotate(lista, distancia);
    }

    /**
     * Intercambia dos posiciones en la lista.
     */
    public static <T> void swap(List<T> lista, int i, int j) {
        Collections.swap(lista, i, j);
    }

    /**
     * Copia el contenido de src en dest (mismo tamaño).
     */
    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        Collections.copy(dest, src);
    }

    /**
     * Rellena la lista con el objeto dado.
     */
    public static <T> void fill(List<? super T> lista, T obj) {
        Collections.fill(lista, obj);
    }

    /**
     * Devuelve el mayor elemento según orden natural.
     */
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        return Collections.max(coll);
    }

    /**
     * Devuelve el menor elemento según orden natural.
     */
    public static <T extends Comparable<? super T>> T min(Collection<? extends T> coll) {
        return Collections.min(coll);
    }

    /**
     * Devuelve el máximo elemento según el comparador.
     */
    public static <T> T max(Collection<? extends T> coll, Comparator<? super T> cmp) {
        return Collections.max(coll, cmp);
    }

    /**
     * Devuelve el mínimo elemento según el comparador.
     */
    public static <T> T min(Collection<? extends T> coll, Comparator<? super T> cmp) {
        return Collections.min(coll, cmp);
    }

    /**
     * Cuenta las apariciones de un elemento en una colección.
     */
    public static <T> int countOccurrences(Collection<T> coll, T elem) {
        return Collections.frequency(coll, elem);
    }

    /**
     * Filtra una colección devolviendo sólo los que cumplan el predicado.
     */
    public static <T> List<T> filter(Collection<T> coll, Predicate<? super T> pred) {
        List<T> res = new ArrayList<>();
        for (T e : coll) {
            if (pred.test(e)) {
                res.add(e);
            }
        }
        return res;
    }

    /**
     * Transforma los elementos de una colección mediante la función dada.
     */
    public static <T,R> List<R> map(Collection<T> coll, Function<? super T,? extends R> func) {
        List<R> res = new ArrayList<>(coll.size());
        for (T e : coll) {
            res.add(func.apply(e));
        }
        return res;
    }

    /**
     * Une dos listas en una nueva lista.
     */
    public static <T> List<T> concat(List<? extends T> a, List<? extends T> b) {
        List<T> res = new ArrayList<>(a);
        res.addAll(b);
        return res;
    }

    /**
     * Obtiene la intersección de dos colecciones.
     */
    public static <T> Set<T> intersection(Collection<T> a, Collection<T> b) {
        Set<T> res = new HashSet<>(a);
        res.retainAll(b);
        return res;
    }

    /**
     * Obtiene la unión de dos colecciones.
     */
    public static <T> Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
        Set<T> res = new HashSet<>(a);
        res.addAll(b);
        return res;
    }

    /**
     * Obtiene la diferencia (a - b).
     */
    public static <T> Set<T> difference(Collection<T> a, Collection<T> b) {
        Set<T> res = new HashSet<>(a);
        res.removeAll(b);
        return res;
    }

    /**
     * Convierte una lista en un mapa index->elemento.
     */
    public static <T> Map<Integer,T> toIndexMap(List<T> lista) {
        Map<Integer,T> res = new LinkedHashMap<>();
        for (int i = 0; i < lista.size(); i++) {
            res.put(i, lista.get(i));
        }
        return res;
    }

    /**
     * Agrupa elementos por clave obtenida con la función keyExtractor.
     */
    public static <T,K> Map<K,List<T>> groupBy(Collection<T> coll, Function<? super T,? extends K> keyExtractor) {
        Map<K,List<T>> res = new LinkedHashMap<>();
        for (T e : coll) {
            K key = keyExtractor.apply(e);
            res.computeIfAbsent(key, k -> new ArrayList<>()).add(e);
        }
        return res;
    }
}
