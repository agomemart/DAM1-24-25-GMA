package ud1.Identificadores;

import java.time.LocalDate;
import java.util.Scanner;

public class ApiScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cómo te llamas? ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + " estamos aprendiendo a programar");
        
        System.out.print("Que año naciste? ");
        int anhoNacimiento = sc.nextInt();
        int anhoActual = LocalDate.now().getYear();
        int edad = anhoActual - anhoNacimiento;
        System.out.println("Debes de tener unos " + edad + " años");
        sc.close();
    }
}
