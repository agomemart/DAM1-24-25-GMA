package ud6;

import java.util.Arrays;
import java.util.Comparator;

//E1202
public class ContenedorLista<T> {
    T[] objetos;

    public ContenedorLista(T[] t) {
        objetos = t;
    }

    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        System.arraycopy(objetos, 0, objetos, 1, objetos.length);
        objetos[0] = nuevo;
    }
    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }
    T extraerDelPrincipio() {
        return null;
    }
    T extraerDelFinal() {
        return null;
    }
    void ordenar() {
        Arrays.sort(objetos);
    }

    T get (int indice) {
        return objetos[indice];
    }

    T extract (int indice) {
        return null;
    }

    void ordenar (Comparator<T> c) {
        Arrays.sort(objetos, c);
    }

    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }

    public static void main(String[] args) {
        ContenedorLista<Integer> lista = new ContenedorLista<>(new Integer[0]);
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        System.out.println(lista);
    }
}