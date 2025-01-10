package ud4.ejercicios;

import java.util.Scanner;

/*
 *  El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a 
realizar encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para 
ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de 
encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1. 
Una vez terminada la entrada de datos, muestra la siguiente información: 
●  Todos los sueldos introducidos ordenados de forma decreciente. 
●  El sueldo máximo y mínimo. 
●  La media de los sueldos. 
●  Cuántos sueldos hay por encima de la media. 
●  Cuántos sueldos hay por debajo de la media. 
 */
public class EP0514_Sueldos {
    public static void main(String[] args) {
        int numPersonas = 1;
        int importeSueldo = 0;
        int t1[] = new int[numPersonas];

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Inserta el importe de tu sueldo: ");
            importeSueldo = sc.nextInt();
            if (importeSueldo != -1) {
                for (int i = 0; i < t1.length; i++) {
                    t1[i] = importeSueldo;
                    numPersonas++;
                }
            } else {
                System.out.println("Fin programa");
            }
        } while (importeSueldo != -1);
        sc.close();
    }
}
