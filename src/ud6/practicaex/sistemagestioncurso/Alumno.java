package ud6.practicaex.sistemagestioncurso;

import java.util.HashMap;
import java.util.Map;

public class Alumno {
    private String nombre;
    private Map<String, Double> notas = new HashMap<>();

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Map<String, Double> getNotas() {
        return notas;
    }

    public void agregarNota(String evaluacion, double nota) {
        notas.put(evaluacion, nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return 0.0;
        double suma = 0;
        for (double nota : notas.values()) {
            suma += nota;
        }
        return suma / notas.size();
    }

    @Override
    public String toString() {
        return nombre +  ", Media: " + calcularMedia();
    }
}
