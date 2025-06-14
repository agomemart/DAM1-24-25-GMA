package ejrec;

import java.util.Scanner;

public class PalabraMasLarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLetras = 0;
        String palabraMasLarga = "";

        System.out.print("Inserta una frase: ");
        String frase = sc.nextLine();
        sc.close();

        String[] palabras = frase.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > numLetras) {
                numLetras = palabras[i].length();
                palabraMasLarga = palabras[i];
            }
        }

        System.out.println("Palabra más larga: " + palabraMasLarga);
    }
}
