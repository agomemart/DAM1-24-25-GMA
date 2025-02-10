package ud4.cadenasejercicios;
/*
* Crea una función que convierta una cadena de caracteres que representa un número real a su valor real correspondiente.
* */
public class EjCadenas22 {
    public static double cadenaANumeroReal(String cadena) throws NumberFormatException {
        if (cadena == null || cadena.trim().isEmpty()) {
            throw new NumberFormatException("La cadena está vacía o es nula");
        }

        // Eliminar espacios en blanco al inicio y al final
        cadena = cadena.trim();

        try {
            // Intentar convertir directamente a double
            return Double.parseDouble(cadena);
        } catch (NumberFormatException e) {
            // Si falla, intentar manejar casos especiales
            cadena = cadena.toLowerCase();
            if (cadena.equals("infinity") || cadena.equals("+infinity")) {
                return Double.POSITIVE_INFINITY;
            } else if (cadena.equals("-infinity")) {
                return Double.NEGATIVE_INFINITY;
            } else if (cadena.equals("nan")) {
                return Double.NaN;
            } else {
                throw new NumberFormatException("Formato de número no válido: " + cadena);
            }
        }
    }
}
