package ud4.practicaexamen;

import java.util.Random;
import java.util.Scanner;

public class BusquedaArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Inserta el número a buscar: ");
        int numero = entrada.nextInt();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(99);
        }

        for (int j : array) {
            if (j == numero) {
                System.out.println("Está en el array el número " + numero);
            }
            System.out.println("Número no encontrado");
        }
    }
}
