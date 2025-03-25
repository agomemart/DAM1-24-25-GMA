package ud5.ejercasa.atletas;

import java.util.Objects;

public class Atleta implements Comparable{
    private String nombre;
    private int edad;
    private double tiempoCarrera;

    public Atleta(String nombre, int edad, double tiempoCarrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.tiempoCarrera = tiempoCarrera;
    }

    @Override
    public int compareTo(Object o) {
        Atleta atleta = (Atleta) o;
        if (this.tiempoCarrera != atleta.tiempoCarrera) {
            return Double.compare(this.tiempoCarrera, atleta.tiempoCarrera);

        } else {
            return this.nombre.compareTo(atleta.nombre);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Atleta)) return false;
        Atleta atleta = (Atleta) obj;
        return edad == atleta.edad &&
                Double.compare(atleta.tiempoCarrera, tiempoCarrera) == 0 &&
                Objects.equals(nombre, atleta.nombre);
    }

    @Override
    public String toString() {
        return nombre + " - " + edad + " años - " + tiempoCarrera + "s";
    }
}
