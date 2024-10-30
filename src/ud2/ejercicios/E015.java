package ud2.ejercicios;

import java.util.Scanner;

/*
 * . Escribe una aplicación que solicite por consola dos números reales que
corresponden a la base y la altura de un triángulo. Deberá mostrarse su área, comprobando
que los números introducidos por el usuario no son negativos, algo que no tendría sentido.
 */
public class E015 {
    public static void main(String[] args) {
        double base, altura;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta la altura del triángulo: ");
        altura = sc.nextDouble();
        System.out.println("Inserta la base del triángulo");
        base = sc.nextDouble();
        sc.close();

        if (base >= 0 && altura >= 0) {
            double areaTriángulo = base * altura / 2;
            System.out.println("El área del triángulo sería: " + areaTriángulo);
        } else {
            System.out.println("Los números introducidos no son válidos. Introduce números correctos.");
        }
    }
}
