package ud4.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    private static final int TAMAÑO = 10;
    private static final int NUM_MINAS = 10;
    private char[][] tablero;
    private boolean[][] minas;
    private boolean[][] descubiertas;

    public Buscaminas() {
        tablero = new char[TAMAÑO][TAMAÑO];
        minas = new boolean[TAMAÑO][TAMAÑO];
        descubiertas = new boolean[TAMAÑO][TAMAÑO];
        inicializarTablero();
        colocarMinas();
    }

    private void inicializarTablero() {
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    private void colocarMinas() {
        Random random = new Random();
        int minasColocadas = 0;
        
        while (minasColocadas < NUM_MINAS) {
            int fila = random.nextInt(TAMAÑO);
            int columna = random.nextInt(TAMAÑO);
            
            if (!minas[fila][columna]) {
                minas[fila][columna] = true;
                minasColocadas++;
            }
        }
    }

    private int contarMinasAdyacentes(int fila, int columna) {
        int contador = 0;
        for (int i = Math.max(0, fila - 1); i < Math.min(TAMAÑO, fila + 2); i++) {
            for (int j = Math.max(0, columna - 1); j < Math.min(TAMAÑO, columna + 2); j++) {
                if (minas[i][j]) contador++;
            }
        }
        return contador;
    }

    private void descubrirCasilla(int fila, int columna) {
        if (fila < 0 || fila >= TAMAÑO || columna < 0 || columna >= TAMAÑO || descubiertas[fila][columna]) {
            return;
        }

        descubiertas[fila][columna] = true;
        
        if (minas[fila][columna]) {
            tablero[fila][columna] = 'X';
            return;
        }

        int minasAlrededor = contarMinasAdyacentes(fila, columna);
        
        if (minasAlrededor == 0) {
            tablero[fila][columna] = '.';
            // Descubrir casillas adyacentes si no hay minas alrededor
            for (int i = fila - 1; i <= fila + 1; i++) {
                for (int j = columna - 1; j <= columna + 1; j++) {
                    descubrirCasilla(i, j);
                }
            }
        } else {
            tablero[fila][columna] = (char) (minasAlrededor + '0');
        }
    }

    private void mostrarTablero() {
        System.out.print("  ");
        for (int j = 0; j < TAMAÑO; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < TAMAÑO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMAÑO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            mostrarTablero();
            
            System.out.print("Introduce fila (0-9): ");
            int fila = scanner.nextInt();
            System.out.print("Introduce columna (0-9): ");
            int columna = scanner.nextInt();

            if (fila < 0 || fila >= TAMAÑO || columna < 0 || columna >= TAMAÑO) {
                System.out.println("Coordenadas inválidas. Inténtalo de nuevo.");
                continue;
            }

            descubrirCasilla(fila, columna);

            if (minas[fila][columna]) {
                System.out.println("¡Has pisado una mina! Fin del juego.");
                mostrarTableroConMinas();
                juegoTerminado = true;
            }

            if (verificarVictoria()) {
                System.out.println("¡Felicidades! Has ganado el juego.");
                juegoTerminado = true;
            }
        }
        scanner.close();
    }

    private void mostrarTableroConMinas() {
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                if (minas[i][j]) {
                    tablero[i][j] = 'M';
                }
            }
        }
        mostrarTablero();
    }

    private boolean verificarVictoria() {
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                if (!minas[i][j] && !descubiertas[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Buscaminas juego = new Buscaminas();
        juego.jugar();
    }
}