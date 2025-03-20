package ud5.bingo;

import java.util.*;

public class Bingo {
    static final int MAX_NUM = 99;
    static Jugador[] jugadores;
    static int[] numerosSorteados = new int[0];
    static boolean linea = false;
    static boolean bingo = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BINGO");
        System.out.println("-------");

        System.out.print("Número de jugadores: ");
        int numJugadores = sc.nextInt();
        sc.nextLine(); // Limpieza del buffer

        jugadores = new Jugador[numJugadores];
        System.out.println("Introduce los datos de los jugadores:");

        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Número de cartones: ");
            int numCartones = sc.nextInt();
            sc.nextLine(); // Limpieza del buffer

            jugadores[i] = new Jugador(nombre, numCartones);
            System.out.println(jugadores[i]);
        }

        System.out.println("Comienza el juego");
        System.out.println("-------------------");

        System.out.println("¿Qué modalidad prefieres? (A = Automático / M = Manual): ");
        String opcion = sc.nextLine().toUpperCase();

        if (opcion.equals("A")) {
            modoAutomatico();
        } else {
            modoNumeroANumero(sc);
        }

        sc.close();
    }

    private static void modoAutomatico() {
        System.out.println("Modo automático activado");
        while (!bingo) {
            sortearNumero();
            verificarCartones();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void modoNumeroANumero(Scanner sc) {
        while (!bingo) {
            System.out.println("Presiona ENTER para sortear un número...");
            sc.nextLine();
            sortearNumero();
            verificarCartones();
        }
    }

    private static void sortearNumero() {
        Random rnd = new Random();
        int numRandom;
        boolean repetido;
        do {
            numRandom = rnd.nextInt(MAX_NUM) + 1;
            repetido = false;
            for (int num : numerosSorteados) {
                if (num == numRandom) {
                    repetido = true;
                    break;
                }
            }
        } while (repetido);

        numerosSorteados = Arrays.copyOf(numerosSorteados, numerosSorteados.length + 1);
        numerosSorteados[numerosSorteados.length - 1] = numRandom;
        System.out.println("Número que sale del bombo: " + numRandom);
    }

    private static void verificarCartones() {
        for (Jugador jugador : jugadores) {
            if (jugador.verificarLinea(numerosSorteados) && !linea) {
                System.out.println("¡" + jugador.nombre + " ha cantado línea!");
                linea = true;
            }
            if (jugador.verificarBingo(numerosSorteados)) {
                System.out.println("¡" + jugador.nombre + " ha ganado el BINGO!");
                bingo = true;
                break;
            }
        }
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

    public boolean verificarLinea(int[] numerosSorteados) {
        for (Carton carton : cartones) {
            if (carton.tieneLinea(numerosSorteados)) return true;
        }
        return false;
    }

    public boolean verificarBingo(int[] numerosSorteados) {
        for (Carton carton : cartones) {
            if (carton.tieneBingo(numerosSorteados)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + ", Número de cartones: " + cartones.length;
    }
}

class Carton {
    static final int MAX_FILAS = 3;
    static final int MAX_COL = 5;

    int[][] numeros;

    public Carton() {
        this.numeros = new int[MAX_FILAS][MAX_COL];
        int[] generados = new int[MAX_FILAS * MAX_COL];
        int count = 0;
        Random rnd = new Random();

        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                int numRandom;
                boolean repetido;
                do {
                    numRandom = rnd.nextInt(Bingo.MAX_NUM) + 1;
                    repetido = false;
                    for (int k = 0; k < count; k++) {
                        if (generados[k] == numRandom) {
                            repetido = true;
                            break;
                        }
                    }
                } while (repetido);

                generados[count++] = numRandom;
                numeros[i][j] = numRandom;
            }
        }
    }

    public boolean tieneLinea(int[] numerosSorteados) {
        for (int i = 0; i < MAX_FILAS; i++) {
            boolean completa = true;
            for (int j = 0; j < MAX_COL; j++) {
                if (!contiene(numerosSorteados, numeros[i][j])) {
                    completa = false;
                    break;
                }
            }
            if (completa) return true;
        }
        return false;
    }

    public boolean tieneBingo(int[] numerosSorteados) {
        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                if (!contiene(numerosSorteados, numeros[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean contiene(int[] array, int num) {
        for (int i : array) {
            if (i == num) return true;
        }
        return false;
    }
}