package ud4.apuntes;

import java.util.Scanner;

public class E0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("Introduzca palabras separadas por enter para componer una frase. \"Fin\" para terminar:  ");
        String palabra = sc.nextLine();
        while (!palabra.toUpperCase().equals("FIN")) {
            if (!palabra.equals("")) {
                frase += palabra + " ";
            }
            palabra = sc.nextLine();
        }
        sc.close();

        frase = frase.stripTrailing();

        System.out.println(frase);
    }
}
