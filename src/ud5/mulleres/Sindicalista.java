package ud5.mulleres;

public class Sindicalista extends MullerTraballadora{
    String movimientoDefendido;

    public Sindicalista(String nombre, String apellidos, int anoNacimiento, String movimientoDefendido) {
        super(nombre, apellidos, anoNacimiento);
        this.movimientoDefendido = movimientoDefendido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + movimientoDefendido;
    }
}
