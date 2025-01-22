package ud4.ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa en Java que implemente un juego de tres en raya. El programa
debe permitir a dos jugadores jugar al juego turnándose para colocar fichas en un tablero de 3x3. El
juego termina cuando un jugador consigue tres fichas en línea (horizontal, vertical o diagonal)
Sugerencias:
a. Tablero como una matriz 3x3 char, 3 símbolos distintos.
b. 2 jugadores
c. iniciarTablero()
d. mostrarTablero()
e. leerMovimiento()
f. boolean comprobarVictoria()
 */
public class EjArrays11 {
    static void iniciarTablero(char tablero[][]){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void leerMovimientoJ1(char tablero[][]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica la coordenada en el eje x en la quieres mover la ficha: ");
        int ejeX = sc.nextInt();
        System.out.print("Indica la coordenada en el eje y en la quieres mover la ficha: ");
        int ejeY = sc.nextInt();
        tablero[ejeY - 1][ejeX - 1] = 'X';
    }
    static void leerMovimientoJ2(char tablero[][]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica la coordenada en el eje x en la quieres mover la ficha: ");
        int ejeX = sc.nextInt();
        System.out.print("Indica la coordenada en el eje y en la quieres mover la ficha: ");
        int ejeY = sc.nextInt();
        tablero[ejeY - 1][ejeX - 1] = 'O';
    }
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        
        iniciarTablero(tablero);
        mostrarTablero(tablero);
        boolean juegoActivo = true;
        while (juegoActivo) {
            System.out.println("Jugador 1, es su turno:");
            leerMovimientoJ1(tablero);
            mostrarTablero(tablero);
            System.out.println("Jugador 2, es su turno:");
            leerMovimientoJ2(tablero);
            mostrarTablero(tablero);
            if (tablero[1][1] < 0) {
                juegoActivo = false;
            }
        }
    }
}
