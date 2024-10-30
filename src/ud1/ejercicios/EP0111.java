package ud1.ejercicios;

import java.util.Scanner;

/**
 * Un economista te ha encargado un programa para realizar cálculos con el IVA. La
aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla
el importe correspondiente al IVA y al total.
 */
public class EP0111 {
    public static void main(String[] args) {
        double iva;
        double baseImponible;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta la base imponible a la que le quieres realizar el cálculo del IVA: ");
        baseImponible = sc.nextDouble();
        System.out.print("Inserta el iva que le queremos aplicar a la base imponible: ");
        iva = sc.nextDouble();
        sc.close();

        double ivaArticulo = baseImponible*iva;
        double total = baseImponible + ivaArticulo;

        System.out.println("El IVA de la base imponible es: " + ivaArticulo + " euros");
        System.out.println("El total de la base imponible con el iva es de: " + total + " euros");
    }
}
