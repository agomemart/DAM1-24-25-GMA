package ud6.practicaex.biblioteca;

import java.util.Set;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private Set<String> generos;

    public Libro(String titulo, String autor, int anoPublicacion, Set<String> generos) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.generos = generos;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public Set<String> getGeneros() {
        return generos;
    }

    @Override
    public String toString() {
        return titulo + " (" + anoPublicacion + ")";
    }

    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareTo(o.titulo);
    }
}
