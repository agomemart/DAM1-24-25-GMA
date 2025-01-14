package ud4.ejercicios;

import java.util.Arrays;
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
        int numPersonas = 0;
        int importeSueldo = 0;
        double t1[] = new double[numPersonas];

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Inserta el importe de tu sueldo: ");
            importeSueldo = sc.nextInt();
            numPersonas++;
            if (importeSueldo != -1) {
                    t1[numPersonas] = importeSueldo;
                    numPersonas++;
            }
        } while (importeSueldo != -1);
        sc.close();
        
        if (numPersonas == 0) {
            System.out.println("No se ingresaron sueldos.");
            return;
        }

        // Redimensionar el array para ajustarse al número real de sueldos ingresados
        t1 = Arrays.copyOf(t1, numPersonas);

        // Ordenar sueldos en orden decreciente
        Arrays.sort(t1);
        for (int i = 0; i < numPersonas / 2; i++) {
            double temp = t1[i];
            t1[i] = t1[numPersonas - 1 - i];
            t1[numPersonas - 1 - i] = temp;
        }

        // Mostrar sueldos ordenados
        System.out.println("Sueldos en orden decreciente: " + Arrays.toString(t1));

        // Calcular sueldo máximo y mínimo
        double sueldoMaximo = t1[0];
        double sueldoMinimo = t1[numPersonas - 1];
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Sueldo mínimo: " + sueldoMinimo);

        // Calcular la media de los sueldos
        double suma = 0;
        for (double sueldo : t1) {
            suma += sueldo;
        }
        double media = suma / numPersonas;
        System.out.println("Media de los sueldos: " + media);

        // Contar sueldos por encima y por debajo de la media
        int porEncimaMedia = 0;
        int porDebajoMedia = 0;
        for (double sueldo : t1) {
            if (sueldo > media) porEncimaMedia++;
            if (sueldo < media) porDebajoMedia++;
        }

        System.out.println("Sueldos por encima de la media: " + porEncimaMedia);
        System.out.println("Sueldos por debajo de la media: " + porDebajoMedia);
    }
}
