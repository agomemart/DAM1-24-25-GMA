package ejrec;

import java.util.Scanner;

public class ReemplazarLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta una frase: ");
        String frase = sc.nextLine();
        sc.close();

        frase = frase.replaceAll("a", "@");

        System.out.println(frase);
    }
}
