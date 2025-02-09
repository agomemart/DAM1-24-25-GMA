package ud4.cadenasejercicios;
/*
* Crea una función que tome una cadena de caracteres y devuelva la cadena invertida.
* */
public class EjCadenas07 {
    static String cadenaInvertida(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() -1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    public static void main(String[] args) {
        String frase = "Hola que tal estas";

        System.out.println(cadenaInvertida(frase));
    }
}
