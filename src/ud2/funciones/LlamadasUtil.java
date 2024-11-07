package ud2.funciones;

import java.util.Scanner;

import ud2.Util;

public class LlamadasUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaDouble = 6.7;
        System.out.println(Util.notaEnTexto(notaDouble));
        int notaInt = 8;
        System.out.println(Util.notaEnTexto(notaInt));
        System.out.println("Inserta un número: ");
        int n = sc.nextInt();
        sc.close();

        if (Util.esPar(n)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        if (Util.esBisiesto(n)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        System.out.println(Util.mayor(4, 8));
        System.out.println(Util.mayor(15, 2));
    }
}
