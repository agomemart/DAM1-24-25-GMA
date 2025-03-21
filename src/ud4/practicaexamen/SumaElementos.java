package ud4.practicaexamen;

import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Inserta el número " + i + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
}
