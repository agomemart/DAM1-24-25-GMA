package ud1.ejercicios;

import java.util.Scanner;

/**
 *  Dado el siguiente polinomio de segundo grado:
y = ax^2 + bx + c
crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
correspondiente de y.
 */
public class EP013 {
    public static void main(String[] args) {
        double x;
        double y;
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Inserta el coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Inserta el coeficiente c: ");
        c = sc.nextDouble();
        System.out.print("Inserta el valor de x: ");
        x = sc.nextDouble();
        sc.close();
        
        y = a*Math.pow(x, 2) + b*x + c;
        System.out.println("La y vale: " + y);

    }
}
