package ejrec;

import java.util.Scanner;

public class ManipulacionMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano = 3;
        int sumaDiagonal = 0;

        int[][] matriz = new int[tamano][tamano];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print("Inserta el valor de la fila " + (i + 1) + " columna " + (j + 1));
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaDiagonal += matriz[i][i];
            }
        }

        System.out.println("Suma diagonal principal: " + sumaDiagonal);

        for (int i = 0; i < matriz.length; i++) {
            int maxFila = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxFila) {
                    maxFila = matriz[i][j];
                }
            }
            System.out.println("Maximo fila " + (i + 1) + maxFila);
        }
    }
}
