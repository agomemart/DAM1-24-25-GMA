package ud4.cadenasejercicios;
/*
* Crea una función que divida una cadena de caracteres en una matriz de subcadenas en función de un delimitador dado.
* */
public class EjCadenas14 {
    public static String[] dividirCadena(String cadena, String delimitador) {
        if (cadena == null || delimitador == null) {
            return new String[0];
        }
        return cadena.split(delimitador);
    }

    public static void main(String[] args) {
        String cadena = "manzana,pera,uva,naranja";
        String delimitador = ",";

        String[] resultado = dividirCadena(cadena, delimitador);

        System.out.println("Cadena original: " + cadena);
        System.out.println("Subcadenas:");
        for (String subcadena : resultado) {
            System.out.println(subcadena);
        }
    }
}
