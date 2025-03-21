package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;

public class OrdenarArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(99);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
