package ud5.bingo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    static int MAX_NUM = 99;
    static Jugador[] jugadores;
    static int[] numeros = new int[0];
    static boolean linea = false;
    static boolean bingo = false;

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
            //jugadores[i - 1];
            System.out.println(jugador);
        }

        System.out.println("Comienza el juego");
        System.out.println("-------------------");

        System.out.println("Que modalidad prefieres? N o ");
        String opcion = sc.nextLine().toUpperCase();
    }

    private static void modoAutomatico() {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    private static void modoNumeroANumero() {
        do {
            int numero = sortearNumero();
            System.out.println("Número que sale del bombo: " + numero);
            System.out.println("númeors sorteados: " + Arrays.toString(numeros));
            Carton.revisarCartonesJugadores();
            System.out.println("Pulsa ENTER para continuar");
            new Scanner(System.in).nextLine();
        } while (!bingo);
    }

    private static int sortearNumero() {
        Random rnd = new Random();
        int numRandom;
        boolean repetido;
        do {
            numRandom = rnd.nextInt(MAX_NUM) + 1;
            repetido = false;
            int i = 0;
            while (i < numeros.length && !repetido) {
                if (numeros[i] == numRandom)
                    repetido = true;
                i++;
            }
        } while (repetido);

        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = numRandom;

        return numRandom;
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

    static int[][] numeros;

    public Carton() {
        this.numeros = new int [MAX_FILAS][MAX_COL];

        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                Random rnd = new Random();
                boolean repetido = false;
                int numRandom;
                do {
                    numRandom = rnd.nextInt(Bingo.MAX_NUM) + 1;
                    int ii = 0;
                    while (ii <= i && !repetido) {
                        int jj = 0;
                        while (jj <= MAX_COL && !repetido) {
                            if (numeros[ii][jj] == numRandom)
                                repetido = true;
                            jj++;
                        }
                        ii++;
                    }
                } while(repetido);
                numeros[i][j] = numRandom;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                str.append(numeros[i][j] + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }
    public int revisarCarton(int[][] numerosSorteo) {
        Arrays.sort(numerosSorteo);
        Arrays.sort(numeros);
        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COL; j++) {
               /* if (numeros[i][0] == numerosSorteo[i] || numeros[i][1] == numerosSorteo[i] || numeros[i][2] == numerosSorteo[i]) {
                    return 1;
                } else if (numeros[i][0] == numerosSorteo[i] && numeros[i][1] == numerosSorteo[i] && numeros[i][2] == numerosSorteo[i]) {
                    return 2;
                }*/
            }
        }
        return 0;
    }
    static void revisarCartonesJugadores() {
        boolean nuevaLinea = false;
        boolean nuevoBingo = false;
        for (Jugador jugador : Bingo.jugadores) {
            for (Carton carton : jugador.cartones) {
                switch (carton.revisarCarton(numeros)) {
                    case 0: break;
                    case 1:
                        if (!Bingo.linea) {
                            System.out.println(jugador.nombre + " canta línea");
                            System.out.println(carton);
                            nuevaLinea = true;
                        }
                        break;
                    case 2:
                        if (!Bingo.bingo) {
                            System.out.println(jugador.nombre + " canta bingo");
                            System.out.println(carton);
                            nuevoBingo = true;
                        }
                }
            }
        }
        if (nuevaLinea)
            Bingo.linea = true;
    }
}
