package ud6;

import java.util.*;

public class E1206 {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }

        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();
        while(it.hasNext()) {
            Integer numero = it.next();
            if (numero == 5) {
                it.remove();
            }
        }

        System.out.println(numeros);

        it = numeros.iterator();
        while(it.hasNext()) {
            Integer numero = it.next();
            if (numero == 7) {
                it.remove();
            }
        }

        System.out.println(numeros);
    }
}
