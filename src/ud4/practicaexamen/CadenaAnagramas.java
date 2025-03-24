package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Scanner;

public class CadenaAnagramas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        System.out.print("Ingresa otra palabra: ");
        String palabra2 = sc.nextLine();
        
        
        if (palabra.length() == palabra2.length()) {
            char[] charArray1 = palabra.toCharArray();
            char[] charArray2 = palabra2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("Son anagramas");
            } else {
                System.out.println("No son anagramas");
            }
        } else {
            System.out.println("No son anagramas");
        }
    }
}
