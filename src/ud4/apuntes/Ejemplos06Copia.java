package ud4.apuntes;

import java.util.Arrays;

public class Ejemplos06Copia {
    public static void main(String[] args) {
        int[] t1 = {5, 7, 2, 9, 3};
        int[] t2 = new int[t1.length];

        /*for(int i = 0; i < t1.length; i++) {
            t2[i] = t1[i];
        }*/
        t1 = Arrays.copyOf(t2, t1.length + 1);
        t1[t1.length -1] = 66;

        System.out.println("Fin");
    }
}
