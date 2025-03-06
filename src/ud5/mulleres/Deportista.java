package ud5.mulleres;

public class Deportista extends MullerTraballadora{
    String hitoHistorico;

    public Deportista(String nombre, String apellidos, int anoNacimiento, String hitoHistorico) {
        super(nombre, apellidos, anoNacimiento);
        this.hitoHistorico = hitoHistorico;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + hitoHistorico;
    }
}
