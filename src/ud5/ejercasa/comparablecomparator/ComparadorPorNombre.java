package ud5.ejercasa.comparablecomparator;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Producto producto1 = (Producto) o1;
        Producto producto2 = (Producto) o2;
        return producto1.getNombre().compareTo(producto2.getNombre());
    }
}
