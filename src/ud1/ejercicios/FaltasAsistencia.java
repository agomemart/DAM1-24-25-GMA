/*
 * A partir del nombre y horas de un módulo de FP, por ejemplo, “Programación”, 240 horas.
No es necesario pedir estos datos por teclado. Codifícalos como constantes en tu programa
y utiliza el tipo de dato String para almacenar el nombre del módulo.
Calcula y muestra por pantalla:
1. nº de sesiones de 50’.
2. número de faltas sin justificar que implican un apercibimiento (>6%)
3. número de faltas sin justificar para pérdida de evaluación continua (>10%)
Solicita por teclado un número de faltas de un alumno concreto e indica si implica
apercibimiento, pérdida de evaluación continua o ningún problema.
¿Cuántas líneas de código tendrías que modificar en tu programa para que muestre los
datos relativos a otro módulo de FP? Por ejemplo:
● “Linguaxes de marcas e sistemas de xestión de información”, 133 horas
● “Bases de Datos”, 187 horas
 */
package ud1.ejercicios;
import java.util.Scanner;

public class FaltasAsistencia {
    public static void main(String[] args) {
        final int HORAS_TOTALES_PROGRAMACION = 240;

        double sesionesProgramacion = (HORAS_TOTALES_PROGRAMACION*60)/50.0;
        double apercibimientoProgramacion = (6/100.0)*sesionesProgramacion;
        double perdidaEvaluacionProgramacion = (10/100.0)*sesionesProgramacion;

        Scanner sc = new Scanner(System.in);
        System.out.print("Indica cuantas faltas tienes en el módulo de programación (sesiones): ");
        double numFaltasProgAlum = sc.nextDouble();
        sc.close();

        double faltasRestantesPerdida = perdidaEvaluacionProgramacion-numFaltasProgAlum;
        double faltasRestantesApercibimiento = apercibimientoProgramacion-numFaltasProgAlum;

        System.out.println("Para que te llegue un apercibimiento de faltas necesitas tener " + apercibimientoProgramacion + " faltas");
        System.out.println("A ti te queda para recibir el apercibimiento " + faltasRestantesApercibimiento + " faltas");
        System.out.println("Para perder la evaluación contínua necesitas tener " + perdidaEvaluacionProgramacion + " faltas");
        System.out.println("A ti te quedan " + faltasRestantesPerdida + " faltas para perder la evaluación contínua");

    }
}
