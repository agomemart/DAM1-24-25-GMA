package ud4.ejercicios;
/*
* Calcular la media de una serie de números que se leen por teclado
* */
import java.util.Scanner;

public class EjArrays01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[10];
        double media = 0;
        int totalNotas = 0;

        System.out.print("Ingrese 10 notas: ");

        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
            totalNotas += t[i];
        }

        media = (double)totalNotas / t.length;
        System.out.println("La media es: " + media);
    }
}
