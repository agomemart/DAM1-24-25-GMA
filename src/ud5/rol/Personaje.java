package ud5.rol;

import java.util.Random;

class PersonajeNoValidoException extends Exception {
    public PersonajeNoValidoException(String mensaje) {
        super(mensaje);
    }
}

enum Raza {HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL;}

public class Personaje {
    private String nombre;
    private Raza raza;
    private int fuerza;
    private int agilidad;
    private int constitucion;
    private int inteligencia;
    private int intuicion;
    private int presencia;
    private int nivel;
    private int experiencia;
    private int puntosVida;

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int inteligencia, int intuicion, int presencia, int nivel, int experiencia) throws PersonajeNoValidoException {
        if (fuerza < 1 || agilidad < 1 || constitucion < 1 || inteligencia < 1 || intuicion < 1 || presencia < 1) {
            throw new PersonajeNoValidoException("Las características deben ser mayores o iguales a 1.");
        }
        if (nivel < 1) {
            throw new PersonajeNoValidoException("El nivel debe ser al menos 1.");
        }
        if (experiencia < 0) {
            throw new PersonajeNoValidoException("La experiencia no puede ser negativa.");
        }

        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.intuicion = intuicion;
        this.presencia = presencia;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.puntosVida = 50 + constitucion;
    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int inteligencia, int intuicion, int presencia) throws PersonajeNoValidoException {
        this(nombre, raza, fuerza, agilidad, constitucion, inteligencia, intuicion, presencia, 1, 0);
    }

    public Personaje(String nombre, Raza raza) {
        Random rnd = new Random();
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = Math.max(1, rnd.nextInt(100));
        this.agilidad = Math.max(1, rnd.nextInt(100));
        this.constitucion = Math.max(1, rnd.nextInt(100));
        this.inteligencia = Math.max(1, rnd.nextInt(100));
        this.intuicion = Math.max(1, rnd.nextInt(100));
        this.presencia = Math.max(1, rnd.nextInt(100));
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosVida = 50 + this.constitucion;
    }

    public Personaje(String nombre) {
        this(nombre, Raza.HUMANO);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Agilidad: " + agilidad);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Intuición: " + intuicion);
        System.out.println("Presencia: " + presencia);
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Puntos de Vida: " + puntosVida);
    }

    @Override
    public String toString() {
        return nombre + " (" + puntosVida + "/" + (50 + constitucion) + ")";
    }
}

