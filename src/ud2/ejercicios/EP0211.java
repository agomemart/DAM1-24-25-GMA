package ud2.ejercicios;
/*Escribe una aplicación que solicite al usuario un número comprendido entre 0 y
9999. La aplicación tendrá que indicar si el número introducido es capicúa. */

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        int inverso = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta un número: ");
        int numero = sc.nextInt();
        sc.close();

        int original = numero;

        while (original != 0) {
            int digito = original % 10;
            inverso = inverso * 10 + digito;
            original /= 10;
        }

        if (numero == inverso) {
            System.out.println("El número introducido es capicua.");
        } else {
            System.out.println("El número no es capicua.");
        }

    }
}
