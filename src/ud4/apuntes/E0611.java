package ud4.apuntes;
/*
* Realizar un programa que codifique un texto
* */
import java.util.Scanner;

public class E0611 {
    static char codifica(char conjunto1[], char conjunto2[], char c) {
        return ' ';
    }
    static char codifica(String conjunto1, String conjunto2, char c) {
        return ' ';
    }
    static String codifica(char conjunto1[], char conjunto2[], String frase) {
        frase = frase.toLowerCase();
        for (int i = 0; i < conjunto1.length; i++) {
            frase = frase.replace(conjunto1[i], conjunto2[i]);
        }
        return frase;
    }
    static String codifica(String conjunto1, String conjunto2, String frase) {
        String fraseCodificada = "";
        for (int i = 0; i < frase.length(); i++) {
            char letraActual = Character.toLowerCase(frase.charAt(i));
            int posicion = conjunto1.indexOf(letraActual);
            if (posicion == -1) {
                fraseCodificada += letraActual;
            } else {
                fraseCodificada += conjunto2.charAt(posicion);
            }
        }
        return fraseCodificada;
    }
    public static void main(String[] args) {
        String conjunto1 = "eikmpqrstuv";
        String conjunto2 = "pviumterkqs";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase para codificar");
        String frase = sc.nextLine();
        sc.close();

        String fraseCodificada = codifica(conjunto1, conjunto2, frase);
        System.out.println(fraseCodificada);

        String fraseCodificada2 = codifica(conjunto1.toCharArray(), conjunto2.toCharArray(), frase);
        System.out.println(fraseCodificada2);
    }
}
