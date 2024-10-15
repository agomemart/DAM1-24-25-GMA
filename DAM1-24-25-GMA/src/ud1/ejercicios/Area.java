package ud1.ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa en Java que solicite al usuario el radio de un círculo y el lado de un cuadrado. 
 * El programa debe calcular las áreas de ambas figuras y mostrar la suma de las áreas.
 */
public class Area {
    public static void main(String[] args) {
        double radioCirculo;
        double ladoCuadrado;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        radioCirculo = sc.nextDouble();

        System.out.print("Introduce el lado del cuadrado: ");
        ladoCuadrado = sc.nextDouble();
        sc.close();

        double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
        double areaCuadrado = ladoCuadrado*ladoCuadrado;
        double areaTotal = areaCirculo + areaCuadrado;

        System.out.printf("El total de area es de: %.2f", areaTotal);
    }
}
