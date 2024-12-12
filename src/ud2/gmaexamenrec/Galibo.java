//Adrián Gómez Martínez
package ud2.gmaexamenrec;

import java.util.Scanner;

/*
 * Escribe un programa que lea el número de puentes o túneles (hasta 100) que hay en el 
trayecto que se desea hacer. A continuación, para cada uno se leerá de teclado el número 
de carriles que pasan por debajo (como mucho 5) y la altura de cada uno de los carriles en 
centímetros (un número entre 200 y 800).
Para terminar, el programa escribirá en pantalla la altura máxima que puede tener el camión 
para poder realizar el trayecto, teniendo en cuenta que éste puede utilizar cualquiera de los 
carriles disponibles, incluido el de mayor gálibo,  en cada puente/túnel.
 */
public class Galibo {
    public static void main(String[] args) {
        int numPuentes;
        int numCarriles;
        int alturaCarriles = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta el número de puentes: ");
        numPuentes = sc.nextInt();

        if (numPuentes > 0 && numPuentes <= 100) {
            for (int i = 0; i < numPuentes; i++) {
                System.out.print("Inserta el número de carriles: ");
                numCarriles = sc.nextInt();
                System.out.println("Puente " + i + ", carriles " + numCarriles);

                if (numCarriles > 0 && numCarriles <= 5) {
                    for (int j = 0; j < numCarriles; j++) {
                        System.out.print("Inserta la altura de los carriles: ");
                        alturaCarriles = sc.nextInt();

                        if (alturaCarriles >= 200 && alturaCarriles <= 800) {
                            System.out.println("Carril " + j + ", altura " + alturaCarriles);
                        } else {
                            System.out.println("Error: Altura de carril fuera de rango");
                        }
                    }
                } else {
                    System.out.println("Error: Numero de carriles fuera de rango");
                }
            }
        } else {
            System.out.println("Error: Numero de puentes fuera de rango");
        }
        double alturaMaxCamion = alturaCarriles;
        System.out.println("Altura máxima camión: " + alturaMaxCamion);
        sc.close();
    }
}
