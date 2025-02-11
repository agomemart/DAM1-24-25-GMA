package ud4.apuntes;
/*
* Implementar el juego del anagrama, que consiste en que un jugador escribe una
palabra y la aplicación muestra un anagrama (cambio del orden de los caracteres)
generado al azar.
A continuación, otro jugador tiene que acertar cuál es el texto original. La aplicación no
debe permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por ejemplo,
si el jugador 1 escribe “teclado”, la aplicación muestra como pista un anagrama al azar,
como por ejemplo: “etcloda”.
* */
import java.util.Random;
import java.util.Scanner;

public class E0614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador1: Introduzca una palabra: ");
        String palabra;
        do{
            palabra = sc.nextLine();
        } while (palabra.isEmpty());

        char[] letras = palabra.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            Random rnd = new Random(0);
            int nuevaPosicion = rnd.nextInt(letras.length);
            char letra = letras[nuevaPosicion];
            letras[nuevaPosicion] = letras[i];
            letras[i] = letra;
        }
        String anagrama = String.valueOf(letras);
        System.out.println("Anagrama: " + anagrama);

        //System.out.println(E0612.sonAnagrama(palabra, anagrama));
        final int MAX_INTENTOS = 3;
        int intentos = 0;
        String palabraJ2;
        do {
            System.out.print("Jugador2: Adivina la palabra original. Te quedan " + (MAX_INTENTOS - intentos) + " intentos: ");
            palabraJ2 = sc.nextLine();
            intentos++;
        } while (!palabraJ2.equalsIgnoreCase(palabra) && intentos < MAX_INTENTOS);

        if (palabraJ2.equalsIgnoreCase(palabra)) {
            System.out.println("Has acertado en " + intentos + " intentos.");
        } else {
            System.out.println("Has perdido. Has consumido " + intentos + " intentos.");
        }
    }
}