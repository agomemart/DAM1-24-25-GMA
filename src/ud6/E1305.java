package ud6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class E1305 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        List<Integer> numerosLista = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            int rnd = (int) (Math.random() * 20 + 1);
            numeros[i] = rnd;
            numerosLista.add(rnd);
        }

        Double[] raices;
        raices = transformar(numeros, new Double[0], n -> Math.sqrt(n));
        System.out.println(Arrays.toString(raices));

        List<Double> raicesCuadradas = transformar(numerosLista, x -> Math.sqrt(x));
        System.out.println(raicesCuadradas);
    }

    static <T, V> V[] transformar(T[] t, V[] transf, Function<T, V> f) {
        transf = Arrays.copyOf(transf, t.length);
        for (int i = 0; i < t.length; i++) {
            transf[i] = f.apply(t[i]);
        }
        return transf;
    }

    static <T, V> List<V> transformar (List<T> t, Function<T, V> f) {
        List<V> lista = new ArrayList<>();
        for (T e : t) {
            lista.add(f.apply(e));
        }
        return lista;
    }
}
