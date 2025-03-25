package ud5.ejercasa.atletas;

import java.util.Arrays;

public class Competencia {
    private String nombreCompetencia;
    private Atleta[] atletas;
    private int numAtletas;

    public Competencia(String nombreCompetencia, int capacidadMax) {
        this.nombreCompetencia = nombreCompetencia;
        this.atletas = new Atleta[capacidadMax];
        this.numAtletas = 0;
    }

    public void agregarAtleta(Atleta atleta) {
        if (numAtletas >= atletas.length) {
            throw new IllegalArgumentException("No se puede agregar atleta porque no hay más espacio.");
        }
        atletas[numAtletas++] = atleta;
    }

    public void mostrarAtletas() {
        System.out.println(nombreCompetencia + ":");
        for (int i = 0; i < numAtletas; i++) {
            System.out.println(atletas[i]);
        }
    }
    public void ordenarAtletas() {
        Arrays.sort(atletas, 0, numAtletas);
    }
}
