//Adrián Gómez Martínez
package ud4.gmaexamen;

public class CodificandoMorse {
    static int numPuntosMorse(String frase) {
        String palabraEnMorse = codificaMorse(frase);

        char[] fraseMorse = new char[palabraEnMorse.length()];

        for (int i = 0; i < palabraEnMorse.length(); i++) {
            fraseMorse[i] = palabraEnMorse.charAt(i);
        }

        int puntosMorse = 0;
        for (int i = 0; i < fraseMorse.length; i++) {
            if (fraseMorse[i] == '-') {
                puntosMorse = puntosMorse + 3;
            } else {
                puntosMorse++;
            }
        }

        return puntosMorse;
    }

    static String codificaMorse(String frase) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";
        String[] letrasMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--..",
                "-.-.--", "..--.." };

        int indice = 0;
        String palabraEnMorse = "";

        if (frase == null || frase.isEmpty()) {
            return null;
        }

        char[] letrasArray = new char[letras.length()];
        for (int i = 0; i < letras.length() ; i++) {
            letrasArray[i] = letras.charAt(i);
        }

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.toUpperCase().charAt(i);
            if (letrasArray[i] == c) {
                indice = i;
            }
            String s = letrasMorse[indice];
            palabraEnMorse += s;
        }

        return palabraEnMorse;
    }
}
