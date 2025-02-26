package ud5.rol;

import java.util.Random;

public class Monstruo{
    String nombre;
    int ataque, defensa, velocidad, puntosVida;

    public Monstruo(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.puntosVida = puntosVida;
    }
    
    void atacar(Monstruo m) {

    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Putos de vida: " + puntosVida);
    }

    public boolean perderVida(int puntos) {
        puntosVida -= puntos;
        return puntosVida <= 0;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public int atacar(Personaje enemigo) {
        Random rnd = new Random();
        int ataqueTotal = ataque + rnd.nextInt(100) + 1;
        int defensaTotal = enemigo.agilidad + rnd.nextInt(100) + 1;
        int dano = Math.max(0, ataqueTotal - defensaTotal);
        dano = Math.min(dano, enemigo.puntosVida);
        enemigo.perderVida(dano);
        return dano;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public static Monstruo generaMonstruoAleatorio() {
        Random rnd = new Random();
        int prob = rnd.nextInt(100);
        if (prob < 40) {
            Orco orco = new Orco();
            return orco;
        } else if (prob < 70) {
            Aranha aranha = new Aranha();
            return aranha;
        } else if (prob < 90) {
            Troll troll = new Troll();
            return troll;
        } else {
            Dragon dragon = new Dragon();
            return dragon;
        }
    }

    @Override
    public String toString() {
        if (nombre != null) {
            return nombre + getClass() + "(" + puntosVida + ")";
        } else {
            return getClass() + "(" + puntosVida + ")";
        }
    }

    public Monstruo() {
    }
}
