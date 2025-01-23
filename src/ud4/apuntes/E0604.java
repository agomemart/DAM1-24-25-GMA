package ud4.apuntes;

import java.util.Scanner;

/*
 * Diseña una aplicación que pida al usuario que introduzca una frase por teclado e
indique cuántos espacios en blanco tiene.
 */
public class E0604 {
    static int contarEspacios(String cad) {
        int numEspacios = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (Character.isSpaceChar(cad.charAt(i))) {
                numEspacios++;
            }
        }
        return numEspacios;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();
        sc.close();

        System.out.println("La frase tiene " + contarEspacios(frase) + " espacios en blanco");
    }
}
