package ud4.ejercicios;

import java.util.Arrays;

/*
* Escribe un método que reciba un array de enteros y un número n, y rote el array n veces a la derecha.
* Cada rotación mueve el último elemento del array al primer lugar. Si n es mayor que la longitud
* del array, rota el array tantas veces como sea necesario (es decir, n % array.length).
* */
public class RotacionArray {
    public static void rotarArrayDerecha(int[] array, int n) {
        int[]arrayResultante = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i > n) {
                arrayResultante[i] = array[n % array.length];
            } else {
                arrayResultante[i] = array[i + n];
            }
        }
        System.out.println(Arrays.toString(arrayResultante));
    }

    public static void main(String[] args) {
        rotarArrayDerecha(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3);
    }
}
