package ud4.apuntes;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta una letra o un número: ");
        char caracter = sc.nextLine().charAt(0);
        do {
            Character.isWhitespace(caracter);
            System.out.println("Datos introducidos no válidos, vuelve a introducirlos correctamente");
            caracter = sc.nextLine().charAt(0);

        } while (Character.isWhitespace(caracter));

        sc.close();

        boolean comprobacion;

        comprobacion = Character.isDigit(caracter);
        System.out.println("Es digito: " + comprobacion);
        comprobacion = Character.isLetter(caracter);
        System.out.println("Es letra: " + comprobacion);
        comprobacion = Character.isLetterOrDigit(caracter);
        System.out.println("Es letra o digito: " + comprobacion);
        comprobacion = Character.isUpperCase(caracter);
        System.out.println("Es letra mayúscula: " + comprobacion);
        comprobacion = Character.isLowerCase(caracter);
        System.out.println("Es letra minúscula: " + comprobacion);

    }
}
