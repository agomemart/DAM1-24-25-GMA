package ud5.ejercasa.juegomesa;

public class Ajedrez extends JuegoMesa{
    public Ajedrez(String nombreJuego, int minJugadores, int maxJugadores) {
        super("Ajedrez", 2, 2);
    }

    @Override
    public boolean jugar(int numJugadores) {
        if (numJugadores != 2) {
            System.out.println("El ajedrez solo puede jugarse con 2 jugadores.");
            return false;
        }
        System.out.println("El jugador X ganó la partida de Ajedrez contra Y");
        return true;
    }

}
