package ud6.practicaex;
import java.util.Collection;
import java.util.*;

public class UtilGenericos <T> {
    public List<T> repetidos(List<T> lista) {
        Set<T> elementosVistos = new HashSet<>();
        Set<T> duplicados = new HashSet<>();
        for (T elemento : lista) {
            if (elementosVistos.contains(elemento) && !duplicados.contains(elemento)) {
                duplicados.add(elemento);
            } else {
                elementosVistos.add(elemento);
            }
        }
        return new ArrayList<>(duplicados);
    }

    public Collection<T> filtrarMayores(Collection<T> coleccion, T elemento, Comparator<T> comp) {
        Collection<T> mayores = new ArrayList<>();
        for (T elem : coleccion) {
            if(comp.compare(elem, elemento) >= 0) {
                mayores.add(elem);
            }
        }
        return mayores;
    }
}
