package ud6.practicaex;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoInterseccion {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto1.add(4);
        conjunto1.add(5);

        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(1);
        conjunto2.add(2);
        conjunto2.add(9);
        conjunto2.add(12);
        conjunto2.add(11);

        conjunto1.retainAll(conjunto2);
        System.out.println(conjunto1);
    }
}
