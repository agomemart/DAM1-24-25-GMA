package ud5.mulleres;

public class Artistica extends MullerTraballadora{
    String estilo;

    public Artistica(String nombre, String apellidos, int anoNacimiento, String estilo) {
        super(nombre, apellidos, anoNacimiento);
        this.estilo = estilo;
    }
}
