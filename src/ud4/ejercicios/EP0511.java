package ud4.ejercicios;

public class EP0511 {
    public static int[] buscarTodos(int[] t, int clave) {
        // Primero, contamos cuántas veces aparece la clave
        int contador = 0;
        for (int elemento : t) {
            if (elemento == clave) {
                contador++;
            }
        }

        // Creamos un array para almacenar los índices
        int[] indices = new int[contador];

        // Si no se encontró la clave, devolvemos el array vacío
        if (contador == 0) {
            return indices;
        }

        // Llenamos el array con los índices donde se encuentra la clave
        int indiceActual = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indices[indiceActual] = i;
                indiceActual++;
            }
        }
        return indices;
    }
}
