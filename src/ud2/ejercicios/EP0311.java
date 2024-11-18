package ud2.ejercicios;

import java.util.Scanner;

public class EP0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número en base decimal: ");
        int n = sc.nextInt();
        sc.close();
        String binario = "";

        while (n / 2 > 0) {
            binario = (n % 2) + binario;
            n = n / 2;
        }
        binario = n + binario;

        System.out.println(binario);
    }
}