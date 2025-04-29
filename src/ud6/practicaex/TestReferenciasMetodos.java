package ud6.practicaex;

import java.util.function.Function;

public class TestReferenciasMetodos {
    public static void main(String[] args) {
        // Referencia a método estático
        Function<Integer, Integer> fCubo = ReferenciasMetodos::cubo;
        System.out.println(fCubo.apply(3)); // 27

        // Referencia a método no estático
        ReferenciasMetodos calc = new ReferenciasMetodos();
        Function<Integer, Integer> fCuadrado = calc::cuadrado;
        System.out.println(fCuadrado.apply(4)); // 16

        // Referencia a método estático de la API
        Function<Double, Double> fRaiz = Math::sqrt;
        System.out.println(fRaiz.apply(16.0)); // 4.0

        // Referencia a método raíz cúbica
        Function<Double, Double> fRaiz3 = ReferenciasMetodos::raiz3;
        System.out.println(fRaiz3.apply(27.0));
    }
}
