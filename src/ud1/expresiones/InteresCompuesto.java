package ud1.expresiones;

import java.util.Scanner;

/**
 * Solicita el interes en euros que solicita invertir
 * el nº de años que durará la inversión y usando
 * la formula del interes (5%)compuesto y para un valor
 * fijo de interes a pagar una vez al añp calcula el improte final que tendrá
 * el usuario
 */
public class InteresCompuesto {
    public static void main(String[] args) {
        // Declaraciñon de constantes y variables
        double importeInicial, importeFinal;
        int anhos;

        final double INTERES = 0.05;
        final double NUM_PAGOS = 1;

        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Importe a invertir (euros): ");
        importeInicial = sc.nextDouble();

        System.out.print("Duración en años de la inversión: ");
        anhos = sc.nextInt();
        sc.close();

        // Proceso
        double base = 1 + INTERES / NUM_PAGOS;
        double exponente = NUM_PAGOS * anhos;
        importeFinal = importeInicial * Math.pow(base, exponente);

        System.out.print("El importe final tras " + anhos + " años de inversión es de " 
        + importeFinal + " euros");
    }
}