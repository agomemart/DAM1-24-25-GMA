package ud1.ejercicios.gma20241010;

import java.util.Scanner;

/*
 * Escribe un programa que tome como entrada un número entero e indique qué
cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7.
A 13 hay que sumarle 1 para que el resultado (13+1=14) sea múltiplo de 7.
Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1,
respectivamente.
Pista: El operador módulo puede ser muy útil para solucionar esta actividad.
 */
public class EP0129 {
    public static void main(String[] args) {
        int entero;

        System.out.print("Introduce un núemro entero: ");
        Scanner sc = new Scanner(System.in);
        entero = sc.nextInt();
        sc.close();
        
        int modEntero = entero % 7;
        int resultado = 7 - modEntero;
        int enteroFinal = entero + modEntero;
        resultado = (entero % 7 == 0) ? 0 : 7 - (entero % 7);

        System.out.println("Para que sea múltiplo de 7 habriá que sumarle " + resultado + " por lo que quedaría en " + enteroFinal);
    }
}
