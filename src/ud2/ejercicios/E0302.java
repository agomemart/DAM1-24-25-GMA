package ud2.ejercicios;

import java.util.Scanner;

/*
 *  Implementar una aplicación para calcular datos estadísticos de las edades de los
alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea
negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número
de alumnos y cuántos son mayores de edad.
 */
public class E0302 {
    public static void main(String[] args) {
        int edad;
        int contador = 0;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta una edad: ");
        edad = sc.nextInt();

        while (edad > 0) {
            int suma = edad;
             int sumaEdades = edad + suma;
             int media =  sumaEdades /contador;
             int totalAlumnos = contador;
             if (contador == 0) {
                contador = 0;
             } else {
                contador ++;
             }
             if (edad >= 18) {
                System.out.println("Es mayor de edad");
             } else {
                System.out.println("No es mayor de edad");
             }
             System.out.println("La suma de las edaes es de: "+ sumaEdades);
             System.out.println("La media de las edaes es de: "+ media);
             System.out.println("El número total de alumnos es de " + totalAlumnos);
            System.out.println("Inserta una edad: ");
            edad = sc.nextInt();
        }
        sc.close();
    }
}
