package ud4.cadenasejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
* Escribe un programa en Java que implemente un juego del ahorcado. El programa debe elegir una palabra
* aleatoriamente y luego mostrar al usuario una serie de guiones bajos que representan las letras de la palabra.
* El usuario debe adivinar las letras de la palabra una por una, y si adivina una letra correctamente, el programa
* debe reemplazar los guiones bajos correspondientes con la letra adivinada. El juego termina cuando el usuario adivina
* todas las letras de la palabra o cuando se equivoca demasiadas veces
* */
public class EjCadenas06 {
    static String palabraAleatoria(String[] palabras) {
        if (palabras == null || palabras.length == 0) {
            return null;
        }
        Random random = new Random();
        int indiceAleatorio = random.nextInt(palabras.length);
        return palabras[indiceAleatorio];
    }

    public static boolean palabraAcertada(char[] palabraOculta, String palabraSecreta) {
        return new String(palabraOculta).equals(palabraSecreta);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = {"perro", "ordenador", "aspiradora", "lampara", "programacion"};
        String palabra = palabraAleatoria(palabras);

        char[] tablero = new char[palabra.length()];
        Arrays.fill(tablero, '_');

        System.out.println("Adivina la palabra:");
        System.out.println(Arrays.toString(tablero));

        int FALLOS_MAXIMOS = 6;
        int fallosPartida = 0;
        while (fallosPartida < FALLOS_MAXIMOS && !palabraAcertada(tablero, palabra)) {
            System.out.print("Inserta una letra: ");
            char letra;

            do {
                System.out.print("Inserta una letra: ");
                try {
                    String input = sc.nextLine().toLowerCase();
                    if (input.isEmpty()) {
                        System.out.println("Por favor, ingresa al menos una letra.");
                        continue;
                    }
                    letra = input.charAt(0);
                    break;
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Por favor, ingresa al menos una letra.");
                }
            } while (true);

            boolean letraAcertada = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    tablero[i] = letra;
                    letraAcertada = true;
                }
            }
            if (!letraAcertada) {
                fallosPartida++;
                System.out.println("Letra incorrecta. Fallos: " + fallosPartida + "/" + FALLOS_MAXIMOS);
            } else {
                System.out.println("¡Letra correcta!");
            }

            System.out.println(Arrays.toString(tablero));

            if (palabraAcertada(tablero, palabra)) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
                break;
            }
        }
        if (fallosPartida >= FALLOS_MAXIMOS) {
            System.out.println("¡Has perdido! La palabra era: " + palabra);
        }
    }
}