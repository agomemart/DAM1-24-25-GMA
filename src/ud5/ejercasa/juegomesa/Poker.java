package ud5.ejercasa.juegomesa;

public class Poker extends JuegoMesa {

    public Poker(String nombreJuego, int minJugadores, int maxJugadores) {
        super("Poker", 2, 6);
    }

    @Override
    public boolean jugar(int numJugadores) {
        if (numJugadores < 2 || numJugadores > 6) {
            System.out.println("Se necesita entre 2 y 6 jugadores para jugar al poker.");
            return false;
        }
        System.out.println("El jugador X ganó la partida de poker entre Y jugadores.");
        return true;
    }
}
