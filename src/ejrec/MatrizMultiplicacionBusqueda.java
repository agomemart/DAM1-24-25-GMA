package ejrec;

import java.util.Random;
import java.util.Scanner;

public class MatrizMultiplicacionBusqueda {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(1, 100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            int multiplicacionFila = 1;
            for (int j = 0; j < matriz[i].length; j++) {
                multiplicacionFila *= matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + multiplicacionFila);
        }

        System.out.print("Introduce el numero a buscar: ");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Numero encontrado en la matriz en la pisicion " + i + " " + j);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Numero no encontrado en la matriz");
        }

        System.out.print("Introduce el numero por el que quiere multiplicar la matriz: ");
        int multiplicador = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] * multiplicador + " ");
            }
            System.out.println();
        }
    }
}
