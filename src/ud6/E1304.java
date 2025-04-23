package ud6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class E1304 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        List<Integer> numerosLista = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            int rnd = (int) (Math.random() * 20 + 1);
            numeros[i] = rnd;
            numerosLista.add(rnd);
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("Filtrando múltiplos de 3:");
        Integer[] multiplos3 = filtar(numeros, n -> n % 3 == 0);
        System.out.println(Arrays.toString(multiplos3));

        System.out.println("Filtrando pares de la lista:");
        List<Integer> numerosPares = filtar(numerosLista, n -> n % 2 == 0);
        System.out.println(numerosPares);

    }

    static <T> T[] filtar(T[] t, Predicate<T> p) {
        T [] tn = Arrays.copyOf(t, 0);

        for (T e : t) {
            if (p.test(e)) {
                tn = Arrays.copyOf(tn, tn.length + 1);
                tn [tn.length - 1] = e;
            }
        }

        return tn;
    }

    static <T> List<T> filtar(List<T> l, Predicate<T> p) {
        List<T> lista = new ArrayList<T>();

        for (T e : l) {
            if (p.test(e)) {
                lista.add(e);
            }
        }
        return lista;
    }
}
