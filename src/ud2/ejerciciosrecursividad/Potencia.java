package ud2.ejerciciosrecursividad;

public class Potencia {
    public static double potenciaNumero(double a, double b) {
        double resultado = 1; 
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                resultado *= a;
            }
        } else {
            return -1;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(potenciaNumero(2, 3));
    }
}
