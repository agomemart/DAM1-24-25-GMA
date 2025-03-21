package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MayorYMenor {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];
        int max = 0;
        int min = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(99);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("El mayor de los elementos es: " + max);
        System.out.println("El menor de los elementos es: " + min);
    }
}
