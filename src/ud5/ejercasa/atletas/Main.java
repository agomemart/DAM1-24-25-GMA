package ud5.ejercasa.atletas;

public class Main {
    public static void main(String[] args) {
        Competencia competencia = new Competencia("Carrera 100m", 5);

        // Agregar atletas
        competencia.agregarAtleta(new Atleta("Carlos", 25, 10.2));
        competencia.agregarAtleta(new Atleta("Ana", 23, 9.8));
        competencia.agregarAtleta(new Atleta("Luis", 27, 10.5));
        competencia.agregarAtleta(new Atleta("Beatriz", 22, 10.2)); // Mismo tiempo que Carlos
        competencia.agregarAtleta(new Atleta("Pedro", 30, 9.8)); // Mismo tiempo que Ana

        // Mostrar antes de ordenar
        competencia.mostrarAtletas();

        // Ordenar atletas
        competencia.ordenarAtletas();

        // Mostrar después de ordenar
        System.out.println("Atletas ordenados por tiempo:");
        competencia.mostrarAtletas();
    }
}