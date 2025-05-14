package ud6.practicaex;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalabras {
    public static void main(String[] args) {
        Set<String> conjuntoPalabras = new HashSet<>();
        conjuntoPalabras.add("hola");
        conjuntoPalabras.add("mundo");
        conjuntoPalabras.add("java");
        String palabraBuscada = "hola";

        if (conjuntoPalabras.contains(palabraBuscada)) {
            System.out.println("La palabra " + palabraBuscada + " está en el conjunto");
        } else {
            System.out.println("La palabra " + palabraBuscada + " no está en el conjunto");
        }
    }
}
