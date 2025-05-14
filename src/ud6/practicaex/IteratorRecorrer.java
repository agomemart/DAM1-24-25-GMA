package ud6.practicaex;

import java.util.Iterator;
import java.util.List;

public class IteratorRecorrer {
    public static void main(String[] args) {
        List<Integer> listaEnteros = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> it = listaEnteros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
