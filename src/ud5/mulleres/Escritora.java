package ud5.mulleres;

public class Escritora extends MullerTraballadora{
    String obraMaestra;
    public Escritora(String nombre, String apellidos, int anoNacimiento, String obraMaestra) {
        super(nombre, apellidos, anoNacimiento);
        this.obraMaestra = obraMaestra;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + obraMaestra;
    }
}
