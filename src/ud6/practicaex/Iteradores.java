package ud6.practicaex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteradores {
    public static void eliminarImpares(List<Integer> numeros) {
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 != 0) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        eliminarImpares(numeros);
        System.out.println(numeros);
    }
}
