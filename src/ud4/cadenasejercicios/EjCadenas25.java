package ud4.cadenasejercicios;
/*
* Crea una función que determine si una cadena de caracteres es una dirección de correo electrónico válida
* */
public class EjCadenas25 {
    static boolean esCorreoElectronico(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        cadena = cadena.toLowerCase();
        String patron = "[0-9a-zA-Z]{1,}+[@]{1}+[0-9a-zA-Z]{1,}+[.]{1}+[a-zA-Z]{1,3}";

        return cadena.matches(patron);
    }
}
