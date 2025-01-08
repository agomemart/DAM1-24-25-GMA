package ud4.apuntes;

import java.util.Scanner;

public class ArrayNumeros {
    private static void leerNumeros(int[] t) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.close();
        int[] numeros = new int[n];
        System.out.print("Escribe numeros enteros: ");

        leerNumeros(numeros);

        // Procesar datos
        int sumaPos = 0, contPos = 0, sumaNeg = 0, contNeg = 0, contCeros = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] > 0) {
                contPos++;
                sumaPos += numeros[i];
            } else if (numeros[i] < 0) {
                contNeg++;
                sumaNeg += numeros[i];
            } else {
                contCeros++;
            }
        }

        System.out.println("Media numeros positivos: " + sumaPos / contPos);
        System.out.println("Media numeros negativos: " + sumaNeg / contNeg);
        System.out.println("Número de ceros: " + contCeros);
    }

}
