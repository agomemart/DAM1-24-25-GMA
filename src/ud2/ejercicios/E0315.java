package ud2.ejercicios;

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
