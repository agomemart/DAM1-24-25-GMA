package ud6.practicaex.rankingvideojuegos;

public class Videojuego implements Comparable<Videojuego>{
    private String titulo;
    private String plataforma;
    private double puntuacion;

    public Videojuego(String titulo, String plataforma, double puntuacion) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.puntuacion = puntuacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    @Override
    public int compareTo(Videojuego o) {
        if (this.puntuacion > o.puntuacion) {
            return -1;
        }
        return titulo.compareTo(o.titulo);
    }
}
