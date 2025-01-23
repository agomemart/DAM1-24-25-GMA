package ud4.apuntes;
/*
 * . Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la
que contiene menos caracteres
 */
import java.util.Scanner;

public class E0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase1 = sc.nextLine();
        System.out.print("Escribe otra frase: ");
        String frase2 = sc.nextLine();
        sc.close();

        if (frase1.length() > frase2.length()) {
            System.out.println("La frase más larga es la primera.");
        } else {
            System.out.println("La frase más larga es la segunda.");
        }
    }
}
