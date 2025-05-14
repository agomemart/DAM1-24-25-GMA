package ud6.practicaex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(edad, o.edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("María", 20));
        personas.add(new Persona("Pepa", 18));
        personas.add(new Persona("Ana", 18));
        personas.add(new Persona("Luis", 22));
        personas.add(new Persona("Pepe", 19));

        Collections.sort(personas);
        System.out.println(personas);

        Comparator<Persona> compPersona = (p1, p2) -> p1.nombre.compareTo(p2.nombre);
        Collections.sort(personas, compPersona);
        System.out.println(personas);

        Comparator<Persona> compEdadNombre = (p1, p2) -> {
            int res = p1.edad - p2.edad;
            if (res == 0) {
                res = p1.nombre.compareTo(p2.nombre);
            }
            return res;
        };
        Collections.sort(personas, compEdadNombre);
        System.out.println(personas);
    }
}