package ud4.cadenasejercicios;
/*
* Crea una función que determine si una cadena de caracteres es un número entero válido
* */
public class EjCadenas17 {
    static boolean cadenaNumero(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }

        // Comprueba si el primer carácter es un signo
        int i = 0;
        if (cadena.charAt(0) == '-' || cadena.charAt(0) == '+') {
            if (cadena.length() == 1) {
                return false;
            }
            i = 1;
        }

        // Comprueba que todos los caracteres restantes sean dígitos
        for (; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
