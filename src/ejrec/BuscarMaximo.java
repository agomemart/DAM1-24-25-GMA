package ejrec;

public class BuscarMaximo {
    public static <T extends Comparable<T>> T buscarMaximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        int maxEntero = buscarMaximo(10, 20, 15);
        String maxTexto = buscarMaximo("Hola", "Adiós", "Zorro");
        double maxDouble = buscarMaximo(3.14, 2.71, 9.81);

        System.out.println("Máximo entero: " + maxEntero);     // 20
        System.out.println("Máximo texto: " + maxTexto);       // Zorro
        System.out.println("Máximo decimal: " + maxDouble);    // 9.81
        }
}
