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
    boolean esDiagonal(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] == 0) {
                    return true;
                } else if (t[t.length][t.length] == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
