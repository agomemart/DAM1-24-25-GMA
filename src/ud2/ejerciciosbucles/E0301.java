package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
* Diseñar un programa que muestre, para cada número introducido por teclado, si
* es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
* introducido sea 0.
 */
public class E0301 {
    public static void main(String[] args) {
        double num, cuadrado;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta u  número: ");
        num = sc.nextDouble();

         while (!(num == 0)) {
        
            if (num % 2 == 0) {
                System.out.println("El número introducido es par");
            } else {
                System.out.println("El número introducido es impar");
            }
            if (num >= 0) {
                System.out.println("El número introducido ess positivo");
            } else {
                System.out.println("El número introducido es negativo");
            }
            cuadrado = Math.pow(num, 2);
            System.out.println("El cuadrado del número introducido es: " + cuadrado);

            System.out.println("Inserta u  número: ");
            num = sc.nextDouble();
         }
         sc.close();
    }
}
