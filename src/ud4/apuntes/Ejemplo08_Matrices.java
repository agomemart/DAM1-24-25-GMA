package ud4.apuntes;

import java.util.Arrays;

public class Ejemplo08_Matrices {
    public static void main(String[] args) {
        int[][] matriz;

        int[][] matriz2 = {
            {0, 1, 4, 5, 5, 6},
            {5, 4, 6, 7, 8, 9},
            {9, 4, 5, 7, 2, 3}
        };

        int[][] matriz3 = {
            {0, 1, 4, 5, 5, 6},
            {5, 4, 6, 7, 8, 9},
            {9, 4, 5, 7, 2, 3}
        };

        System.out.println("matriz 2 = matriz 3? " + (matriz2 == matriz3));
        System.out.println("Arrays.equals(matriz2, matriz3) " + Arrays.equals(matriz2, matriz3));
        System.out.println("Arrays.deepEquals(matriz2, matriz3) " + Arrays.deepEquals(matriz2, matriz3));
        matriz = new int[23][8];
        

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        mostrar(matriz);
        System.out.println(Arrays.deepToString(matriz));
    }
    static void mostrar(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generarAleatorio(int numF, int numC) {
        int [][] m = new int[numF][numC];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        return m;
    }
}
