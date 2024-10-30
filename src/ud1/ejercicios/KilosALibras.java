package ud1.ejercicios;
import java.util.Scanner;
/*
 * Diseña un programa que lea una medida de peso en kilogramos y la devuelva en libras. Una
libra equivale a 0.453592 kilogramos.

 */
public class KilosALibras {
    public static void main(String[] args) {
        double kg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta los kg que quieres convertir en libras: ");
        kg = sc.nextDouble();
        sc.close();

        double libras = kg/0.453592;

        System.out.println("Los kg introducidos equivalen a: " + libras + " libras");
    }
}
