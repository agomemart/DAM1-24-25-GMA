package ud4.practicaexamen;

import java.util.Scanner;

public class CadenaMayus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta una cadena: ");
        String cadena = sc.nextLine().replaceAll("\\s+", " ");

        String palabras[] =  cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 3) {
                palabras[i] = palabras[i].toUpperCase();
            }
            System.out.print(palabras[i] + " ");
        }

    }
}
