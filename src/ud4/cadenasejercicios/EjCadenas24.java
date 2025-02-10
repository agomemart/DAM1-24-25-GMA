package ud4.cadenasejercicios;
/*
* Crea una función que calcule el código hash de una cadena de caracteres usando el algoritmo de hash de DJB2.
* */
public class EjCadenas24 {
    public static long djb2Hash(String cadena) {
        long hash = 5381;
        for (int i = 0; i < cadena.length(); i++) {
            hash = ((hash << 5) + hash) + cadena.charAt(i);
        }
        return hash;
    }
}
