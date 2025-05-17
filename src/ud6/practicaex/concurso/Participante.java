package ud6.practicaex.concurso;

public class Participante implements Comparable<Participante>{
    private String nombre;
    private String lenguajeFavorito;
    private int puntos;

    public Participante(String nombre, String lenguajeFavorito, int puntos) {
        this.nombre = nombre;
        this.lenguajeFavorito = lenguajeFavorito;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLenguajeFavorito() {
        return lenguajeFavorito;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public int compareTo(Participante o) {
        int cmp = Integer.compare(o.puntos, this.puntos); // descendente
        if (cmp == 0) {
            cmp = this.nombre.compareTo(o.nombre);
        }
        return cmp;
    }
}
