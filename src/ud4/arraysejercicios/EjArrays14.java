package ud4.arraysejercicios;

import java.util.Arrays;

/*
* Crea una función que calcule la traspuesta de una matriz.
* */
public class EjArrays14 {
    static int[][] matrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizTraspuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTraspuesta;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrizTraspuesta = matrizTraspuesta(matriz);

        System.out.println(Arrays.deepToString(matrizTraspuesta));
    }
}
