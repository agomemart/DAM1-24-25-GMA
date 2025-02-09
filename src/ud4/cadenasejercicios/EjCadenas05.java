package ud4.cadenasejercicios;

import java.util.Scanner;

/*
* Escribe un programa en Java que lea una palabra del usuario y luego verifique si es un palíndromo
* (es decir, si se lee igual de izquierda a derecha que de derecha a izquierda).
* */
public class EjCadenas05 {
    public static void main(String[] args) {
        String palabra;
        String palabraReves = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta una palabra: ");
        palabra = sc.nextLine();
        sc.close();

        for (int i = palabra.length() - 1; i >= 0 ; i--) {
            char caracter = palabra.charAt(i);
            palabraReves += caracter;
        }

        if (palabra.equals(palabraReves)) {
            System.out.println("La palabra introducida es palíndromo");
        } else {
            System.out.println("La palabra introducida no es un palíndromo");
        }
    }
}
