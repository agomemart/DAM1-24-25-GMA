package ud2.ejerciciosfunciones;
/*
 *  Diseñar una función recursiva que calcule el enésimo término de la serie de
Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores anteriores
de la serie, es decir:
fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
fibonacci(1) = 1
fibonacci(0) = 1
 */
public class E0412 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(11));
    }
}
