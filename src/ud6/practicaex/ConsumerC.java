package ud6.practicaex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public interface ConsumerC<T> {
    void accept(T t);

    public static void main(String[] args) {
        Consumer<String> printUpperCase = str ->
                System.out.println(str.toUpperCase());
        printUpperCase.accept("hola mundo");

        List<String> lista = Arrays.asList("Uno", "Dos", "Tres");
        lista.forEach(s -> System.out.println(s.toUpperCase()));

        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
        printUpperCase.andThen(printLowerCase).accept("Hola Mundo");
    }
}
