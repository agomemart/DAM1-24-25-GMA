package ud2.practicando;

public class NumerosPares {
    public static void imprimirPares(int n, int fin) {
        for (int i = 0; i < fin; i ++) {
            System.out.println(n);
            n += 2;
        }
    }
    public static void main(String[] args) {
        imprimirPares(4, 4);
    }
}
