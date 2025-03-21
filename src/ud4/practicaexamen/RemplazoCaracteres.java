package ud4.practicaexamen;

import java.util.Scanner;

public class RemplazoCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String frase = sc.nextLine().toLowerCase().replaceAll("\\s+", " ");
        System.out.print("Caracter a remplazar: ");
        char caracter = sc.nextLine().charAt(0);

        String fraseModificada = frase.replace(caracter, '*');
        System.out.println(fraseModificada);
    }
}
