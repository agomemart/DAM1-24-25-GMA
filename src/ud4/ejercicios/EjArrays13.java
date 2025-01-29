package ud4.ejercicios;
/*
 * Una matriz diagonal es una matriz cuadrada cuyos elementos fuera de la diagonal
principal son todos cero.
Ejemplo de una matriz de tamaño 3×3:
Crea una función que determine si una matriz dada es una matriz diagonal. La función devolverá true
si la matriz de números enteros que se le pasa como parámetro es una matriz diagonal, y false en
cualquier otro caso
 */
public class EjArrays13 {
    static boolean esDiagonal(int[][] t) {
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
    public static void main(String[] args) {
        int[][] matriz1 = {
                {3, 0, 0},
                {0, 5, 0},
                {0, 0, 9}
        };

        int[][] matriz2 = {
                {1, 2, 0},
                {0, 4, 0},
                {0, 0, 5}
        };

        System.out.println("Matriz 1: " + esDiagonal(matriz1)); // true
        System.out.println("Matriz 2: " + esDiagonal(matriz2)); // false
    }
}
