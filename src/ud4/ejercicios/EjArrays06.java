package ud4.ejercicios;

import java.util.Scanner;

/*
* Leer 10 enteros y mostrar la media de los valores negativos y la de los positivos
* */
public class EjArrays06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[10];
        int positivos = 0;
        int negativos = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
            if (t[i] > 0) {
                sumaPositivos += t[i];
                positivos++;
            } else {
                sumaNegativos += t[i];
                negativos++;
            }
        }
        double mediaPositivos = (double)sumaPositivos / positivos;
        double mediaNegativos = (double)sumaNegativos / negativos;

        System.out.println("Media de los positivos: " + mediaPositivos);
        System.out.println("Media de los negativos: " + mediaNegativos);
    }
}
