package ud4.practicaexamen;

import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseInvertida = "";
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine().toLowerCase().replaceAll("\\s+", " ");
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            fraseInvertida += palabras[palabras.length - i - 1] + " ";
        }
        System.out.println(fraseInvertida);
    }
}
