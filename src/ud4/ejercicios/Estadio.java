package ud4.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Estadio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] estadio = new char[10][10];

        // Llenar cada fila del estadio con 'L' (asientos libres)
        for (int i = 0; i < estadio.length; i++) {
            Arrays.fill(estadio[i], 'L');
        }

        // Mostrar el estado inicial del estadio
        mostrarEstadio(estadio);

        System.out.print("Inserta la fila en la que quieres reservar: ");
        int fila = sc.nextInt();
        System.out.print("Inserta la columna en la que quieres reservar: ");
        int columna = sc.nextInt();

        reservarAsiento(fila, columna, estadio);
        mostrarEstadio(estadio);

        System.out.print("Inserta la fila en la que quieres reservar: ");
        int fila2 = sc.nextInt();
        System.out.print("Inserta la columna en la que quieres reservar: ");
        int columna2 = sc.nextInt();

        reservarAsiento(fila2, columna2, estadio);
        mostrarEstadio(estadio);

        System.out.print("Inserta la fila en la que quieres liberar: ");
        int fila3 = sc.nextInt();
        System.out.print("Inserta la columna en la que quieres liberar: ");
        int columna3 = sc.nextInt();
        liberarAsiento(fila3, columna3, estadio);

        System.out.println("Mostrar fila: ");
        mostrarFila(fila, estadio);

        contarAsientos(estadio);
    }

    static void reservarAsiento(int fila, int columna, char[][] estadio) {
        if (estadio[fila][columna] == 'L') {
            estadio[fila][columna] = 'R';
            System.out.println("Asiento reservado");
        } else {
            System.out.println("Asiento ya ocupado");
        }
    }

    static void liberarAsiento(int fila, int columna, char[][] estadio) {
        if (estadio[fila][columna] == 'R') {
            estadio[fila][columna] = 'L';
            System.out.println("Asiento liberado");
        } else {
            System.out.println("Asiento ya libre");
        }
    }

    static void mostrarFila(int fila, char[][] estadio) {
        for (int j = 0; j < estadio[0].length; j++) {
            System.out.print(estadio[fila][j] + ", ");
        }
        System.out.println(); // Para saltar a la siguiente línea
    }

    static void contarAsientos(char[][] estadio) {
        int contadorOcupado = 0;
        int contadorLibre = 0;

        for (int i = 0; i < estadio.length; i++) {
            for (int j = 0; j < estadio[0].length; j++) {
                if (estadio[i][j] == 'R') {
                    contadorOcupado++;
                } else if (estadio[i][j] == 'L') {
                    contadorLibre++;
                } else {
                    System.out.println("Error");
                }
            }
        }
        System.out.println("Asientos libres: " + contadorLibre);
        System.out.println("Asientos ocupados: " + contadorOcupado);
    }

    static void mostrarEstadio(char[][] estadio) {
        for (int i = 0; i < estadio.length; i++) {
            for (int j = 0; j < estadio[i].length; j++) {
                System.out.print(estadio[i][j] + " ");
            }
            System.out.println(); // Salto de línea para cada fila
        }
    }
}
