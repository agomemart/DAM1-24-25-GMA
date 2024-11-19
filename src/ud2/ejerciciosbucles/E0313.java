package ud2.ejerciciosbucles;

import java.util.Scanner;

/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota
igual a 4) y suspensos. */
public class E0313 {
    public static void main(String[] args) {
        int nota = 0;
        int contadorSuspensos = 0;
        int contadorAprobados = 0;
        int contadorCondicionados = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 6; i ++) {
            
            System.out.print("Introduce la nota del alumno: ");
            nota = sc.nextInt();
            
            if (nota < 5) {
                contadorSuspensos++;
            } else if (nota >= 4 && nota < 5) {
                contadorCondicionados++;
            } else {
                contadorAprobados++;
            }
        }
        System.out.println("Número de aprobados: " + contadorAprobados);
        System.out.println("Número de condicionados: " + contadorCondicionados);
        System.out.println("Número de suspensos: " + contadorSuspensos);
        sc.close();
    }
}
