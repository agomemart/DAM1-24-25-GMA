package ud5.rol;

import java.util.Random;

public class Aranha extends Monstruo{
    public Aranha(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        super(nombre, ataque, defensa, velocidad, puntosVida);
        Random rnd = new Random();
        ataque = rnd.nextInt(10, 50);
        defensa = rnd.nextInt(20,40);
        velocidad = rnd.nextInt(40, 70);
        puntosVida = rnd.nextInt(30, 80);
    }
}
