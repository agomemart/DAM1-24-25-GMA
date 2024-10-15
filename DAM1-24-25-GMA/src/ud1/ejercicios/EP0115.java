package ud1.ejercicios;

import java.util.Scanner;

/**
 * Convertir un número de segundos introducido por teclado en horas, minutos y
segundos.
 */
public class EP0115 {
    public static void main(String[] args) {
        double segundos;
        double minutos;
        double horas;

        Scanner sc = new Scanner(System.in);
        System.out.println("Pasar de segundos a horas, minutos y segundos");
        System.out.println("Inserta los segundos: ");
        segundos = sc.nextInt();
        sc.close();
        
        horas = segundos/3600;
        minutos = horas*60;
        int segundosFinal = (int)minutos*60;

        System.out.println("En horas: " + horas + "h, minutos: " + minutos + "min" + "y segundos: " + segundosFinal);
    }
}
