package ud6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class E1210 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Collection<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }

        Integer[] t = numeros.toArray(new Integer[0]);

        Integer[] temp = new Integer[t.length];
        int contador = 0;

        for (int i = 0; i < t.length; i++) {
            boolean encontrado = false;

            for (int j = 0; j < contador; j++) {
                if (t[i] == temp[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                temp[contador] = t[i];
                contador++;
            }
        }

        Collection<Integer> sinRepetir = Arrays.asList(t);
        Collection<Integer> repetidos = Arrays.asList(temp);

    }
}
