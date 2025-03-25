package ud5.ejercasa.juegomesa;

import java.util.Arrays;

public class Torneo {
    private String nombreTorneo;
    private JuegoMesa[] juegos;
    private int numJuegos;

    public Torneo(String nombreTorneo, int capacidadMaxima) {
        this.nombreTorneo = nombreTorneo;
        this.juegos = new JuegoMesa[capacidadMaxima];
        this.numJuegos = 0;
    }

    public boolean agregarJuego(JuegoMesa juego) {
        if (numJuegos >= juegos.length) {
            System.out.println("El torneo está lleno.");
            return false;
        }
        juegos[numJuegos++] = juego;
        return true;
    }

    public void jugarTorneo(int numJugadores) {
        if (numJuegos == 0) {
            System.out.println("No hay juegos en el torneo.");
            return;
        }
        System.out.println("Iniciando torneo: " + nombreTorneo);
        for (int i = 0; i < numJuegos; i++) {
            System.out.println("Jugando: " + juegos[i].getNombreJuego());
            Partida partida = new Partida(juegos[i], numJugadores);
            partida.jugar();
        }
    }

    @Override
    public String toString() {
        return "nombreTorneo='" + nombreTorneo + '\'' +
                ", juegos=" + Arrays.toString(juegos) +
                ", numJuegos=" + numJuegos +
                '}';
    }

    private class Partida {
        private JuegoMesa juego;
        private int numJugadores;

        public Partida(JuegoMesa juego, int numJugadores) {
            this.juego = juego;
            this.numJugadores = numJugadores;
        }

        public void jugar() {
            if (!juego.jugar(numJugadores)) {
                System.out.println("Partida no válida.");
            } else {
                System.out.println("Partida finalizada: " + juego.getNombreJuego());
            }
        }
    }
}
