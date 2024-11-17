package ud2.ejercicios;

import java.util.Scanner;

/* Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos). */
public class E0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el día: ");
        int dia = sc.nextInt();
        System.out.print("Inserta el mes: ");
        int mes = sc.nextInt();
        System.out.print("Inserta el año: ");
        int anho = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia >= 1 & dia <= 31) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;
            case 2:
                if (((anho % 4 == 0) && !(anho % 100 == 0)) || ((anho % 100 == 0) && (anho % 400 == 0))) {
                    if (dia >= 1 & dia <= 29) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                } else {
                    if (dia >= 1 & dia <= 28) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                }
                break;
            case 4, 6, 9, 11:
                if (dia >= 1 & dia <= 30) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
                break;

            default:
                System.out.println("Fecha incorrecta");
                break;
        }
    }
}
