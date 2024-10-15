package ud1.ejercicios;
/*
 * Escribe un programa en Java que solicite un año al usuario y determine si es un año bisiesto o no. Utiliza operadores ternarios para realizar la verificación.

Requisitos:
Un año es bisiesto si es divisible por 4.
Sin embargo, si es divisible por 100, no es bisiesto, a menos que también sea divisible por 400.
El programa debe utilizar operadores ternarios para realizar las comprobaciones y mostrar si el año es bisiesto o no.
 */
import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        int año;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        año = sc.nextInt();
        sc.close();

        String añoBisiesto = (año%4 == 0) ? "El año introducido es bisiesto" :
                            "El año introducido no es bisiesto";

        System.out.println(añoBisiesto);
    }
}
