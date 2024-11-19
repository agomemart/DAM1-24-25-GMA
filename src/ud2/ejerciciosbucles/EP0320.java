package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
 * Escribe un programa que solicite al usuario las distintas cantidades de dinero de
las que dispone. Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en
un cajón y en los bolsillos. La aplicación mostrará la suma total de dinero de la que dispone
el usuario.
La manera de especificar que no se desea introducir más cantidades es mediante el cero.
 */
public class EP0320 {
    public static void main(String[] args) {
        double totalDinero = 0.0;
        double dineroUsuario = 0;
        Scanner sc = new Scanner(System.in);

       do {
        System.out.print("Introduce la cantidad de dinero que tienes: ");
        dineroUsuario = sc.nextDouble();
        totalDinero += dineroUsuario ; 
        System.out.println("Total dinero: " + totalDinero);
        } while (dineroUsuario != 0);
        sc.close();
        
    }
}
