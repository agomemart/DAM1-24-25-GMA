package ud6.gmaexamen.genericos;

import java.util.*;

//Adrián Gómez Martínez
public class UtilGenerico<T> {
    public static <T> List <T> repetidos(List<T> lista) {
        List<T> soloRepetidos = new ArrayList<>();

        for (T e : lista) {
            if (lista.indexOf(e) != lista.lastIndexOf(e)) {
                soloRepetidos.add(e);
            }
        }

        return soloRepetidos;
    }

    public static <T> Collection<T> filtrarMayores(Collection<T> coleccion, T valor, Comparator<T> comp) {
        Collection<T> res = new ArrayList<>();
        for (T e : coleccion) {
            if (comp.compare(e, valor) >= 0) {
                res.add(e);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] t = {1,3, 3, 4, 5, 5, 6};
        System.out.println(repetidos(Arrays.asList(t)));

        Comparator<Integer> comp = Comparator.naturalOrder();
        System.out.println(filtrarMayores(Arrays.asList(t), 4, comp));
    }
}
