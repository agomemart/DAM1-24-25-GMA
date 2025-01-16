package ud4.ejercicios;

public class ValidarDNI {
    boolean esValidoDNI (int num, char letra) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[num % 23] == letra;
    }
}
