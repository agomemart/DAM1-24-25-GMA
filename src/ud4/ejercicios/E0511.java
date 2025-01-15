package ud4.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0511 {
    static int[] generarCombinacion(int n) {
        Random rnd = new Random();
        int[] combinacion = new int[n];
        for(int i = 0; i < combinacion.length; i++) {
            combinacion[i] = rnd.nextInt(5) + 1;
        }
        return combinacion;
    }
    static int[] leerCombinación(int n) {
        Scanner sc = new Scanner(System.in);
        int[] combinacion = new int[n];
        System.out.println("introduce los " + n + " dígitos de la combinación");
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i] = sc.nextInt();
        }
        return combinacion;
    }
    static void mostrarPistas(int[] tSecreto, int[] tUsuario) {
        for (int i = 0; i < tUsuario.length; i++) {
            if (tSecreto[i] == tUsuario[i]) {
                System.out.println("= ");
            } else if (tSecreto[i] > tUsuario[i]){
                System.out.println("> ");
            } else {
                System.out.println("< ");
            }    
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digitos combinación: ");
        int longCombinacion = sc.nextInt();

        int[] combinacionSecreta = generarCombinacion(longCombinacion);

        int[] combinacionUsuario = leerCombinación(longCombinacion);
        while (!Arrays.equals(combinacionSecreta, combinacionUsuario)) {
            mostrarPistas(combinacionSecreta, combinacionUsuario);
            combinacionUsuario = leerCombinación(longCombinacion);
        }
        sc.close();
        System.out.println("Enhorabuena!!");
    }
}
