package ud4.apuntes;

import java.util.Scanner;

/*
 * Diseña una función a la que se le pase una cadena de caracteres y la devuelva
invertida. Por ejemplo: la cadena “Hola mundo” se devolvería como “odnum aloH”.
 */
public class E0605 {
    static String invertirCadena(String frase) {
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        return fraseInvertida;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta una frase: ");
        String frase = sc.nextLine();
        System.out.println("La frase invertida sería: " + invertirCadena(frase));
    }
}
