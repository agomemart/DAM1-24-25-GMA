package ud4.ejercicios;

import java.util.Arrays;
import java.util.Random;

/*
* Llenar un array con números aleatorios.
* */
public class EjArrays09 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
    }
}
