package ud1.ejercicios;

import java.util.Scanner;

/*
 * La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante escribe un algoritmo en 
 * un papel y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso es que la longitud del lanzamiento se mide 
 * en metros (con tantos decimales como se desee), pero para el ranking solo se tiene en cuenta la longitud en centimetros (sin decimales). 
 * Por ejemplo, para un lanzamiento de 12,3456 m (que son 1234,56 cm) solo se contabilizarán 1234 cm.
 * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera correspondiente en centímetros.
 */
public class EP0131 {
    public static void main(String[] args) {
        double longMetros;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud en metros del lanzamiento: ");
        longMetros = sc.nextDouble();
        sc.close();

        double longCm = longMetros*100;
        int longCmEntero = (int)longCm;

        System.out.println("Tu lanzamiento fue de: " + longCmEntero + "cm");
    }
}
