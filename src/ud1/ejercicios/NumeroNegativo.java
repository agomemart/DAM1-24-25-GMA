package ud1.ejercicios;
/*
 * Escribe un programa en Java que solicite un número al usuario y determine si es positivo, negativo o cero. Utiliza operadores ternarios para hacer esta verificación.

Requisitos:
El programa debe pedir un número al usuario.
Debe usar operadores ternarios para determinar si el número es positivo, negativo o cero.
Debe mostrar el resultado correspondiente.
 */
import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número positivo o negativo: ");
        num = sc.nextInt();
        sc.close();

        String numPositivoONegativo = (num > 0) ? "El número introducido es positivo" :
                                    (num == 0) ? "El número introducido es cero" : 
                                    "El número introducido es negativo";

        System.out.println(numPositivoONegativo);
    }
}
