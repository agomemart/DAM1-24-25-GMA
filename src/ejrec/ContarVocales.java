package ejrec;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorVocales = 0;


        System.out.print("Inserta una palabra: ");
        String palabra = sc.nextLine();
        palabra.toLowerCase();
        sc.close();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' ||  palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Numero de vocales: " + contadorVocales);
    }
}
