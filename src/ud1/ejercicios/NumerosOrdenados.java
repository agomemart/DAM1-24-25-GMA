package ud1.ejercicios;
/*
 * Escribe un programa que lea 3 números por teclado e indique si están ordenados o no, de
menor a mayor, y de mayor a menor.
 */
import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el primer número: ");
        n1 = sc.nextInt();
        System.out.print("Inserta el segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Inserta el tercer número: ");
        n3 = sc.nextInt();
        sc.close();

        String resultado = (n1 >= n2 && n2 >= n3) ? "Están ordenados de mayor a menor" :
                            (n1 <= n2 && n2 <= n3) ? "Esán ordenados de menor a mayor" :
                            "Están desordenados";

        System.out.println(resultado);
    }
}
