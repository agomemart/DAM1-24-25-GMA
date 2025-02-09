package ud4.arraysejercicios;
/*
* Crea una función que determine si una matriz dada es una matriz identidad
* */
public class EjArrays12_MatrizIdentidad {
    public static boolean esMatrizIdentidad(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Verificar si la matriz es cuadrada
        if (filas != columnas) {
            return false;
        }

        // Comprobar los valores de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false; // La diagonal principal debe tener 1
                } else if (i != j && matriz[i][j] != 0) {
                    return false; // Los otros elementos deben ser 0
                }
            }
        }

        return true; // Es una matriz identidad
    }

    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] matriz2 = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 1}
        };

        System.out.println("Matriz 1 es identidad: " + esMatrizIdentidad(matriz1)); // true
        System.out.println("Matriz 2 es identidad: " + esMatrizIdentidad(matriz2)); // false
    }
}
