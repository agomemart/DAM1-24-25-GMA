package ud2.ejercicios;

import java.util.Scanner;

public class E0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n = sc.nextInt();
        sc.close();

        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.printf("El factorial de %s es %s %n", n, factorial);
    }
}
