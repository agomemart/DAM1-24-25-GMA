package ud4.arraysejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
* Crea una función que determine si una matriz es simétrica.
* */
public class EjArrays17 {
    static boolean matrizSimetrica(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            return false;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    @Test
    public void pruebaMatrizSimetrica() {
        int[][] matriz = {{1, 2, 3}, {2, 5, 6}, {3, 6, 9}};
        assertTrue(matrizSimetrica(matriz));
    }

    @Test
    public void pruebaMatrizNoSimetrica() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertFalse(matrizSimetrica(matriz));
    }

    @Test
    public void pruebaMatrizIdentidad() {
        int[][] matriz = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertTrue(matrizSimetrica(matriz));
    }

    @Test
    public void pruebaMatrizNoCuadrada() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        assertFalse(matrizSimetrica(matriz));
    }

    @Test
    public void pruebaMatriz1x1() {
        int[][] matriz = {{7}};
        assertTrue(matrizSimetrica(matriz));
    }
}
