package ud5.mulleres;

public class Politica extends MullerTraballadora{
    String causa;

    public Politica(String nombre, String apellidos, int anoNacimiento, String causa) {
        super(nombre, apellidos, anoNacimiento);
        this.causa = causa;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + causa;
    }
}
