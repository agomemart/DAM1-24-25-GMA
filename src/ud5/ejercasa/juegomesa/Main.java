package ud5.ejercasa.juegomesa;

public class Main {
    public static void main(String[] args) {
        // Crear un torneo
        Torneo torneo = new Torneo("Torneo Internacional", 5);

        // Agregar juegos al torneo
        torneo.agregarJuego(new Ajedrez("Ajedrez",2,2));
        torneo.agregarJuego(new Poker("Poker",2,6));

        // Jugar torneo con diferentes números de jugadores
        torneo.jugarTorneo(2); // Ajedrez correcto, Poker correcto
        torneo.jugarTorneo(4); // Ajedrez error, Poker correcto
    }
}
