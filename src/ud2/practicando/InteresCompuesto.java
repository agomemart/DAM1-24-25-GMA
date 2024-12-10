package ud2.practicando;

public class InteresCompuesto {
    public static void interesCompuesto(int anho, double capital, double tasa) {
        double resultado = capital;
        for (int i = 1; i <= anho; i++) {
            resultado *= (1 + tasa);
            System.out.println(resultado);
        }
    }
    public static void main(String[] args) {
        interesCompuesto(3, 1000, 0.05);
    }
}
