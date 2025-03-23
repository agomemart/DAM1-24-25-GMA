package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;

public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizTraspuesta = new int[3][3];
        Random rnd = new Random();
        boolean simetrica = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(1,9);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTraspuesta[i][j] = matriz[j][i];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matrizTraspuesta[i][j]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) break;
        }

        System.out.println(Arrays.deepToString(matriz));
        System.out.println(Arrays.deepToString(matrizTraspuesta));
        System.out.println(" Es simétrica ? " + simetrica);

    }
}
