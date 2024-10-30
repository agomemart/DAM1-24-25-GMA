package ud1.ejercicios;

import java.util.Scanner;
/**
 * Crea un programa que pida la base y la altura de un triángulo y muestre su área.
Área Triángulo = (base * altura) / 2
 */
public class EP0112 {
    public static void main(String[] args) {
        double base;
        double altura;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta la base del triángulo: ");
        base = sc.nextDouble();
        System.out.print("Inserta la altura del triángulo: ");
        altura = sc.nextDouble();
        sc.close();

        double areaTriangulo = (base*altura)/2;
        System.out.println("El área del triángulo es de: " + areaTriangulo);
    }
}
