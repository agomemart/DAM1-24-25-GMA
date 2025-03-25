package ud5.ejercasa.juegomesa;

public abstract class JuegoMesa implements Jugable {
    private String nombreJuego;
    private int minJugadores;
    private int maxJugadores;

    public JuegoMesa(String nombreJuego, int minJugadores, int maxJugadores) {
        if (minJugadores < 2 || maxJugadores < minJugadores) {
            throw new IllegalArgumentException("El número de jugadores es inválido. Debe ser al menos 2 y maxJugadores >= minJugadores.");
        }
        this.nombreJuego = nombreJuego;
        this.minJugadores = minJugadores;
        this.maxJugadores = maxJugadores;
    }

    public abstract boolean jugar(int numJugadores);

    public String getNombreJuego() {
        return nombreJuego;
    }

    public int getMinJugadores() {
        return minJugadores;
    }

    public int getMaxJugadores() {
        return maxJugadores;
    }

    @Override
    public String toString() {
        return  "nombreJuego='" + nombreJuego + '\'' +
                ", minJugadores=" + minJugadores +
                ", maxJugadores=" + maxJugadores +
                '}';
    }
}
