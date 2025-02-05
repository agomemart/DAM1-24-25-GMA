package ud4.apuntes;

import java.util.Scanner;

public class EjemploRegEx {
    public static void main(String[] args) {
        String respuesta;
        boolean siguePatron = false;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Escribe un texto: ");
            respuesta = sc.nextLine();
            siguePatron = respuesta.matches("--[0-9]{3}[A-Z]+");
            if (!siguePatron) {
                System.out.println("La expresión no encaja con el patrón.");
            }
        } while (!siguePatron);
        System.out.println("Expresión correcta!!");
    }
}
