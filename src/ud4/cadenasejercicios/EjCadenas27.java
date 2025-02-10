package ud4.cadenasejercicios;
/*
* Crea una función que determine si una cadena de caracteres es una dirección URL válida
* */
public class EjCadenas27 {
    static boolean esUrlValido(String url) {
        if (url == null || url.isEmpty()) {
            return false;
        }

        String patron =  "^(https?://)?([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
        return url.matches(patron);
    }

    public static void main(String[] args) {
        String url = "https://www.google.com";
        System.out.println(esUrlValido(url));
    }
}
