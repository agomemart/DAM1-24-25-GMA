package ud4.cadenasejercicios;
/*
*Crea una función que determine la frecuencia de cada palabra en una cadena de caracteres
 */
public class EjCadenas20 {
    public static String[] frecuenciaPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return new String[0];
        }

        // Convertir el texto a minúsculas y dividirlo en palabras
        String[] palabras = texto.toLowerCase().split("\\s+");

        // Array para almacenar palabras únicas
        String[] palabrasUnicas = new String[palabras.length];
        // Array para almacenar frecuencias
        int[] frecuencias = new int[palabras.length];
        int contadorUnicas = 0;

        for (String palabra : palabras) {
            // Limpiar la palabra de caracteres no alfabéticos
            palabra = palabra.replaceAll("^[^a-z]+|[^a-z]+$", "");

            if (!palabra.isEmpty()) {
                int indice = buscarPalabra(palabrasUnicas, palabra, contadorUnicas);
                if (indice == -1) {
                    palabrasUnicas[contadorUnicas] = palabra;
                    frecuencias[contadorUnicas] = 1;
                    contadorUnicas++;
                } else {
                    frecuencias[indice]++;
                }
            }
        }

        // Crear array de resultados
        String[] resultados = new String[contadorUnicas];
        for (int i = 0; i < contadorUnicas; i++) {
            resultados[i] = palabrasUnicas[i] + ": " + frecuencias[i];
        }

        return resultados;
    }

    private static int buscarPalabra(String[] palabras, String palabra, int contador) {
        for (int i = 0; i < contador; i++) {
            if (palabras[i].equals(palabra)) {
                return i;
            }
        }
        return -1;
    }
}
