package ud6.practicaex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("uno", "dos", "tres"));

        Iterator<String> itDelante = lista.iterator();
        while (itDelante.hasNext()) {
            System.out.println(itDelante.next());
        }

        for (int i = lista.size(); i > 0; i--) {
            System.out.println(lista.get(i - 1));
        }
    }
}
