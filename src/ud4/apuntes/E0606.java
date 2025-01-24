package ud4.apuntes;

import java.util.Scanner;

public class E0606 {
    static String sinVocales(String cad) {
        String sinVocales = "";
        String vocales= "aeiouáéíúóAEIOUÁÉÍÓÚüÜ";

        for (int i = 0; i < cad.length(); i++) {
            char ch = cad.charAt(i);
            if (vocales.indexOf(ch) == -1){
                sinVocales += ch;
            }
        }
        return sinVocales;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre: ");
        String nombre = sc.nextLine();

        System.out.println(sinVocales(nombre));
    }
}
