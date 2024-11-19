package ud2.ejerciciosfunciones;
/*Implementa la función
static double distancia (double x1, double y1, double x2, double
y2)
que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2). La
fórmula para calcular esta distancia es:
distancia = (𝑥1 − 𝑥2)² + (𝑦1 − 𝑦2)² */
public class EP0412 {
    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    public static void main(String[] args) {
        System.out.println(distancia(12, 4, 44, 2));
    }
}
