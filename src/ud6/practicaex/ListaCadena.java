package ud6.practicaex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaCadena {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Probando");
        listaCadenas.add(1, "elementoPos2");
        listaCadenas.removeLast();
        Collections.sort(listaCadenas);
        System.out.println(listaCadenas);
    }
}
