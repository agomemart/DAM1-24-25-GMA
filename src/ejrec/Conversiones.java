package ejrec;

import java.util.Scanner;

public class Conversiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Inserta una cadena: ");
            String cadena = sc.nextLine();

            int numero = Integer.parseInt(cadena);

            System.out.println(numero);
        } catch (Exception e) {
            System.out.println("La cadena no es un número válido");
        }

    }
}
