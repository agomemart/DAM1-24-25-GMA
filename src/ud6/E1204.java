package ud6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class E1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<Integer>();

        System.out.print("Inserta números enteros no negativos (-1 para terminar): ");
        int n = sc.nextInt();
        while(n != -1) {
            numeros.add(n);
            n = sc.nextInt();
        }
        sc.close();

        System.out.println(numeros);

        System.out.println("Números pares: ");
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero + " ");
            }
        }
        System.out.println();

        System.out.println("Sin múltiplos de 3: ");
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero % 3 == 0) {
                it.remove();
            }
        }
        System.out.println(numeros);
    }
}
