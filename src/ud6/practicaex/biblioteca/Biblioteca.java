package ud6.practicaex.biblioteca;

import java.util.*;

public class Biblioteca {
    private Set<Libro> libros;

    public Biblioteca(Set<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro l1) {
        libros.add(l1);
    }

    public Set<Libro> buscarPorGenero(String genero) {
        Set<Libro> librosGenero = new HashSet<>();
        for (Libro libro : libros) {
            if (libro.getGeneros().contains(genero.toLowerCase())) {
                librosGenero.add(libro);
            }
        }
        return librosGenero;
    }

        public List<Libro> liborsOrdenadosPorAno () {
            List<Libro> librosOrdenados = new ArrayList<>(libros);
            librosOrdenados.sort((o1, o2) -> o1.getAnoPublicacion() - o2.getAnoPublicacion());
            return librosOrdenados;
        }

        public List<Libro> librosDelAutor (String autor){
            List<Libro> resultado = new ArrayList<>();
            for (Libro l : libros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    resultado.add(l);
                }
            }
            return resultado;
        }
    }