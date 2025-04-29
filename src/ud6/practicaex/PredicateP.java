package ud6.practicaex;

import java.util.function.Predicate;

public interface PredicateP<T> {
    boolean test(T t);

    public static void main(String[] args) {
        Predicate<Integer> esPositivo = x -> x > 0;
        Predicate<Integer> esPar = x -> x % 2 == 0;

        Predicate<Integer> esPositivoYPar = esPositivo.and(esPar);
        Predicate<Integer> esPositivoOPar = esPositivo.or(esPar);
        Predicate<Integer> noPositivo = esPositivo.negate();

        System.out.println(esPositivoYPar.test(4));
        System.out.println(esPositivoOPar.test(-2));
        System.out.println(noPositivo.test(-5));
    }


}
