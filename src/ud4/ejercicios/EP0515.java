package ud4.ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
* Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
* Los alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (números enteros) del primer,
* segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media del grupo en cada trimestre y
* la media del alumno que se encuentra en una posición dada (que el usuario introduce por teclado).
* */
public class EP0515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[5][3];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Introduzca la nota del " + (j + 1) + " trimestre del alumno " + (i + 1) + ":");
                notas[i][j] = sc.nextInt();
            }
        }
        int sumaNotas1Trimestre = 0;
        int sumaNotas2Trimestre = 0;
        int sumaNotas3Trimestre = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas1Trimestre = notas[i][0];
            sumaNotas2Trimestre = notas[i][1];
            sumaNotas3Trimestre = notas[i][2];
        }
        double media1Trimestre = (double)sumaNotas1Trimestre / notas.length;
        double media2Trimestre = (double)sumaNotas2Trimestre / notas.length;
        double media3Trimestre = (double)sumaNotas3Trimestre / notas.length;

        System.out.println("lA MEDIA DEL 1 TRIMESTRE: " + media1Trimestre);
        System.out.println("lA MEDIA DEL 2 TRIMESTRE: " + media2Trimestre);
        System.out.println("lA MEDIA DEL 3 TRIMESTRE: " + media3Trimestre);

        System.out.println("Inserta el alumno del que quieras saber la media (1-5): ");
        int alumno = sc.nextInt();

        int sumaNotasAlumno = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                sumaNotasAlumno = notas[alumno - 1][j];
            }
        }
        double mediaAlumno = (double)sumaNotasAlumno / notas[0].length;
        System.out.println("Media alumno " + alumno + ": " + mediaAlumno);
    }
}
