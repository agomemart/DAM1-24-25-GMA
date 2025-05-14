package ud6.practicaex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEliminar {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>(List.of(1, 2, 3, 4, 5, -5, -8, -6));
        Iterator<Integer> itNegativos = listaEnteros.iterator();
        while (itNegativos.hasNext()) {
            if (itNegativos.next() < 0) {
                itNegativos.remove();
            }
        }
        System.out.println(listaEnteros);
    }
}
