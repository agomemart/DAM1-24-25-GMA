package contornos;


public class NumberUtils {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; //cambio a FALSE
            }
            return true; //añado return a true
        }
        return false;
    }
}
