package ud4.cadenasejercicios;
/*
* Crea una función que extraiga el nombre de usuario de una dirección de correo electrónico dada.
* */
public class EjCadenas26 {
    static String extraerNombreUsuario(String email) {
        if (email == null || email.isEmpty()) {
            return null;
        }

        int posicionArroba = email.indexOf('@');
        if (posicionArroba == -1) {
            return ""; // O podrías retornar null si prefieres
        }

        return email.substring(0, posicionArroba);
    }
}
