package ud6.practicaex.concursoinventores;

import java.util.HashSet;
import java.util.Set;

public class Invento implements Comparable<Invento>{
    private String nombre;
    private Set<String> materiales = new HashSet<>();
    private int nivelComplejidad;

    public Invento(String nombre, Set<String> materiales, int nivelComplejidad) {
        this.nombre = nombre;
        this.materiales = materiales;
        this.nivelComplejidad = nivelComplejidad;
    }

    public int getNivelComplejidad() {
        return nivelComplejidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getMateriales() {
        return materiales;
    }

    @Override
    public int compareTo(Invento o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + nivelComplejidad + ")";
    }
}
