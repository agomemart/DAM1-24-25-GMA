package ud6.practicaex;

public class ReferenciasMetodos {
    public static Integer cubo(Integer x) {
        return x * x * x;
    }

    public static Double raiz3(Double x) {
        return Math.cbrt(x);
    }

    public static Double raizN(Double base, Integer n) {
        return Math.pow(base, 1.0 / n);
    }

    public Integer cuadrado(Integer x) {
        return x * x;
    }
}
