package ud4.apuntes;

import java.util.Arrays;

public class InsercionOrdenada {
    public static void main(String[] args) {
        int[] t = {1, 6, 2, 8, 3, 9, 7, 6};

        Arrays.sort(t);

        System.out.println(Arrays.toString(t));

        int valor = 6;

        t= insertarOrdenado(t, valor);

        System.out.println(Arrays.toString(t));
    }
    public static int[] insertarOrdenado(int[] t, int num) {
        int[] tRes = new int[t.length + 1];

        int posicion = Arrays.binarySearch(t, num);
        if (posicion < 0) {
            posicion = -posicion -1;
        }
        System.arraycopy(t, 0, tRes, num, posicion);
        tRes[posicion] = num;
        System.arraycopy(t, posicion, tRes, posicion + 1, t.length - posicion);

        return tRes;
    }
}
