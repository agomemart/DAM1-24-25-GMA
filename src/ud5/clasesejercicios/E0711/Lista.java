package ud5.clasesejercicios.E0711;

import java.util.Arrays;

public class Lista {
    Integer[] t = new Integer[0];

    public Lista(Integer[] t) {
        this.t = t;
    }

    public Integer obtenerElementosInsertados(Integer[] t) {
        Integer elemInsertados = 0;
        for (int i = 0; i < t.length; i++) {
            elemInsertados = t[i];
        }
        return elemInsertados;
    }

    public void insertarNumero(Integer n) {
        Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = n;
    }

    public void insertarNumPosicion(Integer n, int posicion) {
        Arrays.copyOf(t, t.length + 1);
        t[posicion] = n;
    }

    public void insertarLista(Integer[] t2) {
        Arrays.copyOf(t, t.length + t2.length);
        for (int i = t.length - 1; i < t2.length; i++) {
            t[i] = t2[i];
        }
    }

    public void eliminarElemento(int posicion) {
        Arrays.copyOf(t, t.length - 1);
    }

    public Integer obtenerElemento(int posicion) {
        return t[posicion];
    }

    public int buscarElemento(Integer num) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == num) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < t.length; i++) {
            str += t[i] + ", ";
        }
        return str;
    }
}
