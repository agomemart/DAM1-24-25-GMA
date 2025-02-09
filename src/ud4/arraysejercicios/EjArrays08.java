package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Leer el nombre y sueldo de 20 empleados y mostrar el nombre y sueldo del empleado
que más gana.
 */
public class EjArrays08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sueldos = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Inserta el sueldo del empleado " + i + ": ");
            sueldos[i] = sc.nextInt();
            if (sueldos[i] <= 0) {
                System.out.println("Sueldo no válido");
                break;
            }
        }
        sc.close();
        Arrays.sort(sueldos);
        System.out.println("El empleado que más gana tiene un sueldo de: " + sueldos[sueldos.length - 1] + " euros");
    }
}
