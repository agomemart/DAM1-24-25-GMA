package ud1.ejercicios.gma20241004;

import java.util.Scanner;

/**
 * 
EP0116. Solicita al usuario tres distancias:
La primera, medida en milímetros.
La segunda, medida en centímetros.
La última, medida en metros.

Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
centimetros).

 */
public class EP0116 {
    public static void main(String[] args) {
        double mm, cm, m;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inseta una distancia en milímetros: ");
        mm = sc.nextDouble();
        System.out.print("Inseta una distancia en centímetros: ");
        cm = sc.nextDouble();
        System.out.print("Inseta una distancia en metros: ");
        m = sc.nextDouble();
        sc.close();

        double totalCm = mm/100 + cm + m*100;

        System.out.println("El total de la distancia introducida en centímetros es de: " + totalCm + "cm");
    }
}
