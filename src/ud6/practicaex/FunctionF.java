package ud6.practicaex;

import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface FunctionF<T, R>  {
    R apply(T t);

    public static void main(String[] args) {
        Function<String, Integer> longitud = s -> s.length();
        System.out.println(longitud.apply("Hola"));

        List<String> palabras = Arrays.asList("Java", "Stream", "Lambda");
        List<Integer> longitudes = palabras.stream().map(longitud).collect(Collectors.toList());
        System.out.println(longitudes);
    }
}
