package ud4.cadenasejercicios;
/*
* Crea una función que determine la longitud máxima de una palabra en una cadena de caracteres
* */
public class EjCadenas19 {
    static int longitudPalabra(String frase) {
        if (frase == null || frase.isEmpty()) {
            return 0;
        }

        String[] palabras = frase.split("\\s+");
        int maxLongitud = 0;

        for (String palabra : palabras) {
            int longitud = palabra.length();
            if (longitud > maxLongitud) {
                maxLongitud = longitud;
            }
        }

        return maxLongitud;
    }
}
