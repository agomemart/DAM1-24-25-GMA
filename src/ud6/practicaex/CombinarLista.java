package ud6.practicaex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinarLista {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);
        lista2.add(10);

        Set<Integer> combinadas = new HashSet<>(lista1);
        combinadas.addAll(lista2);

        System.out.println(combinadas);

    }
}
