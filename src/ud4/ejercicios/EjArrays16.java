package ud4.ejercicios;

import java.util.Arrays;

/*
* Crea una función que calcule el producto de dos matrices.
* */
public class EjArrays16 {
    static int[][] multiplicarMatrices(int[][] m1, int[][] m2) {
        if (m1[0].length != m2.length) {
            throw new IllegalArgumentException("Las dimensiones de las matrices no son compatibles para la multiplicación");
        }

        int[][] m3 = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m3;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Resultado: " + Arrays.deepToString(multiplicarMatrices(matriz, matriz2)));
    }
}
