package ud4.ejercicios;

import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class E0509 {
    public static void main(String[] args) {
        final int NUM = 5;
        Scanner sc = new Scanner(System.in);
        Double[] puntuaciones = new Double[NUM];

        System.out.println("Introduce las puntuaciones de " + NUM + " programadores");
        for(int i =0; i< NUM; i++) {
            puntuaciones[i] = sc.nextDouble();
        }
        Arrays.sort(puntuaciones, Collections.reverseOrder());
        System.out.println("Mejores puntuaciones: " + Arrays.toString(puntuaciones));

        System.out.print("Introduce las puntuaciones de los programadores de exhibición: ");
        double nota = sc.nextDouble();
        
        while (nota != -1) {
            Double[] tAux = new Double[puntuaciones.length + 1];
            int posicion = Arrays.binarySearch(puntuaciones, nota, Collections.reverseOrder());
            if (posicion < 0){
                posicion = -posicion -1;
            }
            System.arraycopy(posicion, 0, tAux, 0, posicion);
            tAux[posicion] = nota;
            System.arraycopy(puntuaciones, posicion, tAux, posicion + 1, puntuaciones.length - posicion);
            puntuaciones = tAux;

            nota = sc.nextDouble();
        }
        sc.close();

        System.out.println("Puntuaciones finales: " + Arrays.toString(puntuaciones));
    }
}
