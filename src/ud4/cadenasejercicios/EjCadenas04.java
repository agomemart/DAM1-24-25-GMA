package ud4.cadenasejercicios;

import java.util.Scanner;

/*
* Escribe un programa en Java que lea una cadena del usuario y luego imprima la cadena en orden inverso.
* Por ejemplo, si el usuario ingresa "Java", el programa debe imprimir "avaJ".
* */
public class EjCadenas04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String cadenaReves = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            char caracter = cadena.charAt(i);
            cadenaReves += caracter;
        }
        System.out.println(cadenaReves);
    }
}
