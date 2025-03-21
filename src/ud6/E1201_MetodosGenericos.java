package ud6;

import java.util.Arrays;

public class E1201_MetodosGenericos {
    public static <U> U[] add(U e, U[] t) {
        U[] t2= Arrays.copyOf(t, t.length + 1);
        t2[t2.length -1] = e;
        return t2;
    }
    public static <U> boolean buscar(U e, U[] t) {
        for (U u : t) {
            if ((e == null && t == null) || (t != null && e == null)) {
                return true;
            }
            if (t.equals(e)) {
                return true;
            }
        }
        return false;
    }
    public static <U> U[] concatenar(U[] t1, U[] t2) {
        U[] t3 = Arrays.copyOf(t1, t1.length + t2.length);
        for (int i = 0; i < t2.length; i++) {
            t3[t1.length + i] = t2[i];
        }
        return t3;
    }
    public static <U, V> Object[] concatenar2(U[] t1, V[] t2) {
        U[] t3 = Arrays.copyOf(t1, t1.length + t2.length);
        for (int i = 0; i < t2.length; i++) {
            //t3[t1.length + i] = t2[i];
        }
        return t3;
    }
}