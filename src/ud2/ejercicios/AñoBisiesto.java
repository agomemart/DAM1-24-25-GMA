package ud2.ejercicios;

import java.util.Scanner;

/*
 *  Haz un programa que pida por teclado un número de año y que muestre un mensaje indicando si el año es bisiesto o no.
Investiga el agoritmo para calcular si un año es bisiesto o no.

“Año bisiesto es el divisible entre 4, salvo que sea año secular es decir divisible por 100, en cuyo caso también ha de ser divisible entre 400.”

Ejemplos:
Son bisiestos: 4, 40, 120, 144, 400, 800, 2024. 
No son bisiestos: 3, 100, 2100

 */
public class AñoBisiesto {
    public static void main(String[] args) {
        int año;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un año: ");
        año = sc.nextInt();
        sc.close();

        if ((año % 400 == 0) || (año % 4 == 0) && !(año % 100 == 0)) {
            System.out.println("Es año bisiesto");
        } else {
            System.out.println("No es año bisiesto");
        }
    }
}
