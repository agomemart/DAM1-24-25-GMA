package ud4.cadenasejercicios;

import java.util.Arrays;

/*
* Crea una función que determine si una cadena de caracteres es un anagrama de otra cadena de caracteres.
* */
public class EjCadenas10 {
    static boolean sonAnagramas(String palabra1, String palabra2) {
        // Eliminar espacios y convertir a minúsculas
        palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

        // Verificar si tienen la misma longitud
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Convertir strings a arrays de caracteres y ordenarlos
        char[] arr1 = palabra1.toCharArray();
        char[] arr2 = palabra2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Comparar los arrays ordenados
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(sonAnagramas("listen", "silent")); // true
        System.out.println(sonAnagramas("hello", "world")); // false
        System.out.println(sonAnagramas("Debit card", "Bad credit")); // true
    }
}