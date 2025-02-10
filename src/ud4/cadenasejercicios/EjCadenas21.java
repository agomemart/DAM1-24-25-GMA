package ud4.cadenasejercicios;
/*
* Crea una función que determine si una cadena de caracteres es un número real válido.
* */
public class EjCadenas21 {
    public static boolean esNumeroReal(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }

        // Eliminar espacios en blanco al inicio y al final
        cadena = cadena.trim();

        // Expresión regular para validar números reales
        String patron = "^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$";

        return cadena.matches(patron);
    }
}
