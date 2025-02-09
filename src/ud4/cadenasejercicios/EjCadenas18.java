package ud4.cadenasejercicios;
/*
* Crea una función que convierta una cadena de caracteres que representa un número entero a su valor entero correspondiente
* */
public class EjCadenas18 {
    public static int cadenaAEntero(String cadena) throws NumberFormatException {
        if (cadena == null || cadena.isEmpty()) {
            throw new NumberFormatException("Cadena vacía o nula");
        }

        int resultado = 0;
        boolean esNegativo = false;
        int i = 0;

        // Manejar el signo si está presente
        if (cadena.charAt(0) == '-') {
            esNegativo = true;
            i = 1;
        } else if (cadena.charAt(0) == '+') {
            i = 1;
        }

        // Convertir cada dígito
        for (; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Carácter no válido: " + c);
            }
            int digito = c - '0';
            resultado = resultado * 10 + digito;
        }

        return esNegativo ? -resultado : resultado;
    }
}
