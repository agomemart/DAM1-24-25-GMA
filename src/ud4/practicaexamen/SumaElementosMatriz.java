package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;

public class SumaElementosMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random rnd = new Random();
        int sumaElementos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(1,9);
                sumaElementos += matriz[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matriz));
        System.out.println(sumaElementos);
    }
}
