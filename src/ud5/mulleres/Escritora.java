package ud5.mulleres;

public class Escritora extends MullerTraballadora implements IPioneira{
    String obraMaestra;
    public Escritora(String nombre, String apellidos, int anoNacimiento, String obraMaestra) {
        super(nombre, apellidos, anoNacimiento);
        this.obraMaestra = obraMaestra;
    }

    @Override
    public String descrContrib() {
        return "";
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + obraMaestra;
    }
}
