package ud4.practicaexamen;

import java.util.Arrays;

public class MatrizIdentidad {
    public static void main(String[] args) {
        int[][] matrizIdetidad = new int[4][4];

        for (int i = 0; i < matrizIdetidad.length; i++) {
            for (int j = 0; j < matrizIdetidad[i].length; j++) {
                matrizIdetidad[i][i] = 1;
            }
        }
        System.out.println(Arrays.deepToString(matrizIdetidad));
    }
}
