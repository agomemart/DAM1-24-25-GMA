package ud6.gmaexamenrec.genericos;

import java.util.*;

//Adrián Gómez Martínez
public class UtilGenerico {
    public static <T> int contarCoincidencias(Collection<T> c1, Collection<T> c2) {
        int tamañoInicial = c1.size();
        c1.removeAll(c2);
        return tamañoInicial - c1.size();
    }

    public static <K, V> Map<V, List<K>> invertirOrden(Map<K, V> mapa) {
        Map<V, List<K>> resultado = new HashMap<>();
        List<K> listaClaves = new ArrayList<>();

        for (K clave : mapa.keySet()) {
            listaClaves.add(clave);
        }

        Collections.sort(listaClaves, (c1, c2) -> c2.toString().compareTo(c1.toString()));

        for (V valor : mapa.values()) {
            resultado.put(valor, listaClaves);
        }
        return resultado;
    }
}
