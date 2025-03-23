package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscarEnMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        Random rnd = new Random();
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(1,9);
            }
        }

        System.out.print("Inserta el número a buscar en la matriz: ");
        int numero = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Número " + numero + " encontrado!! Posición: fila " + i + " columna " + j);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Núnero no encontrado!");
        }

        System.out.println(Arrays.deepToString(matriz));
    }
}
