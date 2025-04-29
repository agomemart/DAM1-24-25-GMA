package ud6.practicaex;

import java.util.Arrays;
import java.util.function.Function;

public class TestTransformar {
    public static <T, V> V[] transformar(T[] t, V[] transf, Function<T, V> f) {
        for (int i = 0; i < t.length; i++) {
            transf[i] = f.apply(t[i]);
        }
        return transf;
    }

    public static void main(String[] args) {
        Integer[] t = {1, 2, 3, 4, 5};
        Integer[] resultado = new Integer[t.length];

        // Usar referencia a método estático
        transformar(t, resultado, ReferenciasMetodos::cubo);
        System.out.println(Arrays.toString(resultado)); // [1, 8, 27, 64, 125]
    }
}
