package ud5.rol;

import java.util.Random;

public class Orco extends Monstruo{
    public Orco(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        super(nombre, ataque, defensa, velocidad, puntosVida);
        Random rnd = new Random();
        ataque = rnd.nextInt(30, 80);
        defensa = rnd.nextInt(30,50);
        velocidad = rnd.nextInt(30, 60);
        puntosVida = rnd.nextInt(30, 100);
    }

    public Orco() {
    }
}
