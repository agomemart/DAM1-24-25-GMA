package ud4.ejercicios;

import java.util.Arrays;

public class ArraysEstadisticas {
    static int suma(int[] numeros) {
        int suma = 0;
        for (int i : numeros) {
            suma += i;
        }
        return suma;
    }

    static int minimo(int[] numeros) {
        Arrays.sort(numeros);
        int minimo = numeros[0];
        return minimo;
    }

    static int maximo(int[] numeros) {
        Arrays.sort(numeros);
        int maximo = numeros[numeros.length - 1];
        return maximo;
    }

    static double media(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double media = suma / numeros.length;
        return media;
    }

    static double mediana(int[] numeros){
        Arrays.sort(numeros);
        int mitadDatos = numeros[numeros.length / 2];
        if (numeros.length % 2 == 0) {
            double mediaDatos = mitadDatos + numeros[numeros.length / 2 - 1] / 2.0;
            return mediaDatos;
        }
        return mitadDatos;
    }

    static int moda(int[] numeros){
        Arrays.sort(numeros);
        int moda = numeros[0];
        int maxRepeticones = 1;
        int repeticiones = 1;
        int numActual = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == numActual) {
                repeticiones++;
                if (repeticiones > maxRepeticones) {
                    moda = numActual;
                    maxRepeticones = repeticiones;
                } else if (repeticiones == maxRepeticones) {
                    moda = -1;
                }
            } else {
                numActual = numeros[i];
                repeticiones = 1;
            }
        }
        return moda;
    }



    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = { 2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7 };
        int[] numeros2 = { 2, 4, 6, 7, 4, 9, 2, 5, 6, 7 };
        // Proceso y salida
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);
    }

    static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------");
        System.out.println("Longitud: " + numeros.length);
        System.out.println("Suma: " + suma(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Mediana: " + mediana(numeros));
        System.out.println("Moda: " + moda(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------\n\n");
    }

}
