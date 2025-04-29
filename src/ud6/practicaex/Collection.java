package ud6.practicaex;

import ud6.apuntescolecciones.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);

        List<Integer> copia = new ArrayList<>(listaEnteros);

        Collections.reverse(copia);

        System.out.println("Lista original: " + listaEnteros );
        System.out.println("Lista invertida: " + copia);

        List<Cliente> clientes = Cliente.clientesDeEjemplo();
        Collections.sort(clientes, (c1, c2) -> c1.getDni().compareTo(c2.getDni()));

        Comparator<Cliente> comp = (c1, c2) -> c1.getNombre().compareTo(c2.getNombre());
        Collections.sort(clientes, comp);
    }
}
