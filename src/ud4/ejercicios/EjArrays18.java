package ud4.ejercicios;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
* Crea una función que determine si una matriz es ortogonal
* */
public class EjArrays18 {
    static boolean esMatrizOrtogonal(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return false;
        }
        if (matriz.length  != matriz[0].length) {
            return false;
        }
        // Calcular transpuesta
        int[][] matrizTranspuesta = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        // Multiplicar matriz original por la transpuesta
        int[][] producto = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    producto[i][j] += matriz[i][k] * matrizTranspuesta[k][j];
                }
            }
        }

        // Generar matriz identidad
        int[][] matrizIdentidad = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            matrizIdentidad[i][i] = 1;
        }

        // Comparar el producto con la matriz identidad
        return Arrays.deepEquals(producto, matrizIdentidad);
    }
    @Test
    void testMatrizOrtogonal() {
        int[][] matrizOrtogonal = {
                {0, 1, 0},
                {-1, 0, 0},
                {0, 0, 1}
        };
        assertTrue(esMatrizOrtogonal(matrizOrtogonal));
    }

    @Test
    void testMatrizNoOrtogonal() {
        int[][] matrizNoOrtogonal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertFalse(esMatrizOrtogonal(matrizNoOrtogonal));
    }

    @Test
    void testMatrizIdentidad() {
        int[][] matrizIdentidad = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertTrue(esMatrizOrtogonal(matrizIdentidad));
    }

    @Test
    void testMatrizVacia() {
        int[][] matrizVacia = {};
        assertFalse(esMatrizOrtogonal(matrizVacia));
    }

    @Test
    void testMatrizNoCuadrada() {
        int[][] matrizNoCuadrada = {
                {1, 0},
                {0, 1},
                {1, 0}
        };
        assertFalse(esMatrizOrtogonal(matrizNoCuadrada));
    }
}
