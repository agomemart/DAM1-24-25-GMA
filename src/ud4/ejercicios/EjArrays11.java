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
    static void leerMovimiento(char tablero[][], int jugador){
        Scanner sc = new Scanner(System.in);
        char caracterJugador = (jugador == 1) ? 'X' : 'O'; // Determina el carácter según el jugador

        int ejeX, ejeY;

        while (true) {
            System.out.print("Indica la coordenada en el eje x (1-3): ");
            ejeX = sc.nextInt();
            System.out.print("Indica la coordenada en el eje y (1-3): ");
            ejeY = sc.nextInt();
            // Validar que las coordenadas estén dentro del rango 1-3
            if (ejeX < 1 || ejeX > 3 || ejeY < 1 || ejeY > 3) {
                System.out.println("Coordenadas fuera de rango. Intente nuevamente.");
                continue; // Solicita de nuevo las coordenadas
            }
            // Validar que la casilla no esté ocupada
            if (tablero[ejeY - 1][ejeX - 1] != '-') {
                System.out.println("La casilla ya está ocupada. Intente nuevamente.");
                continue; // Solicita de nuevo las coordenadas
            }
            // Si las coordenadas son válidas y la casilla está libre, realiza el movimiento
            tablero[ejeY - 1][ejeX - 1] = caracterJugador;
            break; // Sal del bucle una vez que el movimiento es válido
        }
    }
    static boolean comprobarVictoria(char[][] tablero, int jugador) {
        // Verifica si el jugador actual ha ganado
            // Comprobar filas
            char caracterJugador;
            if (jugador == 1){
                caracterJugador = 'X';
            } else if (jugador == 2){
                caracterJugador = 'O';
            } else {
                return false;
            }
            for (int i = 0; i < 3; i++) {
                if (tablero[i][0] == caracterJugador && tablero[i][1] == caracterJugador && tablero[i][2] == caracterJugador) {
                    return true; // El jugador tiene una fila completa
                }
            }
            // Comprobar columnas
            for (int i = 0; i < 3; i++) {
                if (tablero[0][i] == caracterJugador && tablero[1][i] == caracterJugador && tablero[2][i] == caracterJugador) {
                    return true; // El jugador tiene una columna completa
                }
            }
            // Comprobar diagonales
            if (tablero[0][0] == caracterJugador && tablero[1][1] == caracterJugador && tablero[2][2] == caracterJugador) {
                return true; // Diagonal principal completa
            }
            if (tablero[0][2] == caracterJugador && tablero[1][1] == caracterJugador && tablero[2][0] == caracterJugador) {
                return true; // Diagonal secundaria completa
            }
            return false; // No hay victoria
        }

    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        
        iniciarTablero(tablero);
        mostrarTablero(tablero);
        boolean juegoActivo = true;
        while (juegoActivo) {
            int jugador = 1;
            System.out.println("Jugador " + jugador + ", es su turno:");
            leerMovimiento(tablero, jugador);
            mostrarTablero(tablero);
            if (comprobarVictoria(tablero, jugador)) {
                System.out.println("El jugador " + jugador + " ha ganado!!");
                juegoActivo = false;
            }
            jugador++;
            System.out.println("Jugador " + jugador + ", es su turno:");
            leerMovimiento(tablero, jugador);
            mostrarTablero(tablero);
            if (comprobarVictoria(tablero, jugador)) {
                System.out.println("El jugador " + jugador + " ha ganado!!");
                juegoActivo = false;
            }
        }
        System.out.println("Empate!!");
        System.out.println("Fin programa.");
    }
}
