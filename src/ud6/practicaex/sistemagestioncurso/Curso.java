package ud6.practicaex.sistemagestioncurso;

import java.util.*;

public class Curso {
    private String nombre;
    private Set<Alumno> alumnos = new HashSet<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public double mediaCurso() {
        if (alumnos.isEmpty()) return  0.0;
        double suma = 0;
        for (Alumno a : alumnos) {
            suma += a.calcularMedia();
        }
        return suma / alumnos.size();
    }

    public List<Alumno> rankingAlumnos() {
       List<Alumno> lista = new ArrayList<>(alumnos);
       lista.sort((a1, a2) -> Double.compare(a2.calcularMedia(), a1.calcularMedia()));
        return lista;
    }

    public List<Alumno> alumnosAprobados(double minimo) {
        List<Alumno> aprobaodos = new ArrayList<>();
        for (Alumno a : alumnos) {
            if (a.calcularMedia() >= minimo) {
                aprobaodos.add(a);
            }
        }
        return aprobaodos;
    }

    public Map<String, Double> mapaMediaAlumnos() {
        Map<String, Double> mapa = new HashMap<>();
        for (Alumno a : alumnos) {
            mapa.put(a.getNombre(), a.calcularMedia());
        }
        return mapa;
    }
}
