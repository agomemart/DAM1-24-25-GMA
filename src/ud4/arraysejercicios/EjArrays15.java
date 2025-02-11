package ud4.arraysejercicios;
/*
* Crea una función que calcule la suma de dos matrices.
* */
import java.util.Arrays;

public class EjArrays15 {
    static int[][] sumaMatrices(int[][] t1, int[][] t2) {
        int filas = t1.length;
        int columnas = t1[0].length;

        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int[][] m1 = {
                        {1, 5, 6}, {2, 5, 4}
                    };
        int[][] m2 = {
                        {2, 4, 8}, {9, 2, 1}
                    };
        String matrizString = Arrays.deepToString(sumaMatrices(m1, m2));
        System.out.println(matrizString);
    }
}