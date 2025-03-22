package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;

public class EliminarDuplicados {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(99);
        }

        System.out.println("Array generado aleatoriamente con repetidos: " + Arrays.toString(array));
        System.out.println("Array sin repetidos: " + Arrays.toString(eliminarDuplicados(array)));

    }
    public static int[] eliminarDuplicados(int[] array) {
        int[] temp = new int[array.length]; // Array temporal para almacenar valores únicos
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            boolean encontrado = false;

            for (int j = 0; j < contador; j++) {
                if (array[i] == temp[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                temp[contador] = array[i];
                contador++;
            }
        }

        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = temp[i];
        }

        return resultado;
    }
}
