package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;

public class DiagonalPrincSec {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random rnd = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(1,9);
            }
        }

        System.out.println(Arrays.deepToString(matriz));

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Diagonal principal: " + matriz[i][i]);
        }
        for (int j = 0; j < matriz.length; j++) {
            System.out.println("Diagonal secundaria: " + matriz[matriz.length - 1 - j][j]);
        }
    }
}
