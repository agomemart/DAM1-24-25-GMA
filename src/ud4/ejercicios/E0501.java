package ud4.ejercicios;

import java.util.Random;

public class E0501 {
    public static void main(String[] args) {
        int[] t = arrayAleatorio(10, 1, 100);

        System.out.println("La suma es " + sumar(t));
    }

    private static int sumar(int[] t) {
        int suma = 0;
        for (int i : t) {
            suma += i;
        }
        return suma;
    }

    public static int[] arrayAleatorio(int n, int inicio, int fin) {
        int[] t = new int[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(fin + inicio + 1) + inicio;
        }

        return t;
    }
}
