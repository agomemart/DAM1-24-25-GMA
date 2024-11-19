package ud2.ejerciciosfunciones;

public class E0410 {
    public static double elevarCuadrado(double a, int n) {
        double resultado = 0;
        for (int i = 0; i < n; i++) {
            resultado = a * a;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(elevarCuadrado(2, 3));
    }
}
