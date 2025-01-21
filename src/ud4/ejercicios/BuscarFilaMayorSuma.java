package ud4.ejercicios;

import java.util.Arrays;

/*
 * Escribe un programa en Java que reciba una matriz de enteros y 
determine devuelva la fila que tiene la mayor suma de sus elementos. 
 */
public class BuscarFilaMayorSuma {
    static int[] filaMayorSuma(int[][] t) {
        if (t == null) {
            return null;
        }
        if (t.length == 0) {
           return new int[0]; 
        }
        int sumaMax = 0;
        int filaMax = 0;

        for (int i = 0; i < t.length; i++) {
            int suma= 0;
            for (int j = 0; j < t[i].length; j++) {
               suma += t[i][j];
            }
            if (i == 0 || suma > sumaMax) {
                sumaMax = suma;
                filaMax = i;
            } 
        }
                return t[filaMax];
    }
    public static void main(String[] args) {
        int[][] m = {
            {0, 1, 4, 5, 5, 6},
            {5, 4, 6, 7, 8, 9},
            {9, 4, 5, 7, 2, 3}
        };
        int[] fila = filaMayorSuma(m);
        System.out.println(Arrays.toString(fila));

    }
}
