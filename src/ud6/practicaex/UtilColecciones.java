package ud6.practicaex;

import java.util.*;
import java.util.Collection;

public class UtilColecciones <T> {
    public List<T> duplicados(List<T> lista) {
        Set<T> vistos = new HashSet<>();
        Set<T> duplicados = new HashSet<>();
        for (T e : lista) {
            if (!vistos.add(e)) {
                duplicados.add(e);
            }
        }
        return new ArrayList<>(duplicados);
    }
    public static <T> Collection<T> filtrarMenores(Collection<T> coleccion, T valor, Comparator<T> comp) {
        Collection<T> menores = new ArrayList<>();
        for (T e : coleccion) {
            if (comp.compare(e, valor) <= 0) {
                menores.add(e);
            }
        }
        return menores;
    }
}
