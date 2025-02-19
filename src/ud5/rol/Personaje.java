package ud5.rol;

import java.util.Random;

public class Personaje {
    String nombre;
    enum raza {HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL};
    int fuerza;
    int agilidad;
    int constitucion;
    int nivel;
    int experiencia;
    int puntosVida = 50 + constitucion;

    public Personaje(String nombre, raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia, int puntosVida) {
        this.nombre = nombre;
        raza = raza;
        if (fuerza >= 1) {
            this.fuerza = fuerza;
        }
        if (agilidad >= 1) {
            this.agilidad = agilidad;
        }
        if (constitucion >= 1) {
            this.constitucion = constitucion;
        }
        if (nivel >= 1) {
            this.nivel = nivel;
        }
        this.experiencia = experiencia;
        this.puntosVida = puntosVida;
    }

    public Personaje(String nombre, raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia) {
        this.nombre = nombre;
        raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosVida = 50;
    }

    public Personaje(String nombre, raza raza) {
        Random rnd = new Random();
        this.nombre = nombre;
        raza = raza;
        this.fuerza = rnd.nextInt(1, 100);
        this.agilidad = rnd.nextInt(1, 100);
        this.constitucion = rnd.nextInt(1, 100);
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosVida = 50;
    }

    public Personaje(String nombre) {
        Random rnd = new Random();
        this.nombre = nombre;
        this.fuerza = rnd.nextInt(1, 100);
        this.agilidad = rnd.nextInt(1, 100);
        this.constitucion = rnd.nextInt(1, 100);
        this.nivel = rnd.nextInt(1, 100);
        this.experiencia = rnd.nextInt(1, 100);
        this.puntosVida = rnd.nextInt(1, 100);
    }

    public void mostrar() {
        System.out.println("Personaje{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", agilidad=" + agilidad +
                ", constitucion=" + constitucion +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", puntosVida=" + puntosVida +
                '}');
    }

    @Override
    public String toString() {
        return nombre + " (" + puntosVida + "/" + puntosVida + ")";
    }
}
