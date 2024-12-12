package ud3.otrosejercicios;

import java.util.Scanner;

public class StringInterger {
    public static void main(String[] args) {
        String num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un número: ");
        num1 = sc.nextLine();

        System.out.println("Inserta otro número: ");
        num2 = sc.nextLine();
        sc.close();

        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);

        Double max = Double.MIN_VALUE;
        Double min = Double.MAX_VALUE;

        if (n1 > max) {
            max = n1;
        }
        if (n1 < min) {
            min = n1;
        }
        if (n2 > max) {
            max = n2;
        }
        if (n2 < min) {
            min = n2;
        }

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
