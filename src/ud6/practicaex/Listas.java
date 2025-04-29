package ud6.practicaex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<Integer>();
        Scanner  sc = new Scanner(System.in);
        int numero = 0;
        do{
            numero = sc.nextInt();
            if (numero >= 0) {
                listaEnteros.add(numero);
            }
        } while (numero >= 0);

        Iterator<Integer> it = listaEnteros.iterator();
        while (it.hasNext()) {
            if (it.next() % 3 == 0) {
                it.remove();
            }
        }

        List<Integer> elementosPares = new ArrayList<>();
        for (Integer e : listaEnteros) {
            if (e % 2 == 0) {
                elementosPares.add(e);
            }
        }
        listaEnteros.addAll(elementosPares);

        System.out.println(listaEnteros);
    }
}
