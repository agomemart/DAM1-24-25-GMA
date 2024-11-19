package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
 * Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100.
 *  Mientras la solución sea correcta, el juego continuará. En caso contrario, el programa terminará y mostrará el número de operaciones realizadas correctamente.
 */

public class E0305 {
    public static void main(String[] args) {
        

        // Genera un número entero entre 1 y 99
        int MAX = 99;
        int MIN = 1;

        int num1 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int num2 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        Scanner sc = new Scanner(System.in);

        while ((num1 <= 100 && num1 >=1) && (num2 <= 100 && num2 >=1)) {
        
        System.out.printf("Escribe el resultado de sumar %d y %d: ", num1, num2);
        int sumaUsuario = sc.nextInt();

        if (sumaUsuario == num1 + num2) {
            System.out.println("Enhorabuena!! Has acertado!!");
        } else {
            System.out.printf("ERROR!! El resultado era %d%n", num1 + num2);
        }
     }
        sc.close();

    }
}