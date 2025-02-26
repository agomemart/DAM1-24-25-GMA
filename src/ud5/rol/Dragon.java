package ud5.rol;

import java.util.Random;

public class Dragon extends Monstruo{
    public Dragon(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        super(nombre, ataque, defensa, velocidad, puntosVida);
        Random rnd = new Random();
        ataque = rnd.nextInt(100, 200);
        defensa = rnd.nextInt(60,100);
        velocidad = rnd.nextInt(80, 120);
        puntosVida = rnd.nextInt(120, 250);
    }

    public Dragon() {
    }
}
