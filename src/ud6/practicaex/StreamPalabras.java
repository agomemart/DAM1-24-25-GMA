package ud6.practicaex;

import java.util.ArrayList;
import java.util.List;

public class StreamPalabras {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(List.of("uno", "dos", "tres"));

        palabras.stream().filter(palabra -> palabra.startsWith("u")).forEach(System.out::println);

        List<String> palabrasMayusculas = palabras.stream().map(palabra -> palabra.toUpperCase()).toList();
        System.out.println(palabrasMayusculas);

        palabras.stream().sorted().forEach(System.out::println);
    }
}
