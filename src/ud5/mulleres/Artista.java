package ud5.mulleres;

public class Artista extends MullerTraballadora{
    String estilo;

    public Artista(String nombre, String apellidos, int anoNacimiento, String estilo) {
        super(nombre, apellidos, anoNacimiento);
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + estilo;
    }
}
