package ud2.ejerciciosbucles;

import java.util.Scanner;

/*
 *  Implementar una aplicación que pida al usuario un número comprendido entre 1 y
10. Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que el
número introducido se encuentra en el rango establecido.
 */
public class E0309 {
    public static void main(String[] args) {
        int numUsuario = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta un número entre 1 y 10: ");
        numUsuario = sc.nextInt();
        sc.close();

        for (int contador = 0; contador <= 10; contador++){
            if (numUsuario > 0 & numUsuario <=10) {
                int resulMultip = numUsuario * contador;
                System.out.println(numUsuario + " x " + contador + " = " + resulMultip);
            }
        }
    }
}