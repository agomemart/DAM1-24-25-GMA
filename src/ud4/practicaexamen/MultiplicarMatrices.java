package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicarMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];

        System.out.print("Inserta los datos de la matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Inserta los datos de la matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < matriz2[i].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz 1: " + Arrays.deepToString(matriz1));
        System.out.println("Matriz 2: " + Arrays.deepToString(matriz2));
        System.out.println("Resultado: " + Arrays.deepToString(resultado));
    }
}
