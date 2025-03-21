package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;

public class InvertirArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(99);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(invertido));
    }
}
