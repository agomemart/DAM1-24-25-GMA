package ud1.ejercicios.gma20241004;

import java.util.Scanner;

/**
 * Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, mostrando el resultado por pantalla.
 */
public class EP0122 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //sc.useLocale(Locale.US);
        System.out.print("Inserta los grados Farenheit: ");
        double farenheit = sc.nextDouble();
        sc.close();

        double celsius = 5/9.0 * (farenheit-32);
        // System.out.println("Los grados Farenheit introducidos serían " + celsius + " grados Celsius");
        System.out.printf("Los grados Farenheit introducidos serían %.2f", celsius);
    }
}
