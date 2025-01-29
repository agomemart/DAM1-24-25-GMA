package ud4.ejercicios;

import java.util.Scanner;

/*
* Leer 10 números enteros por teclado y guardarlos en un array. Calcula y muestra la
media de los números que estén en las posiciones pares del array.
* */
public class EjArrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[10];
        double media = 0;
        int totalNotas = 0;
        int notasPares = 0;

        System.out.print("Ingrese 10 notas: ");

        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
            if (t[i] % 2 == 0) {
                totalNotas += t[i];
                notasPares++;
            }
        }
        sc.close();

        media = (double)totalNotas / notasPares;
        System.out.println("La media es: " + media);
    }
}
