package ud4.practicaexamen;

import java.util.Scanner;

public class AnalisisTextoEstadisticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String texto = sc.nextLine();

        System.out.println("Número de palabras del texto: " + contarPalabrasTexto(texto));
        System.out.println("Palabra más larga: " + palabraMasLarga(texto));
        System.out.println("Palabra más corta: " + palabraMasCorta(texto));
        System.out.println("Número de vocales en el texto: " + contarVocales(texto));
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido(texto));
    }

    public static int contarPalabrasTexto(String texto) {
        String[] palabras = texto.split("\\s+");
        return palabras.length;
    }

    public static String palabraMasCorta(String texto) {
        texto = texto.toLowerCase();
        String[] palabras = texto.split("\\s+");
        String palabraMasCorta = palabras[0];
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() <= palabraMasCorta.length()) {
                palabraMasCorta = palabras[i];
            }
        }
        return palabraMasCorta;
    }

    public static String palabraMasLarga(String texto) {
        texto = texto.toLowerCase();
        String[] palabras = texto.split("\\s+");
        String palabraMasLarga = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }
        return palabraMasLarga;
    }

    public static int contarVocales(String texto) {
        texto = texto.toLowerCase();
        String[] palabras = texto.split("\\s+");
        int numVocales = 0;
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                char letra = palabras[i].charAt(j);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    numVocales++;
                }
            }
        }
        return numVocales;
    }

    public static String textoInvertido(String texto) {
        texto = texto.toLowerCase();
        String[] palabras = texto.split(" ");
        String textoInvertido = "";
        for (int i = 0; i < palabras.length; i++) {
            textoInvertido += palabras[palabras.length - i - 1] + " ";
        }
        return textoInvertido;
    }
}