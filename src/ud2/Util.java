package ud2;

import java.util.Scanner;

public class Util {

    public static void imprimirTrianguloRectangulo(int n) {
        for (int i= 0; i < n; i ++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void imprimirTrianguloRectanguloInverso(int n) {
        for (int i= 0; i < n; i ++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esBisiesto(int anho) {
        return anho % 400  == 0 || (anho % 4 == 0 && anho % 100 != 0);
    }

    public static int mayor(int a, int b) {
        return a > b ? a : b;
    }
    public static boolean esCasiCero(double n) {
        return n < 1 && n > -1 ? true : false; 
    }
    public static String notaEnTexto (int nota) {
        String notaEnTexto = "";

        switch (nota) {
            case 0, 1, 2, 3, 4:
                notaEnTexto = "insuficiente";
                break;
            case 5:
                notaEnTexto = "suficiente";
                break;
            case 6:
                notaEnTexto = "bien";
                break;
            case 7, 8:
                notaEnTexto = "notable";
                break;
            case 9, 10:
                notaEnTexto = "sobresaliente";
                break;
        }

        return notaEnTexto;
    }
    
    public static String notaEnTexto(double nota) {
        
        String notaEnTexto = "";

        if (nota >= 0 && nota < 5) {
            notaEnTexto = "insuficiente";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "notable";
        } else if (nota >= 9 && nota <= 10) {
            notaEnTexto = "sobresaliente";
        }

        return notaEnTexto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaDouble = 6.7;
        System.out.println(notaEnTexto(notaDouble));
        int notaInt = 8;
        System.out.println(notaEnTexto(notaInt));
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
