package ud2.practicando;

public class NumeroPrimo {
    public static boolean esPrimo(int num) {
        if (num % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(esPrimo(num));
    }
}
