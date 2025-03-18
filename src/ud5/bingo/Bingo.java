package ud5.bingo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    static int MAX_NUM= 99;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BINGO");
        System.out.println("-------");

        System.out.print("Número de jugadores: ");
        int numJugadores = sc.nextInt();

        System.out.println("Introduce los datos de los jugadores:");

        for (int i = 0; i <= numJugadores; i++) {
            sc.nextLine(); //Limpieza del buffer
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Número de cartones: ");
            int numCartones = sc.nextInt();
            System.out.println();

            Jugador jugador = new Jugador(nombre, numCartones);
            //jugadores[i + 1];
            System.out.println(jugador);
        }

        System.out.println("Comienza el juego");
        System.out.println("-------------------");

        System.out.println("Que modalidad prefieres? N o ");
        String opcion = sc.nextLine().toUpperCase();
    }
}
class Jugador {
    String nombre;
    Carton[] cartones;

    public Jugador(String nombre, int numCartones) {
        this.nombre = nombre;
        cartones = new Carton[numCartones];
        for (int i = 0; i < cartones.length; i++) {
            cartones[i] = new Carton();
        }
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + ", Número de cartones: " + cartones.length + 1;
    }
}

class Carton {
    static final int MAX_FILAS=3;
    static final int MAX_COL= 5;

    int[][] numeros;

    public Carton() {
        this.numeros = new int [MAX_FILAS][MAX_COL];

        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                Random rnd = new Random();
                //Falata comprobar que el num no está repetido
                numeros[i][j] = rnd.nextInt(Bingo.MAX_NUM) + 1;
            }
        }
    }
}
