package ud4.apuntes;

import java.util.Scanner;

/*
 * Diseña una función a la que se le pase una cadena de caracteres y la devuelva
invertida. Por ejemplo: la cadena “Hola mundo” se devolvería como “odnum aloH”.
 */
public class E0610 {
    static String invertirSinEspacios(String frase) {
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra != ' ') {
                switch (letra) {
                    case 'á':
                        letra = 'a';
                        break;
                    case 'é':
                        letra = 'e';
                        break;
                    case 'í':
                        letra = 'i';
                        break;
                    case 'ó':
                        letra = 'o';
                        break;
                    case 'ú':
                        letra = 'u';
                        break;
                }
                fraseInvertida += letra;
            }
        }
        return fraseInvertida;
    }

    static boolean esPalindromo(String frase) {
        String fraseSinEspacios = sinEspacios(frase);
        String fraseInvertidaSinEspacios = invertirSinEspacios(frase);

        return fraseSinEspacios.equalsIgnoreCase(invertirSinEspacios(fraseInvertidaSinEspacios));

    }

    static String sinEspacios(String frase) {
        String fraseSinEspacios = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra != ' ') {
                switch (letra) {
                    case 'á':
                        letra = 'a';
                        break;
                    case 'é':
                        letra = 'e';
                        break;
                    case 'í':
                        letra = 'i';
                        break;
                    case 'ó':
                        letra = 'o';
                        break;
                    case 'ú':
                        letra = 'u';
                        break;
                }
                fraseSinEspacios += letra;
            }
        }
        return fraseSinEspacios;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta una frase: ");
        String frase = sc.nextLine();
        sc.close();

        if (esPalindromo(frase)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}
