package ud4.apuntes;

import java.util.Random;

public class FuncionBuscar {
    static int buscar(int t[], int clave) {
        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                return i;
            return -1;           
    }
    static int[] arrayAleatorio(int n) {
        int[] t = new int[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(19) - 9; //Asigna numero entre -9 y 9
        }

        return t;
    }

    static int contar(int t[], int clave) {
        int contadorClave = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contadorClave++;
            }
        }
        return contadorClave;
    }

    static int[] buscarVarios(int t[], int clave) {
        int p = 0;
        int[] posiciones = new int[p];
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                i = p;
            }
        } 
        return posiciones;
    }

    public static void main(String[] args) {
        int[] numeros = arrayAleatorio(10);

        int pos = buscar(numeros, 5);

        if (pos != -1) {
            System.out.println("Hay un 5 en la posición " + pos);
        } else {
            System.out.println("No hay ningún 5");
        }
        System.out.println("En el array de numeros hay " + contar(numeros, pos));
    }
}
