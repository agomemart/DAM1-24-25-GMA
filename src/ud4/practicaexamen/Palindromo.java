package ud4.practicaexamen;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta una palabra: ");
        String palabra = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        String palabraInvertida = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraInvertida += palabra.charAt(palabra.length() - 1 - i);
        }

        if (palabraInvertida.equals(palabra)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}
