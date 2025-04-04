package ud6;

import java.util.*;

public class Sorteo<T> {

    Set<T> elementos;

    public Sorteo() {
        elementos = new HashSet<>();
    }

    boolean add (T elemento) {
        return elementos.add(elemento);
    }

    Set<T> premiados (int numPremiados) {
        if (numPremiados <= 0)
            return null;
        if (numPremiados > elementos.size())
            numPremiados = elementos.size();

        Set<T> premiados = new HashSet<>();

        List<T> lista = new ArrayList<>(elementos);
        Collections.shuffle(lista);

        for (int i = 0; i < numPremiados; i++) {
            premiados.add(lista.get(i));
        }

        return premiados;
    }
}
