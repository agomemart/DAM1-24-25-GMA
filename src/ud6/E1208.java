package ud6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class E1208 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Collection<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }

    }
}
