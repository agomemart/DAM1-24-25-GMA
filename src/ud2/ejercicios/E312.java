package ud2.ejercicios;

import java.util.Scanner;

/*Pedir 5 calificaciones y decir si hay algún suspenso */
public class E312 {
    public static void main(String[] args) {
        int contador = 0;
        double notaAlumno = 0;
        Scanner sc = new Scanner(System.in);

        while (contador <= 5) {
            System.out.println("Inserta la nota del alumno");
            notaAlumno = sc.nextDouble();
            if (notaAlumno >= 0 && notaAlumno <= 10){
                System.out.println("Nota introducida correctamente");
            } if (notaAlumno >=5) {
                System.out.println("Aprobado");
            } if (notaAlumno < 5) {
                System.out.println("Suspenso");
            } else {
                System.out.println("Nota introducida no válida");
            }
            contador++;
        }
        sc.close();
    }
}
