package ud4.ejercicios;

import java.util.Arrays;

public class EjArrays15 {
    static int[][] sumaMatrices(int[][] t1, int [][] t2) {
        int sumaM1 = 0;
        int sumaM2 = 0;
        int sumaMatrices = 0;
        int[][] suma = new int[t1.length][t1.length];

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1.length; j++) {
                sumaM1 = t1[i][j];
                sumaM2 = t2[i][j];
                sumaMatrices = sumaM1 + sumaM2;
                suma[i][j] = sumaMatrices;
            }
        }
        return suma;
    } 
    public static void main(String[] args) {
        int m1[][] = {
                        {1, 5, 6}, {2, 5, 4}
                    };
        int m2[][] = {
                        {2, 4, 8}, {9, 2, 1}
                    };
        String matrizString = Arrays.deepToString(sumaMatrices(m1, m2));
        System.out.println(matrizString);
    }
}