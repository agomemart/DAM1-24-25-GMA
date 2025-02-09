package ud4.arraysejercicios;
/*
* Contar el número de elementos positivos, negativos y ceros en un array de 10 enteros.
* */
import java.util.Arrays;
import java.util.Random;

public class EjArrays05 {
    public static void main(String[] args) {
        Random random = new Random();
        int j = 0;
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        int[] t = new int[10];
        for (int i = 0; i < t.length; i++) {
            j = random.nextInt(-10, 10);
            t[i] = j;
            if (t[i] > 0) {
                positivos++;
            } else if(t[i] < 0) {
                negativos++;
            } else {
                cero++;
            }
        }
        System.out.println(Arrays.toString(t));
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + cero);
    }
}
