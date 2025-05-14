package ud6.practicaex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        Collection<Integer> coleccion1 = new ArrayList<Integer>();
        coleccion1.add(3);
        coleccion1.add(1);
        coleccion1.add(2);

        List<Integer> lista = new ArrayList<>(coleccion1);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        Collections.reverse(lista);
        System.out.println("Lista invertida: " + lista);

        Collections.shuffle(lista);
        System.out.println("Lista aleatoria: " + lista);

        int contadorNumero = Collections.frequency(coleccion1, 1);
        System.out.println("El numero 1 aparece: " + contadorNumero + " veces.");
    }
}
