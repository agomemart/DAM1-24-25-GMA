package ud2.ejercicios;
/* Diseñar un programa que muestre la suma de los 10 primeros números impares. */
public class E0310 {
    public static void main(String[] args) {
        final int N = 10;
        int n = 1;
        for (int i = 1; i < N; i++) {
            System.out.println(n);
            n += 2;
        }
    }
}