package ud6.practicaex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MetodosGenericos <E>{
    public static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1); //Copia el primero
        resultado.addAll(conjunto2); //Añade los del segundo y no repite
        return resultado;
    }

    public static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.retainAll(conjunto2); //Solo deja los que están en ambos conjuntos
        return resultado;
    }

    public static <E> Set<E> diferencia(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.removeAll(conjunto2);
        return resultado;
    }

    public static <E> int numNulos(Set<E> conjunto) {
        int contador = 0;
        for (E e : conjunto) {
            if (e == null) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> b = new HashSet<>(Arrays.asList(2, 3, 4, 5));

        Set<Integer> union = union(a, b);
        Set<Integer> interseccion = interseccion(a, b);
        Set<Integer> diferencia = diferencia(a, b);

        System.out.println("Union: " + union);
        System.out.println("Interseccion: " + interseccion);
        System.out.println("Diferencia: " + diferencia);
    }
}