package ud5.rol;

import java.util.Random;

public class Troll extends Monstruo{
    public Troll(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        super(nombre, ataque, defensa, velocidad, puntosVida);
        Random rnd = new Random();
        ataque = rnd.nextInt(60, 120);
        defensa = rnd.nextInt(50,70);
        velocidad = rnd.nextInt(20, 40);
        puntosVida = rnd.nextInt(100, 200);
    }

    public Troll() {
    }
}
