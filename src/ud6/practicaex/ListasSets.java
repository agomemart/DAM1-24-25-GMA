package ud6.practicaex;

import java.util.*;

public class ListasSets {
    public static Set<String> obtenerNombresUnicosOrdenados(List<String> nombres) {
        return new TreeSet<>(nombres);
    }

    public static void main(String[] args) {
        List<String> nombres = List.of("Luis", "Ana", "Ana", "Luis", "Ana", "Luis", "Ana", "Luis");
        Set<String> nombresUnicosOrdenados = obtenerNombresUnicosOrdenados(nombres);
        System.out.println(nombresUnicosOrdenados);
    }
}
