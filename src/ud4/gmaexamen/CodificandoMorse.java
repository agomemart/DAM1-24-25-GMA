package ud4.gmaexamen;

public class CodificandoMorse {
    private static final String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";
    private static final String[] letrasMorse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", "-.-.--", "..--.."
    };

    public static int numPuntosMorse(String frase) {
        int duracion = 0;
        boolean ultimaLetra = false;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                if (ultimaLetra) {
                    duracion += 5;
                    ultimaLetra = false;
                }
            } else {
                int indice = letras.indexOf(c);
                if (indice != -1) {
                    String morse = letrasMorse[indice];
                    for (int j = 0; j < morse.length(); j++) {
                        char simbolo = morse.charAt(j);
                        if (simbolo == '.') {
                            duracion += 1;
                        } else if (simbolo == '-') {
                            duracion += 3;
                        }
                        if (j < morse.length() - 1) {
                            duracion += 1;
                        }
                    }
                    if (i < frase.length() - 1 && frase.charAt(i + 1) != ' ') {
                        duracion += 3;
                    }
                    ultimaLetra = true;
                }
            }
        }
        return duracion;
    }

    public static void main(String[] args) {
        System.out.println(numPuntosMorse("?"));  // 15
        System.out.println(numPuntosMorse("!"));  // 19
        System.out.println(numPuntosMorse("SI"));  // 11
        System.out.println(numPuntosMorse("YA NACIO"));  // 73
    }
}