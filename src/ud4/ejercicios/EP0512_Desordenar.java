package ud4.ejercicios;

import java.util.Arrays;
import java.util.Random;

/*
 *  Escribe la función void desordenar(int t[]), que cambia de forma 
aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo. 
 */
public class EP0512_Desordenar {
    static void desordenar(int t[]) {
        Random random = new Random();
        
        for(int i = t.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int intercambio = t[i];
            t[i] = t[j];
            t[j] = intercambio;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array original:");
        System.out.println(Arrays.toString(array));

        System.out.println("Array desordenado:");
        desordenar(array);
        System.out.println(Arrays.toString(array));
    }
}
