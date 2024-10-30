package ud1.ejercicios;

import java.util.Scanner;

/**
 * Convertir un número de horas, minutos y segundos introducidos por teclado en un
número total de segundos.
 */
public class EP0114 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Pasa de horas, minutos y segundos a segundos");
        System.out.print("Inserta las horas: ");
        horas = sc.nextInt();
        System.out.print("Inserta los minutos: ");
        minutos = sc.nextInt();
        System.out.print("Inserta los segundos: ");
        segundos = sc.nextInt();
        sc.close();
        
        int totalSegundos = horas*3600 + minutos*60 + segundos;
        System.out.println("En segundos serían: " + totalSegundos + " s");
    }
}
