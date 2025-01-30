package ud4.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
* Escribe un programa en Java que lea una matriz de enteros de 3 filas y 3 columnas del usuario y
* luego calcule la suma de todos los elementos de la matriz.
* */
public class EjArrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaElementos = 0;

        System.out.println("Introduzca elementos para completar la matriz 3x3: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
                sumaElementos += matriz[i][j];
            }
        }

        System.out.println("Matriz 3x3: " + Arrays.deepToString(matriz));
        System.out.println("Suma de la matriz 3x3: " + sumaElementos);
    }
}
