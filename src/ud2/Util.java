package ud2;

import java.util.Scanner;

public class Util {
    static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static boolean esBisiesto(int anho) {
        return anho % 400  == 0 || (anho % 4 == 0 && anho % 100 != 0);
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
    }
    static boolean esCasiCero(double n) {
        return n < 1 && n > 0 ? true : false; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un número: ");
        int n = sc.nextInt();
        sc.close();

        if (esPar(n)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        if (esBisiesto(n)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        System.out.println(mayor(4, 8));
        System.out.println(mayor(15, 2));
    }
}
