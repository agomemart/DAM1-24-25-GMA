package ud5.mulleres;

public class Cientifica extends MullerTraballadora{
    String descubrimiento;
    public Cientifica(String nombre, String apellidos, int anoNacimiento, String descubrimiento) {
        super(nombre, apellidos, anoNacimiento);
        this.descubrimiento = descubrimiento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + descrContrib;
    }
}
