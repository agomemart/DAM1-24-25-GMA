package ud4.apuntes;

import java.util.Scanner;

/*
 *  Diseñar el juego de “Acierta la contraseña”, que funciona así: un primer jugador
introduce una contraseña. A continuación, un segundo jugador debe teclear palabras
hasta que acierte.
 */
public class E0603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una contraseña: ");
        String contraseña = sc.nextLine();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        String aciertoContraseña;

        do {
            System.out.print("Adivina la contraseña introducida: ");
            aciertoContraseña = sc.nextLine();
        } while (!contraseña.equals(aciertoContraseña));
        sc.close();
        
        System.out.println("Has acertado!!!");
    }
}
