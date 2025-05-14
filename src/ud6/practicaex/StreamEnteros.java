package ud6.practicaex;

import java.util.ArrayList;
import java.util.List;

public class StreamEnteros {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        listaEnteros.stream().forEach(System.out::println);

        listaEnteros.stream().filter(n -> n % 2 == 0);

        List<Integer> listaPares = listaEnteros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(listaPares);

        List<Integer> listaCuadrados = listaEnteros.stream().map(n -> n * n).toList();
        System.out.println(listaCuadrados);
    }
}
