package ud4.practicaexamen;

import java.util.Scanner;

public class CadenaDeSubcadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine().toLowerCase().replaceAll("\\s+", " ");
        System.out.print("Ingresa el sufijo que deseas buscar en la cadena: ");
        String sufijo = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].endsWith(sufijo)) {
                System.out.println("La palabra: " + palabras[i] + " contiene el sufijo pasado: " + sufijo);
            }
        }
    }
}
