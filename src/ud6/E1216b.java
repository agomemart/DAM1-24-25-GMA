package ud6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class E1216b {
    public static void main(String[] args) {
        Collection<Integer> numerosPositivos = new ArrayList<>();
        Collection<Integer> numerosNegativos = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            int e = rnd.nextInt(201) - 100;
            if (e >= 0) {
                numerosPositivos.add(e);
            } else if (e < 0) {
                numerosNegativos.add(e);
            }
        }
        
        System.out.println("Números positivos: " + numerosPositivos);
        getSuma(numerosPositivos);

        System.out.println("Números negativos: " + numerosNegativos);
        getSuma(numerosNegativos);

        Iterator<Integer> it = numerosPositivos.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero > 10) {
                it.remove();
            }
        }
        System.out.println(numerosPositivos);

        it = numerosNegativos.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero > 10) {
                it.remove();
            }
        }
        System.out.println(numerosNegativos);
    }

    private static void getSuma(Collection<Integer> numerosPositivos) {
        int suma = 0;
        for(Integer numero : numerosPositivos) {
            suma += numero;
        }
        System.out.println("Suma: " + suma);
    }
}
