package ud6.practicaex;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDuplicados {
    public static void main(String[] args) {
        Set<Integer> conjuntoEnteros = new HashSet<>();
        conjuntoEnteros.add(1);
        conjuntoEnteros.add(1);
        conjuntoEnteros.add(2);

        System.out.println(conjuntoEnteros);
    }
}
