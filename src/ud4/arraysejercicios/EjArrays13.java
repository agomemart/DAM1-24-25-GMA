package ud4.arraysejercicios;

import org.junit.jupiter.api.Test;/*
 * Una matriz diagonal es una matriz cuadrada cuyos elementos fuera de la diagonal
principal son todos cero.
Ejemplo de una matriz de tamaño 3×3:
Crea una función que determine si una matriz dada es una matriz diagonal. La función devolverá true
si la matriz de números enteros que se le pasa como parámetro es una matriz diagonal, y false en
cualquier otro caso
 */

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EjArrays13 {
    static boolean esDiagonal(int[][] t) {
        // Primero verificar si la matriz es nula o vacía
        if (t == null || t.length == 0) {
            return false;
        }

        // Luego verificar si la primera fila está vacía (si hay filas)
        if (t[0].length == 0) {
            return false;
        }

        int filas = t.length;
        int columnas = t[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i != j && t[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    @Test
    public void pruebaMatrizDiagonal() {
        int[][] matriz = {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}};
        assertTrue(esDiagonal(matriz));
    }
    @Test
    public void pruebaMatrizNoDiagonal() {
        int[][] matriz = {{1, 0, 0}, {0, 2, 0}, {0, 1, 3}};
        assertFalse(esDiagonal(matriz));
    }
    @Test
    public void pruebaMatrizNoCuadrada() {
        int[][] matriz = {{1, 0, 0}, {0, 2, 0}};
        assertFalse(esDiagonal(matriz));
    }
    @Test
    public void pruebaMatrizNoCuadrada2() {
        int[][] matriz = {{1, 0}, {0, 2}, {0, 0}};
        assertFalse(esDiagonal(matriz));
    }
    @Test
    public void pruebaMatrizVacia() {
        int[][] matriz = {};
        assertFalse(esDiagonal(matriz));
    }
    @Test
    public void pruebaMatrizNull() {
        int[][] matriz = null;
        assertFalse(esDiagonal(matriz));
    }
}
