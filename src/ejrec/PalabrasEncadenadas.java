package ejrec;

import java.util.Scanner;

public class PalabrasEncadenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salida = true;
        System.out.print("Escribe las palabras a comprobar: ");
        String cadena = sc.nextLine();

        String[] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length - 1; i++) {
            String actual = palabras[i];
            String siguiente = palabras[i + 1];

            if (actual.length() > 2 && siguiente.length() > 2) {
                String ultimaSilaba = actual.substring(actual.length() - 2);
                String primeraSilaba = siguiente.substring(0, 2);

                if (!primeraSilaba.equalsIgnoreCase(ultimaSilaba)) {
                    salida = false;
                    break;
                }
            }
        }

        System.out.println(salida);
    }
}
