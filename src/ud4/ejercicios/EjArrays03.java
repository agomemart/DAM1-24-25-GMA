package ud4.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
* Leer por teclado la nota de los alumnos de una clase y calcular la nota media del grupo.
Mostrar los alumnos con notas superiores a la media
* */
public class EjArrays03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[10];
        double media = 0;
        int totalNotas = 0;
        int contador = 0;

        System.out.print("Ingrese 10 notas: ");

        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
            totalNotas += t[i];
        }
        sc.close();
        
        media = (double) totalNotas / t.length;

        for (int j : t) {
            if (j > media) {
                contador++;
            }
        }

        int[] supMedia = new int[contador];
        int k = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > media) {
                supMedia[k] = t[i];
                k++;
            }
        }

        System.out.println("La media es: " + media);
        System.out.println("Las notas superiores a la media son: " + Arrays.toString(supMedia));
    }
}