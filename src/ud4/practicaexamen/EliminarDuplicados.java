package ud4.practicaexamen;

import java.util.Random;

public class EliminarDuplicados {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(99);
        }

        int[] array2 = new int[10];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array2[j++] = array[i];
            }
        }
        array2[j++] = array[array.length - 1];

        int[] resultado = new int[j];
        for (int i = 0; i < j; i++) {
            resultado[i] = array2[i];
        }
        System.out.println(resultado);
    }
}
