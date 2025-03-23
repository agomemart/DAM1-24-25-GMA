package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;

public class SumaFilasColumnas {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random rnd = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(1,9);
            }
        }

        //Suma fila
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma fila " + (i + 1) + ": " + sumaFila);
        }

        //Suma columna
        for (int j = 0; j < matriz.length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma columna " + (j + 1) + ": " + sumaColumna);
        }
        System.out.println(Arrays.deepToString(matriz));
    }
}
