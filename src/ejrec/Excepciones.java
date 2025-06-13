package ejrec;

import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;
        int entero = 0;

        while (!entradaValida) {
            try {
                System.out.println("Introduce un númerio entero: ");
                entero = sc.nextInt();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("ERROR: Debes introducir un número entero válido");
                sc.nextLine();
            }
        }
        System.out.println("El numero introducido es: " + entero);
    }
}
