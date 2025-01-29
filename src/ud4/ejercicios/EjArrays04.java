package ud4.ejercicios;

import java.util.Arrays;
import java.util.Random;

/*
 * Guardar en un array los 20 primeros números pares
 */
public class EjArrays04 {
    public static void main(String[] args) {
        Random random = new Random();
        int j = 0;
        int[] t = new int[20];
        for (int i = 0; i < t.length; i++) {
            j = random.nextInt(1,100);
            if (j % 2 == 0) {
                t[i] = j;
            }
        }
        System.out.println("Los 20 primeros numeros pares son: " + Arrays.toString(t));
    }
}