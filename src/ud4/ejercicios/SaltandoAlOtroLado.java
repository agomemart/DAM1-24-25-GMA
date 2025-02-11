package ud4.ejercicios;

import java.util.Scanner;

public class SaltandoAlOtroLado {
    public static int calcularMinimoSalto(int[] posiciones) {
        int izquierda = 1, derecha = posiciones[posiciones.length - 1];

        while (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            if (esPosibleCruzar(posiciones, medio)) {
                derecha = medio;
            } else {
                izquierda = medio + 1;
            }
        }
        return izquierda;
    }

    private static boolean esPosibleCruzar(int[] posiciones, int k) {
        int capacidad = k;
        int posicionActual = 0;

        for (int i = 0; i < posiciones.length; i++) {
            int distancia = posiciones[i] - posicionActual;
            if (distancia > capacidad) {
                return false;
            }
            if (distancia == capacidad) {
                capacidad--;
            }
            posicionActual = posiciones[i];
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();

        while (casos-- > 0) {
            int n = scanner.nextInt();
            int[] posiciones = new int[n];

            for (int i = 0; i < n; i++) {
                posiciones[i] = scanner.nextInt();
            }

            System.out.println(calcularMinimoSalto(posiciones));
        }

        scanner.close();
    }
}
