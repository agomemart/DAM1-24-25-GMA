package ud2.practicando;

public class Factorial {
    public static void factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
    }
    System.out.println(factorial);
}
public static void main(String[] args) {
    factorial(4);
}
}
