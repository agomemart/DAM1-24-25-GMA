package ud5.apuntesinterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class E0910 {
    static Integer[] generarArrayAleatorio() {
        Random rnd = new Random();
        Integer[] t = new Integer[20];
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(1,100);
        }
        return t;
    }

    public static void main(String[] args) {
        Integer[] tabla = new Integer[20];
        tabla = generarArrayAleatorio();

        Arrays.sort(tabla, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return -i1 - i2;
            }
        });
        System.out.println(Arrays.toString(tabla));
    }
}
