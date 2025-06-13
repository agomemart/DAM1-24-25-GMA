package ejrec;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FechasAleatorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento:");
        System.out.print("Día: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int año = sc.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);

        System.out.printf("Tienes %d años, %d meses y %d días.\n",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
