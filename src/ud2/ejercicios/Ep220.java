package ud2.ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa que solicite por teclado un nombre de usuario y
contraseña, y que compruebe si corresponden al usuario “admin” con contraseña “abc123.,”
indicando como resultado un mensaje apropiado.
*/
public class EP220 {
    public static void main(String[] args) {
        String nombreUsuario, contraseñaUsuario;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre de usuario: ");
        nombreUsuario = sc.nextLine();
        System.out.print("Introduce una contraseña: ");
        contraseñaUsuario = sc.nextLine();
        sc.close();

        if (nombreUsuario.equals("admin") && contraseñaUsuario.equals("abc123.,")) {
            System.out.println("Acceso autorizado, bienvenido!!");
        } else {
            System.out.println("Usuario y contraseña incorrectos");
        }
    }
}
