package ud6.practicaex;

import ud6.apuntescolecciones.Cliente;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("a", "b", "c");
        Stream<String> streamDeLista = lista.stream();

        Integer[] array = {1, 2, 3, 4, 5};
        Stream<Integer> streamDeArray = Arrays.stream(array);

        Stream<String> streamDirecto = Stream.of("uno", "dos", "tres");

        Stream<String> streamVacio = Stream.empty();

        List<String> palabras = Arrays.asList("dado", "arte", "bola", "asa", "buzo", "coche", "barco", "duna");

// Filtrar palabras que empiezan por 'a' y mostrarlas
        palabras.stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println); // arte, asa

// Ordenar alfabéticamente y mostrar
        palabras.stream()
                .sorted()
                .forEach(System.out::println);

// Obtener una lista de palabras en mayúsculas
        List<String> mayusculas = palabras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(mayusculas);

        Integer[] numeros = {4, 3, 7, 1, 0, 8, 9, 3, 5, 4, 2, 1, 4, 6, 8, 1, 0, 2, 3};
        Integer[] paresSinRepetidos = Arrays.stream(numeros)
                .distinct()
                .filter(x -> x % 2 == 0)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(paresSinRepetidos)); // [4, 0, 8, 2, 6]

        List<Integer> listaNumeros = Stream.of(2, 5, 1, 4, -6, -3, -3)
                .collect(Collectors.toList());

        Set<Integer> conjuntoNumeros = Stream.of(5, 1, 2, 6, 3, 9, 4, 1, 7, 3, 5)
                .collect(Collectors.toSet());

        Map<Integer, Integer> mapa = Stream.of(1, 2, 3, 4)
                .collect(Collectors.toMap(i -> i, i -> i + 10));

        System.out.println(listaNumeros);
        System.out.println(conjuntoNumeros);
        System.out.println(mapa);

        // Suponiendo clase Cliente con atributos dni y nombre
        Cliente[] tClie = {
                new Cliente("111", "Marta", "12/02/2000"),
                new Cliente("115", "Jorge", "16/03/1999"),
                new Cliente("112", "Carlos", "01/10/2002"),
                new Cliente("211", "Ana", "07/12/2001")
        };

        Map<String, String> mapaClientes = Arrays.stream(tClie)
                .collect(Collectors.toMap(c -> c.getDni(), c -> c.getNombre()));

        String nombres = Arrays.stream(tClie)
                .map(c -> c.getNombre())
                .collect(Collectors.joining(", "));

        System.out.println(mapaClientes);
        System.out.println(nombres); // Marta, Jorge, Carlos, Ana

    }
}
