//Adrián Gómez Martínez
package ud4.gmaexamenrec;

public class Vogais {
    static String cambiaVogais(String str, char vogal) {
        String fraseResultante = "";

        char[] arrayFrase = str.toCharArray();

        for (int i = 0; i < arrayFrase.length; i++) {
            char letra = str.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                arrayFrase[i] = vogal;
            }

            if (letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú' || letra == 'ü') {
                arrayFrase[i] = vogal;
            }

            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                if (vogal == 'a') {
                    vogal = 'A';
                } else if (vogal == 'e') {
                    vogal = 'E';
                } else if (vogal == 'i') {
                    vogal = 'I';
                } else if (vogal == 'o') {
                    vogal = 'O';
                } else if(vogal == 'u'){
                    vogal = 'U';
                }
                arrayFrase[i] = vogal;
            }
            fraseResultante += arrayFrase[i];
        }

        return fraseResultante;
    }
}