package ud4.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
* Escribe un programa en Java que reciba un número entero n y genere una matriz identidad de tamaño n x n.
* */
public class EjArrays12b_MatrizIdentidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa de que longitud quieres la matriz identidad: ");
        int longitud = sc.nextInt();

        int[][] matrizIdentidad = new int[longitud][longitud];

        Random rnd = new Random();
        for (int i = 0; i < matrizIdentidad.length; i++) {
            matrizIdentidad[i][i] = rnd.nextInt(100);  // La diagonal principal es 1, el resto ya es 0 por defecto
        }

        System.out.println("La matriz identidad es: " + Arrays.deepToString(matrizIdentidad));
    }
}
