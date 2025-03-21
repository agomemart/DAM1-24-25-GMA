package ud4.practicaexamen;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVocales = 0;
        System.out.print("inserta una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o') {
                numVocales++;
            }
        }

        if(numVocales > 0) {
            System.out.println("La palabra "+ palabra + " contiene " + numVocales + " vocales.");
        } else {
            System.out.println("La palabra " + palabra + " no contiene ninguna vocal.");
        }
    }
}
