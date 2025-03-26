package ud4.practicaexamen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaTesouro {
    static char[][] generarMapa(int filas, int columnas) {
        char[][] mapa = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mapa[i][j] = '-';
            }
        }
        return mapa;
    }

    static int[] sortearTesoro(char[][] mapa) {
        Random rnd = new Random();
        int filaTesoro = rnd.nextInt(0,mapa.length);
        int columnaTesoro = rnd.nextInt(0,mapa[0].length);
        mapa[filaTesoro][columnaTesoro] = '*';

        return new int[]{filaTesoro, columnaTesoro};
    }

    static void imprimirMapa(char[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }

    static int maximoIntentos(char[][] mapa) {
        int casillas = mapa.length * mapa[0].length;
        return (int) Math.round(casillas * 0.1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas: ");
        int columnas = sc.nextInt();

        char[][] mapa = generarMapa(filas, columnas);
        char[][] mapaResuelto = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            mapaResuelto[i] = Arrays.copyOf(mapa[i], mapa[i].length);
        }
        int[]coordenadasTesoro = sortearTesoro(mapaResuelto);
        int filaTesoro = coordenadasTesoro[0];
        int columnaTesoro = coordenadasTesoro[1];

        System.out.println("Encuentra el tesoro:");
        imprimirMapa(mapa);
        int filaUsuario = 0;
        int columnaUsuario = 0;
        int intentosRestantes = maximoIntentos(mapa);

        do {
            System.out.print("Inserta la fila (entre 0 y " + (filas - 1) + "): ");
            filaUsuario = sc.nextInt();
            System.out.print("Inserta la columna (entre 0 y " + (columnas - 1) + "): ");
            columnaUsuario = sc.nextInt();

            if (filaUsuario < 0 || filaUsuario >= filas || columnaUsuario < 0 || columnaUsuario >= columnas) {
                System.out.println("Posición fuera del mapa. Por favor, introduce una posición válida.");
                continue;
            }

            if (filaUsuario == filaTesoro && columnaUsuario == columnaTesoro) {
                System.out.println("Felicidades!! Has encontrado el tesoro.");
            } else {
                intentosRestantes--;
                if (filaUsuario > filaTesoro && columnaUsuario > columnaTesoro) {
                    System.out.println("Pista: El tesoro está más hacia el noroeste");
                } else if (filaUsuario > filaTesoro && columnaUsuario < columnaTesoro) {
                    System.out.println("Pista: El tesoro está más hacia el noreste");
                } else if (filaUsuario < filaTesoro && columnaUsuario > columnaTesoro) {
                    System.out.println("Pista: El tesoro está más hacia el suroeste");
                } else if (filaUsuario < filaTesoro && columnaUsuario < columnaTesoro) {
                    System.out.println("Pista: El tesoro está más hacia el sureste");
                } else if (filaUsuario > filaTesoro) {
                    System.out.println("Pista: El tesoro está más hacia el norte");
                } else if (filaUsuario < filaTesoro) {
                    System.out.println("Pista: El tesoro está más hacia el sur");
                } else if (columnaUsuario > columnaTesoro) {
                    System.out.println("Pista: El tesoro está más hacia la izquierda");
                } else if (columnaUsuario < columnaTesoro) {
                    System.out.println("Pista: El tesoro está más hacia la derecha");
                }
            }
        } while ((filaUsuario != filaTesoro || columnaUsuario != columnaTesoro) && intentosRestantes > 0);

        System.out.println("Mapa con el tesoro descubierto:");
        imprimirMapa(mapaResuelto);
        System.out.println("Numero de intentos: " + intentosRestantes);
        sc.close();
    }
}
