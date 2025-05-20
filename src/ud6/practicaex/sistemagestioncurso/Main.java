package ud6.practicaex.sistemagestioncurso;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación");

        Alumno ana = new Alumno("Ana");
        ana.agregarNota("Examen1", 6.5);
        ana.agregarNota("Examen2", 7.0);

        Alumno luis = new Alumno("Luis");
        luis.agregarNota("Examen1", 4.0);
        luis.agregarNota("Examen2", 5.5);

        curso.agregarAlumno(ana);
        curso.agregarAlumno(luis);

        System.out.println("Ranking:");
        curso.rankingAlumnos().forEach(System.out::println);

        System.out.println("Aprobados:");
        curso.alumnosAprobados(5.0).forEach(System.out::println);

        System.out.println("Media del curso: " + curso.mediaCurso());
    }
}
