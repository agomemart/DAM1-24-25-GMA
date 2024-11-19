package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
 * Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero que son aquellos, positivos o negativos, 
 * que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero. Ejemplos de números casi-cero son el 0,3, el -0,99 o el 0,123; 
 * algunos números que no se consideran casi-ceros son: el 12,3, el 0 o el -1.
 */
public class E0204 {
    public static void main(String[] args) {
        double num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un número decimal: ");
        num = sc.nextDouble();
        sc.close();
        
        if (num == 0) {
            System.out.println("Número es 0");
        } else if (num > -1 && num < 1) {
            System.out.println("Número casi 0");
        } else {
            System.out.println("No se considera número casi 0");
        }
    }
}
