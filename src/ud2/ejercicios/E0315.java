package ud2.ejercicios;
/* Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos
de lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4: */
import java.util.Scanner;

import ud2.Util;

public class E0315 {
    public static void main(String[] args) {
        System.out.print("Inserta un número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Util.imprimirTrianguloRectangulo(n);
        Util.imprimirTrianguloRectanguloInverso(n);
    }
}
