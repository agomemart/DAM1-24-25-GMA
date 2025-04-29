package ud6.practicaex;

import java.util.*;

public class Conjunto {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listaEnteros.add(rnd.nextInt(10) + 1);
        }

        Set<Integer> conjunto = new LinkedHashSet<>(listaEnteros);
        listaEnteros = new ArrayList<>(new LinkedHashSet<>(listaEnteros));
        System.out.println(listaEnteros);

    }
}
