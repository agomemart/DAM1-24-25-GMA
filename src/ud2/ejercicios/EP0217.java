package ud2.ejercicios;

import java.util.Random;
import java.util.Scanner;
/*
 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe
indicar si el resultado de la operación es correcto o incorrecto.
 */
public class EP0217 {
    public static void main(String[] args) {
        int num1, num2;
        boolean correcto = true;
        Scanner sc = new Scanner(System.in);

        while (correcto) {
            Random random = new Random();
            num1 = random.nextInt(99) + 1;
            num2 = random.nextInt(99) + 1;
    
            int resultadoSuma = num1 + num2;
            System.out.println("Suma de 2 números");
            System.out.print("Suma " + num1 + " + " + num2 + ": ");
            int resultadoIntroducido = sc.nextInt();

            if (resultadoSuma == resultadoIntroducido) {
                System.out.println("Correcto!!!");
                correcto = true;
            }  else {
                System.out.println("Has fallado :(");
                correcto = false;
            }
        }
        sc.close();
    }
}
